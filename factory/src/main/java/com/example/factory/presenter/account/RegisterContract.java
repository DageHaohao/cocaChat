package com.example.factory.presenter.account;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: RegisterContract
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/17
 */
public interface RegisterContract {

    interface View extends BaseContract.View<Presenter> {
        // 注册成功
        void registerSuccess();

    }



    interface Presenter extends BaseContract.Presenter{
        // 发起一个注册
        void register(String phone,String name,String password);

        // 检查手机号是否正确
        boolean checkMobile(String phone);
    }

}
