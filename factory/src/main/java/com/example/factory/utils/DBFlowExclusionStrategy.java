package com.example.factory.utils;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

/**
 * @author 91319
 * @Title: DBFlowExclusionStrategy
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/21
 *
 * 一个自定义的过滤器 dbflow的过滤器要自己写
 */
public class DBFlowExclusionStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        // 被跳过的字段
        // 只要是属于DBFlow数据的
        return f.getDeclaredClass().equals(ModelAdapter.class);
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        // 别跳过的Class
        return false;
    }

}
