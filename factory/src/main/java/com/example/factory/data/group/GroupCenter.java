package com.example.factory.data.group;

import com.example.factory.modle.card.GroupCard;
import com.example.factory.modle.card.GroupMemberCard;

/**
 * @author 91319
 * @Title: GroupCenter
 * @ProjectName cocaChat
 * @Description: TODO 群中心的接口定义
 * @date 2019/1/29
 */
public interface GroupCenter {

    // 群卡片的处理
    void dispatch(GroupCard... cards);

    // 群成员的处理
    void dispatch(GroupMemberCard... cards);

}
