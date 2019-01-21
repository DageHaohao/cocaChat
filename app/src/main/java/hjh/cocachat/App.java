package hjh.cocachat;

import com.example.factory.Factory;
import com.igexin.sdk.PushManager;

import hjh.common.app.Application;

/**
 * @author 91319
 * @Title: App
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/9
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 调用Factory进行初始化
        Factory.setup();
        // 推送进行初始化
        // PushService.class 为 上面 我们 自定义推送服务
        PushManager.getInstance().initialize(this,PushService.class);

        // PushIntentService 为 我们 ⾃自定义的推送服务事件接收类
        PushManager.getInstance().registerPushIntentService(this,PushIntentService.class);

    }
}
