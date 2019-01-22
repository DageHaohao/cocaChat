package com.example.factory.presenter.user;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: UpdateInfoContract
 * @ProjectName cocaChat
 * @Description: TODO 更新用户信息的基本的契约
 * @date 2019/1/22
 */
public interface UpdateInfoContract {

    interface Presenter extends BaseContract.Presenter{
        // 更新
        void update(String photoFilePath, String desc, boolean isMan);
    }

    interface View extends BaseContract.View<Presenter>{
        // 回调成功
        void updateSucceed();
    }

}
