package com.example.factory.presenter.group;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: GroupMemberAddContract
 * @ProjectName cocaChat
 * @Description: 群成员添加的契约
 * @date 2019/2/19
 */
public interface GroupMemberAddContract {

    interface Presenter extends BaseContract.Presenter{
        // 提交成员
        void submit();

        // 更改一个Model的选中状态
        void changeSelect(GroupCreateContract.ViewModel model, boolean isSelected);
    }

    // 界面
    interface View extends BaseContract.RecyclerView<Presenter,GroupCreateContract.ViewModel>{
        // 添加群成员成功
        void onAddedSucceed();

        // 获取群的Id
        String getGroupId();
    }

}
