package hjh.factory.data;

import android.support.annotation.StringRes;

/**
 * @author 91319
 * @Title: DataSource
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/17
 *
 * 数据源接口定义
 *
 * 成功与失败回调接口封装
 *
 */
public interface DataSource {

    /**
     * 同时包括了成功与失败的回调接口
     *
     * @param <T> 任意类型
     *
     * 接口可以继承多个父接口
     */
    interface Callback<T> extends SucceedCallback<T>, FailedCallback {

    }

    /**
     * 只关注成功的接口
     *
     * @param <T> 任意类型
     */
    interface SucceedCallback<T> {
        // 数据加载成功, 网络请求成功
        void onDataLoaded(T t);

    }

    /**
     * 只关注失败的接口
     */
    interface FailedCallback {
        // 数据加载失败, 网络请求失败
        void onDataNotAvailable(@StringRes int strRes);
    }

    /**
     * 销毁操作
     */
    void dispose();
    

}
