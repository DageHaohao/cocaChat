package com.example.factory.presenter.message;

import com.example.factory.modle.db.Session;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: SessionContract
 * @ProjectName cocaChat
 * @Description: TODO 本地最近会话契约类
 * @date 2019/2/12
 */
public interface SessionContract  {

    // 什么都不需要额外定义，开始就是调用start即可
    interface Presenter extends BaseContract.Presenter{

    }

    interface View extends BaseContract.RecyclerView<Presenter, Session>{

    }

}
