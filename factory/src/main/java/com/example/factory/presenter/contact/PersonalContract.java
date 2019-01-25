package com.example.factory.presenter.contact;

import com.example.factory.modle.db.User;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: PersonalContract
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/25
 */
public interface PersonalContract {
    interface Presenter extends BaseContract.Presenter {
        // 获取用户信息
        User getUserPersonal();
    }

    interface View extends BaseContract.View<Presenter> {
        String getUserId();

        // 加载数据完成
        void onLoadDone(User user);

        // 是否发起聊天
        void allowSayHello(boolean isAllow);

        // 设置关注状态
        void setFollowStatus(boolean isFollow);
    }
}