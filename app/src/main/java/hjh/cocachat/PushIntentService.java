package hjh.cocachat;

import android.content.Context;
import android.util.Log;

import com.example.factory.Factory;
import com.example.factory.data.helper.AccountHelper;
import com.example.factory.persistence.Account;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;

/**
 * @author 91319
 * @Title: PushIntentService
 * @ProjectName cocaChat
 * @Description:
 * @date 2019/1/21
 */
public class PushIntentService extends GTIntentService {

    // 打印日志 使用的 Tag
    private static final String TAG = PushIntentService.class.getSimpleName();

    public PushIntentService() {
    }

    @Override
    public void onReceiveServicePid(Context context, int i) {

    }

    @Override
    public void onReceiveClientId(Context context, String clientid) {
        Log.i(TAG, "onReceiveClientId -> " + "clientid = " + clientid);
        onClientInit(clientid); // 初始化 PushId
    }

    @Override
    public void onReceiveMessageData(Context context, GTTransmitMessage msg) {
        // 透传消息的处理
        byte[] payload = msg.getPayload();
        if (payload != null) {
            String message = new String(payload);
            Log.i(TAG, "onReceiveMessageData -> " + message);
            onMessageArrived(message);
        }
    }

    @Override
    public void onReceiveOnlineState(Context context, boolean b) {

    }

    @Override
    public void onReceiveCommandResult(Context context, GTCmdMessage gtCmdMessage) {

    }

    @Override
    public void onNotificationMessageArrived(Context context, GTNotificationMessage gtNotificationMessage) {

    }

    @Override
    public void onNotificationMessageClicked(Context context, GTNotificationMessage gtNotificationMessage) {

    }

    /**
     * 当Id初始化的试试
     *
     * @param cid 设备Id
     */
    private void onClientInit(String cid) {

        Account.setPushId(cid);

        if(Account.isLogin()){
            // 账户登录状态，进行一次PushId绑定
            // 没有登录是不能绑定PushId的
            AccountHelper.bindPush(null);
        }

    }

    /**
     * 消息达到时
     *
     * @param message 新消息
     */
    private void onMessageArrived(String message) {
        // 交给Factory处理
        Factory.dispatchPush(message);
    }
}
