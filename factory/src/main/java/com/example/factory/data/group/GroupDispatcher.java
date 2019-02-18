package com.example.factory.data.group;

import com.example.factory.data.helper.DbHelper;
import com.example.factory.data.helper.GroupHelper;
import com.example.factory.data.helper.UserHelper;
import com.example.factory.modle.card.GroupCard;
import com.example.factory.modle.card.GroupMemberCard;
import com.example.factory.modle.db.Group;
import com.example.factory.modle.db.GroupMember;
import com.example.factory.modle.db.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author 91319
 * @Title: GroupDispatcher
 * @ProjectName cocaChat
 * @Description: 群／群成员卡片中心的实现类
 * @date 2019/1/29
 */
public class GroupDispatcher implements GroupCenter {

    private static GroupCenter instance;
    private Executor executor = Executors.newSingleThreadExecutor();

    public static GroupCenter instance() {
        if (instance == null) {
            synchronized (GroupDispatcher.class) {
                if (instance == null)
                    instance = new GroupDispatcher();
            }
        }
        return instance;
    }

    @Override
    public void dispatch(GroupCard... cards) {
        if (cards == null || cards.length == 0)
            return;
        executor.execute(new GroupHandler(cards));
    }

    @Override
    public void dispatch(GroupMemberCard... cards) {
        if (cards == null || cards.length == 0)
            return;
        executor.execute(new GroupMemberRspHandler(cards));
    }

    /**
     * 把群成员Card处理为群DB类
     */
    private class GroupMemberRspHandler implements Runnable {
        private final GroupMemberCard[] cards;

        GroupMemberRspHandler(GroupMemberCard[] cards) {
            this.cards = cards;
        }

        @Override
        public void run() {
            List<GroupMember> members = new ArrayList<>();
            for (GroupMemberCard model : cards) {
                // 成员对应的人的信息
                User user = UserHelper.search(model.getUserId());
                // 成员对应的群的信息
                Group group = GroupHelper.find(model.getGroupId());
                if (user != null && group != null) {
                    GroupMember member = model.build(group, user);
                    members.add(member);
                }
            }
            if (members.size() > 0)
                DbHelper.save(GroupMember.class, members.toArray(new GroupMember[0]));
        }
    }

    /**
     * 把群Card处理为群DB类
     */
    private class GroupHandler implements Runnable {
        private final GroupCard[] cards;

        GroupHandler(GroupCard[] cards) {
            this.cards = cards;
        }

        @Override
        public void run() {
            List<Group> groups = new ArrayList<>();
            for (GroupCard card : cards) {
                // 搜索管理员
                User owner = UserHelper.search(card.getOwnerId());
                if (owner != null) {
                    Group group = card.build(owner);
                    groups.add(group);
                }
            }
            if (groups.size() > 0)
                DbHelper.save(Group.class, groups.toArray(new Group[0]));
        }
    }
}
