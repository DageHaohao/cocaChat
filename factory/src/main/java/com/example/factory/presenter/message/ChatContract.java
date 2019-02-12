package com.example.factory.presenter.message;

import com.example.factory.modle.db.Group;
import com.example.factory.modle.db.Message;
import com.example.factory.modle.db.User;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: ChatContract
 * @ProjectName cocaChat
 * @Description: TODO 聊天契约类
 * @date 2019/2/12
 */
public interface ChatContract {

    interface Presenter extends BaseContract.Presenter{
        // 发送文字
        void pushText(String content);

        // 发送语音
        void pushAudio(String path);

        // 发送图片
        void pushImages(String[] paths);

        // 重新发送一个消息，返回是否调度成功
        boolean rePush(Message message);
    }

    // 界面的基类
    interface View<InitModel> extends BaseContract.RecyclerView<Presenter,Message>{
        // 初始化的Model
        void onInit(InitModel model);
    }

    // 人聊天的界面
    interface UserView extends View<User> {

    }

    // 群聊天的界面
    interface GroupView extends View<Group> {

    }

}
