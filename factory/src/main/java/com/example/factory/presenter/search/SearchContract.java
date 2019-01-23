package com.example.factory.presenter.search;

import com.example.factory.modle.card.GroupCard;
import com.example.factory.modle.card.UserCard;

import java.util.List;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: SearchContract
 * @ProjectName cocaChat
 * @Description: TODO 搜索契约类
 * @date 2019/1/23
 *
 */
public interface SearchContract {

    interface Presenter extends BaseContract.Presenter{
        // 搜索内容
        void search(String content);
    }

    // 搜索人的界面
    interface UserView extends BaseContract.View<Presenter>{
        void onSearchDone(List<UserCard> userCards);
    }

    // 搜索群的界面
    interface GroupView extends BaseContract.View<Presenter>{
        void onSearchDone(List<GroupCard> groupCards);
    }

}
