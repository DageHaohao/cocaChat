package com.example.factory.modle.db.view;

import com.example.factory.modle.db.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.QueryModel;

import hjh.factory.modle.Author;

/**
 * @author 91319
 * @Title: UserSampleModel
 * @ProjectName cocaChat
 * @Description: 用户基础信息的Model，可以和数据库进行查询
 * @date 2019/2/14
 */
@QueryModel(database = AppDatabase.class)
public class UserSampleModel implements Author {

    @Column
    public String id;
    @Column
    public String name;
    @Column
    public String portrait;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPortrait() {
        return portrait;
    }

    @Override
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

}
