package com.example.factory.presenter.contact;

import com.example.factory.modle.db.User;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: ContactContract
 * @ProjectName cocaChat
 * @Description: 联系人契约类
 * @date 2019/1/24
 */
public interface ContactContract {
    // 什么都不需要额外定义，开始就是调用start即可
    interface Presenter extends BaseContract.Presenter{

    }

    // 都在基类完成了
    interface View extends BaseContract.RecyclerView<Presenter,User> {

    }

}
