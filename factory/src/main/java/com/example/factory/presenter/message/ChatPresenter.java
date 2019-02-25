package com.example.factory.presenter.message;

import android.support.v7.util.DiffUtil;

import com.example.factory.data.helper.MessageHelper;
import com.example.factory.data.message.MessageDataSource;
import com.example.factory.modle.api.message.MsgCreateModel;
import com.example.factory.modle.db.Message;
import com.example.factory.persistence.Account;
import com.example.factory.presenter.BaseSourcePresenter;
import com.example.factory.utils.DiffUiDataCallback;

import java.util.List;

/**
 * @author 91319
 * @Title: ChatPresenter
 * @ProjectName cocaChat
 * @Description: TODO 聊天Presenter的基础类
 * @date 2019/2/12
 */

@SuppressWarnings("WeakerAccess")
public class ChatPresenter<View extends ChatContract.View>
        extends BaseSourcePresenter<Message,Message, MessageDataSource,View>
        implements ChatContract.Presenter {

    // 接收者Id，可能是群，或者人的ID
    protected String mReceiverId;

    // 区分是人还是群Id
    protected int mReceiverType;


    public ChatPresenter(MessageDataSource source, View view,
                         String receiverId, int receiverType) {
        super(source, view);
        this.mReceiverId = receiverId;
        this.mReceiverType = receiverType;
    }


    @Override
    public void pushText(String content) {

        // 构建一个新的消息
        MsgCreateModel model = new MsgCreateModel.Builder()
                .receiver(mReceiverId,mReceiverType)
                .content(content,Message.TYPE_STR)
                .build();

        // 进行网络发送
        MessageHelper.push(model);
    }

    @Override
    public void pushAudio(String path) {
        // TODO 发送语音
    }

    /**
     * 发送图片
     * @param paths
     */
    @Override
    public void pushImages(String[] paths) {
        if (paths == null || paths.length == 0)
            return;

        // 此时路径是本地的手机上的路径
        for (String path : paths) {
            // 构建一个新的消息
            MsgCreateModel model = new MsgCreateModel.Builder()
                    .receiver(mReceiverId,mReceiverType)
                    .content(path,Message.TYPE_PIC)
                    .build();

            //进行网络发送
            MessageHelper.push(model);
        }
    }

    @Override
    public boolean rePush(Message message) {

        // 确定消息是可重复发送的
        //校验发送者为自己&&message的状态为错误状态
        if(Account.getUserId().equalsIgnoreCase(message.getSender().getId())
                &&message.getStatus()== Message.STATUS_FAILED){

            // 更改为正常的状态
            message.setStatus(Message.STATUS_CREATED);
            // 构建发送Model
            MsgCreateModel model = MsgCreateModel.buildWithMessage(message);
            MessageHelper.push(model);
            return true;
        }

        return false;
    }

    @Override
    public void onDataLoaded(List<Message> messages) {

        ChatContract.View view = getView();
        if (view == null)
            return;

        // 拿到老数据
        @SuppressWarnings("unchecked")
        List<Message> old = view.getRecyclerAdapter().getItems();

        // 差异计算
        DiffUiDataCallback<Message> callback = new DiffUiDataCallback<>(old, messages);
        final DiffUtil.DiffResult result = DiffUtil.calculateDiff(callback);

        // 进行界面刷新
        refreshData(result, messages);

    }
}
