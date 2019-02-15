package com.example.factory.presenter.group;

import com.example.factory.modle.db.Group;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: GroupsContract
 * @ProjectName cocaChat
 * @Description: 我的群列表契约
 * @date 2019/2/15
 */
public interface GroupsContract {

    // 什么都不需要额外定义，开始就是调用start即可
    interface Presenter extends BaseContract.Presenter {

    }

    // 都在基类完成了
    interface View extends BaseContract.RecyclerView<Presenter, Group> {

    }

}
