package com.example.factory.data.helper;

import com.example.factory.modle.db.Session;
import com.example.factory.modle.db.Session_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

/**
 * @author 91319
 * @Title: SessionHelper
 * @ProjectName cocaChat
 * @Description: TODO 会话辅助工具类
 * @date 2019/1/28
 */
public class SessionHelper {

    // 从本地查询Session
    public static Session findFromLocal(String id) {
        return SQLite.select()
                .from(Session.class)
                .where(Session_Table.id.eq(id))
                .querySingle();
    }

}
