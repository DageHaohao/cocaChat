package com.example.factory.modle.db.view;

import com.example.factory.modle.db.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.QueryModel;

/**
 * @author 91319
 * @Title: MemberUserModel
 * @ProjectName cocaChat
 * @Description: 群成员对应的用户的简单信息表
 * @date 2019/2/15
 */
@QueryModel(database = AppDatabase.class)
public class MemberUserModel {
    @Column
    public String userId; // User-id/Member-userId
    @Column
    public String name; // User-name
    @Column
    public String alias; // Member-alias
    @Column
    public String portrait; // User-portrait
}
