package com.example.factory.data.message;

import com.example.factory.modle.card.MessageCard;

/**
 * @author 91319
 * @Title: MessageCenter
 * @ProjectName cocaChat
 * @Description: TODO 消息中心，进行消息卡片的消费
 * @date 2019/1/29
 */
public interface MessageCenter {
    void dispatch(MessageCard... cards);
}
