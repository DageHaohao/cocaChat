package com.example.factory.presenter.group;

import com.example.factory.Factory;
import com.example.factory.data.helper.UserHelper;
import com.example.factory.modle.db.view.UserSampleModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import hjh.factory.presenter.BaseRecyclerPresenter;

/**
 * @author 91319
 * @Title: GroupCreatePresenter
 * @ProjectName cocaChat
 * @Description: 群创建界面的Presenter
 * @date 2019/2/14
 */
public class GroupCreatePresenter extends BaseRecyclerPresenter<GroupCreateContract.ViewModel,GroupCreateContract.View>
        implements GroupCreateContract.Presenter {

    //群组用户的集合
    private Set<String> users = new HashSet<>();


    public GroupCreatePresenter(GroupCreateContract.View view) {
        super(view);
    }

    @Override
    public void start() {
        super.start();
        Factory.runOnAsync(loader);
    }

    @Override
    public void create(String name, String desc, String picture) {



    }

    @Override
    public void changeSelect(GroupCreateContract.ViewModel model, boolean isSelected) {
        if(isSelected)
            users.add(model.author.getId());
        else
            users.remove(model.author.getId());
    }

    private Runnable loader = new Runnable() {
        @Override
        public void run() {
            List<UserSampleModel> sampleModels = UserHelper.getSampleContact();
            List<GroupCreateContract.ViewModel> models = new ArrayList<>();
            for (UserSampleModel sampleModel : sampleModels) {
                GroupCreateContract.ViewModel viewModel = new GroupCreateContract.ViewModel();
                viewModel.author = sampleModel;
                models.add(viewModel);
            }
            refreshData(models);
        }
    };
}
