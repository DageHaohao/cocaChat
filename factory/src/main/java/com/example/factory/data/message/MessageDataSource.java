package com.example.factory.data.message;

import com.example.factory.modle.db.Message;

import hjh.factory.data.DbDataSource;

/**
 * @author 91319
 * @Title: MessageDataSource
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/2/12
 *
 * 消息的数据源定义，他的实现是：MessageRepository
 * 关注的对象是Message表
 */
public interface MessageDataSource extends DbDataSource<Message> {
}
