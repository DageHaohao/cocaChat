package com.example.factory.presenter.search;

import com.example.factory.modle.card.GroupCard;

import java.util.List;

import hjh.factory.data.DataSource;
import hjh.factory.presenter.BasePresenter;

/**
 * @author 91319
 * @Title: SearchGroupPresenter
 * @ProjectName cocaChat
 * @Description: TODO 搜索群的实现
 * @date 2019/1/23
 */
public class SearchGroupPresenter extends BasePresenter<SearchContract.GroupView>
        implements SearchContract.Presenter,DataSource.Callback<List<GroupCard>> {

    public SearchGroupPresenter(SearchContract.GroupView view) {
        super(view);
    }

    @Override
    public void search(String content) {

    }

    @Override
    public void onDataLoaded(List<GroupCard> groupCards) {

    }

    @Override
    public void onDataNotAvailable(int strRes) {

    }
}
