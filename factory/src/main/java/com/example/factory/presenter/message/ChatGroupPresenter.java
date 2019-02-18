package com.example.factory.presenter.message;

import com.example.factory.data.helper.GroupHelper;
import com.example.factory.data.message.MessageGroupRepository;
import com.example.factory.modle.db.Group;
import com.example.factory.modle.db.Message;
import com.example.factory.modle.db.view.MemberUserModel;
import com.example.factory.persistence.Account;

import java.util.List;

/**
 * @author 91319
 * @Title: ChatGroupPresenter
 * @ProjectName cocaChat
 * @Description: 群聊天的逻辑
 * @date 2019/2/12
 */
public class ChatGroupPresenter extends ChatPresenter<ChatContract.GroupView>
        implements ChatContract.Presenter {

    public ChatGroupPresenter(ChatContract.GroupView view, String receiverId) {
        // 数据源，View，接收者，接收者的类型
        super(new MessageGroupRepository(receiverId), view, receiverId, Message.RECEIVER_TYPE_GROUP);
    }

    @Override
    public void start() {
        super.start();

        // 拿群的信息
        Group group = GroupHelper.findFromLocal(mReceiverId);
        if(group!=null){
            // 初始化操作
            ChatContract.GroupView view = getView();

            //判断当前用户是否是管理员
            boolean isAdmin = Account.getUserId().equalsIgnoreCase(group.getOwner().getId());
            view.showAdminOption(isAdmin);

            // 基础信息初始化
            view.onInit(group);

            // 成员初始化
            List<MemberUserModel> models = group.getLatelyGroupMembers();
            final long memberCount = group.getGroupMemberCount();

            // 没有显示的成员的数量 判断是否还有更多的群成员
            Long moreCount = memberCount-models.size();
            view.onInitGroupMembers(models,moreCount);

        }
    }
}
