package com.example.factory.modle.db;

import com.example.factory.utils.DiffUiDataCallback;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * @author 91319
 * @Title: BaseDbModel
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/30
 * 我们APP中的基础的一个BaseDbModel，
 * 基础了数据库框架DbFlow中的基础类
 * 同时定义类我们需要的方法
 */
public abstract class BaseDbModel<Model> extends BaseModel
        implements DiffUiDataCallback.UiDataDiffer<Model> {
}
