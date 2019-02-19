package com.example.factory.presenter.group;

import com.example.factory.Factory;
import com.example.factory.data.helper.GroupHelper;
import com.example.factory.modle.db.view.MemberUserModel;

import java.util.List;

import hjh.factory.presenter.BaseRecyclerPresenter;

/**
 * @author 91319
 * @Title: GroupMembersPresenter
 * @ProjectName cocaChat
 * @Description: 群成员显示的逻辑
 * @date 2019/2/19
 */
public class GroupMembersPresenter extends BaseRecyclerPresenter<MemberUserModel,GroupMembersContract.View>
        implements GroupMembersContract.Presenter {

    public GroupMembersPresenter(GroupMembersContract.View view) {
        super(view);
    }


    @Override
    public void refresh() {
        // 显示Loading
        start();

        // 异步加载
        Factory.runOnAsync(loader);
    }

    private Runnable loader = new Runnable() {
        @Override
        public void run() {

            GroupMembersContract.View view = getView();
            if(view==null)
                return;

            String groupId = view.getGroupId();

            // 传递数量为-1 代表查询所有
            List<MemberUserModel> models = GroupHelper.getMemberUsers(groupId, -1);

            //界面刷新
            refreshData(models);

        }
    };
}
