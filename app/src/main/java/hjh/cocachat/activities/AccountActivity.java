package hjh.cocachat.activities;

import android.content.Context;
import android.content.Intent;

import hjh.cocachat.R;
import hjh.cocachat.frags.account.UpdateInfoFragment;
import hjh.common.app.Activity;
import hjh.common.app.Fragment;

public class AccountActivity extends Activity {

    private Fragment mCurFragment;
    /**
     * 账户activity显示的入口
     * @param context
     */
    public static void show(Context context){
        context.startActivity(new Intent(context, AccountActivity.class));
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_account;
    }

    @Override
    protected void initWidget() {
        super.initWidget();

        mCurFragment = new UpdateInfoFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.lay_container, mCurFragment)
                .commit();
    }

    // Activity中收到剪切图片成功的回调
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        mCurFragment.onActivityResult(requestCode, resultCode, data);
    }
}