package com.example.factory.presenter.contact;

import com.example.factory.modle.card.UserCard;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: FollowContract
 * @ProjectName cocaChat
 * @Description: TODO 关注的接口定义
 * @date 2019/1/24
 */
public interface FollowContract {

    // 任务调度者
    interface Presenter extends BaseContract.Presenter{
        // 关注一个人
        void follow(String id);
    }

    interface View extends BaseContract.View<Presenter>{
        // 成功的情况下返回一个用户的信息
        void onFollowSucceed(UserCard userCard);
    }

}
