package hjh.common.app;

import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import hjh.common.R;

/**
 * @author 91319
 * @Title: ToolbarActivity
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/23
 */
public abstract class ToolbarActivity extends Activity {

    protected Toolbar mToolbar;

    @Override
    protected void initWidget() {
        super.initWidget();
        initToolbar((Toolbar) findViewById(R.id.toolbar));
    }

    /**
     * 初始化toolbar
     *
     * @param toolbar Toolbar
     */
    public void initToolbar(Toolbar toolbar) {
        mToolbar = toolbar;
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        initTitleNeedBack();
    }

    protected void initTitleNeedBack() {
        // 设置左上角的返回按钮为实际的返回效果
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //设置返回的监听
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
