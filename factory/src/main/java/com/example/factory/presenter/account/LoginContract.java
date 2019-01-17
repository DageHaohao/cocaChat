package com.example.factory.presenter.account;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: LoginContract
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/17
 */
public interface LoginContract {

    interface View extends BaseContract.View<Presenter>{
        // 登录成功
        void loginSuccess();
    }

    interface Presenter extends BaseContract.Presenter {
        //发起一个登陆
        void login(String phone,String password);
    }

}
