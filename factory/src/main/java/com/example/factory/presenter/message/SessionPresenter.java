package com.example.factory.presenter.message;

import android.support.v7.util.DiffUtil;

import com.example.factory.data.message.SessionDataSource;
import com.example.factory.data.message.SessionRepository;
import com.example.factory.modle.db.Session;
import com.example.factory.presenter.BaseSourcePresenter;
import com.example.factory.utils.DiffUiDataCallback;

import java.util.List;

/**
 * @author 91319
 * @Title: SessionPresenter
 * @ProjectName cocaChat
 * @Description: TODO 最近聊天列表的Presenter
 * @date 2019/2/12
 */
public class SessionPresenter extends BaseSourcePresenter<Session,Session,
        SessionDataSource,SessionContract.View>
        implements SessionContract.Presenter {

    public SessionPresenter(SessionContract.View view) {
        super(new SessionRepository(), view);
    }

    @Override
    public void onDataLoaded(List<Session> sessions) {

        SessionContract.View view = getView();
        if(view==null)
            return;

        // 差异对比
        List<Session> old = view.getRecyclerAdapter().getItems();
        DiffUiDataCallback<Session> callback = new DiffUiDataCallback<>(old, sessions);
        DiffUtil.DiffResult result = DiffUtil.calculateDiff(callback);

        // 刷新界面
        refreshData(result, sessions);
    }
}
