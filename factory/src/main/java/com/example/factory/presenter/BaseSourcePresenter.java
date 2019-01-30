package com.example.factory.presenter;

import java.util.List;

import hjh.factory.data.DataSource;
import hjh.factory.data.DbDataSource;
import hjh.factory.presenter.BaseContract;
import hjh.factory.presenter.BaseRecyclerPresenter;

/**
 * @author 91319
 * @Title: BaseSourcePresenter
 * @ProjectName cocaChat
 * @Description: TODO 基础的仓库源的Presenter定义
 * @date 2019/1/30
 */
public abstract class BaseSourcePresenter<Data, ViewModel,
        Source extends DbDataSource<Data>,
        View extends BaseContract.RecyclerView>
        extends BaseRecyclerPresenter<ViewModel, View>
        implements DataSource.SucceedCallback<List<Data>> {

    protected Source mSource;

    public BaseSourcePresenter(Source source, View view) {
        super(view);
        this.mSource = source;
    }

    @Override
    public void start() {
        super.start();
        if (mSource != null)
            mSource.load(this);
    }

    @Override
    public void destroy() {
        super.destroy();
        mSource.dispose();
        mSource = null;
    }
}
