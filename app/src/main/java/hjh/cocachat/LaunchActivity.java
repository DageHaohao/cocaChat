package hjh.cocachat;

import hjh.cocachat.activities.MainActivity;
import hjh.cocachat.frags.assist.PermissionsFragment;
import hjh.common.app.Activity;

public class LaunchActivity extends Activity {


    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_launch;
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (PermissionsFragment.haveAll(this, getSupportFragmentManager())) {
            MainActivity.show(this);
            finish();
        }

    }
}
