package com.example.factory.presenter.search;

import com.example.factory.modle.card.UserCard;

import java.util.List;

import hjh.factory.data.DataSource;
import hjh.factory.presenter.BasePresenter;

/**
 * @author 91319
 * @Title: SearchUserPresenter
 * @ProjectName cocaChat
 * @Description: TODO 搜索人的实现
 * @date 2019/1/23
 */
public class SearchUserPresenter extends BasePresenter<SearchContract.UserView>
        implements SearchContract.Presenter,DataSource.Callback<List<UserCard>> {

    public SearchUserPresenter(SearchContract.UserView view) {
        super(view);
    }

    @Override
    public void search(String content) {

    }

    @Override
    public void onDataLoaded(List<UserCard> userCards) {

    }

    @Override
    public void onDataNotAvailable(int strRes) {

    }
}
