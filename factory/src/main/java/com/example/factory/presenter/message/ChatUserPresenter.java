package com.example.factory.presenter.message;

import com.example.factory.data.helper.UserHelper;
import com.example.factory.data.message.MessageRepository;
import com.example.factory.modle.db.Message;
import com.example.factory.modle.db.User;

/**
 * @author 91319
 * @Title: ChatUserPresenter
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/2/12
 */
public class ChatUserPresenter extends ChatPresenter<ChatContract.UserView>
        implements ChatContract.Presenter {

    public ChatUserPresenter(ChatContract.UserView view, String receiverId) {
        // 数据源，View，接收者，接收者的类型
        super(new MessageRepository(receiverId), view, receiverId, Message.RECEIVER_TYPE_NONE);

    }

    @Override
    public void start() {
        super.start();

        // 从本地拿这个人的信息
        User receiver = UserHelper.findFromLocal(mReceiverId);
        getView().onInit(receiver);
    }
}
