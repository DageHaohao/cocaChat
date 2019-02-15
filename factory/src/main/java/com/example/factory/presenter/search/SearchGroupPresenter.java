package com.example.factory.presenter.search;

import com.example.factory.data.helper.GroupHelper;
import com.example.factory.modle.card.GroupCard;

import net.qiujuer.genius.kit.handler.Run;
import net.qiujuer.genius.kit.handler.runable.Action;

import java.util.List;

import hjh.factory.data.DataSource;
import hjh.factory.presenter.BasePresenter;
import retrofit2.Call;

/**
 * @author 91319
 * @Title: SearchGroupPresenter
 * @ProjectName cocaChat
 * @Description: 搜索群的逻辑实现
 * @date 2019/1/23
 */
public class SearchGroupPresenter extends BasePresenter<SearchContract.GroupView>
        implements SearchContract.Presenter,DataSource.Callback<List<GroupCard>> {

    //定义一个搜索的call 支持重复搜索
    private Call searchCall;

    public SearchGroupPresenter(SearchContract.GroupView view) {
        super(view);
    }

    @Override
    public void search(String content) {

        start();

        Call call = searchCall;
        if(call!=null&&!call.isCanceled()){
            // 如果有上一次的请求，并且没有取消，
            // 则调用取消请求操作
            call.cancel();
        }

        searchCall = GroupHelper.search(content, this);

    }

    @Override
    public void onDataLoaded(final List<GroupCard> groupCards) {
        // 搜索成功
        final SearchContract.GroupView view = getView();
        if (view != null) {
            Run.onUiAsync(new Action() {
                @Override
                public void call() {
                    view.onSearchDone(groupCards);
                }
            });
        }
    }

    @Override
    public void onDataNotAvailable(final int strRes) {

        // 搜索失败
        final SearchContract.GroupView view = getView();
        if (view != null) {
            Run.onUiAsync(new Action() {
                @Override
                public void call() {
                    view.showError(strRes);
                }
            });
        }
    }
}
