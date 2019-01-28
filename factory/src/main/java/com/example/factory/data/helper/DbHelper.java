package com.example.factory.data.helper;

/**
 * @author 91319
 * @Title: DbHelper
 * @ProjectName cocaChat
 * @Description: TODO 数据库的辅助工具类 辅助完成：增删改
 * @date 2019/1/28
 */
public class DbHelper {

    //构造一个单利
    private static final DbHelper instance;

    static {
        instance = new DbHelper();
    }

    private DbHelper(){}

}
