package com.example.factory.data.user;

import com.example.factory.modle.card.UserCard;

/**
 * @author 91319
 * @Title: UserCenter
 * @ProjectName cocaChat
 * @Description: 用户中心的基本定义
 * @date 2019/1/29
 */
public interface UserCenter {
    // 分发处理一堆用户卡片的信息，并更新到数据库
    void dispatch(UserCard... cards);
    
}

