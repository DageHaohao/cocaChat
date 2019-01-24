package com.example.factory.presenter.contact;

import com.example.factory.data.helper.UserHelper;
import com.example.factory.modle.card.UserCard;

import net.qiujuer.genius.kit.handler.Run;
import net.qiujuer.genius.kit.handler.runable.Action;

import hjh.factory.data.DataSource;
import hjh.factory.presenter.BasePresenter;

/**
 * @author 91319
 * @Title: FollowPresenter
 * @ProjectName cocaChat
 * @Description: TODO 关注逻辑的实现
 * @date 2019/1/24
 */
public class FollowPresenter extends BasePresenter<FollowContract.View>
        implements FollowContract.Presenter,DataSource.Callback<UserCard> {


    public FollowPresenter(FollowContract.View view) {
        super(view);
    }

    @Override
    public void follow(String id) {

        start();
        UserHelper.follow(id, this);

    }

    @Override
    public void onDataLoaded(final UserCard userCard) {

        final FollowContract.View view = getView();
        if(view!=null){
            Run.onUiAsync(new Action() {
                @Override
                public void call() {
                   view.onFollowSucceed(userCard);
                }
            });
        }
    }

    @Override
    public void onDataNotAvailable(final int strRes) {

        final FollowContract.View view = getView();
        if(view!=null){
            Run.onUiAsync(new Action() {
                @Override
                public void call() {
                    view.showError(strRes);
                }
            });
        }

    }
}
