package hjh.factory.data;

import java.util.List;

/**
 * @author 91319
 * @Title: DbDataSource
 * @ProjectName cocaChat
 * @Description: TODO 基础的数据库数据源接口定义
 * @date 2019/1/30
 */
public interface DbDataSource<Data> extends DataSource {
    /**
     * 有一个基本的数据源加载方法
     *
     * @param callback 传递一个callback回调，一般回调到Presenter
     */
    void load(SucceedCallback<List<Data>> callback);
}
