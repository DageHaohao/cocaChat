package com.example.factory.presenter.group;

import com.example.factory.modle.db.view.MemberUserModel;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: GroupMembersContract
 * @ProjectName cocaChat
 * @Description: 群成员的契约
 * @date 2019/2/19
 */
public interface GroupMembersContract {

    interface Presenter extends BaseContract.Presenter{
        // 具有一个刷新的方法
        void refresh();
    }

    interface View extends BaseContract.RecyclerView<Presenter, MemberUserModel>{
        // 获取群的ID
        String getGroupId();
    }

}
