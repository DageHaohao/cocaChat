package com.example.factory.presenter.account;

import com.example.factory.modle.db.User;

import hjh.factory.data.DataSource;
import hjh.factory.presenter.BasePresenter;

/**
 * @author 91319
 * @Title: LoginPresenter
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/17
 *
 * 登录的逻辑实现
 */
public class LoginPresenter extends BasePresenter<LoginContract.View>
        implements LoginContract.Presenter,DataSource.Callback<User> {


    public LoginPresenter(LoginContract.View view) {
        super(view);
    }

    @Override
    public void login(String phone, String password) {

    }

    @Override
    public void onDataLoaded(User user) {

    }

    @Override
    public void onDataNotAvailable(int strRes) {

    }
}
