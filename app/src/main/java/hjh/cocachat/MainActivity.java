package hjh.cocachat;

import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import hjh.common.app.Activity;

public class MainActivity extends Activity {

    @BindView(R.id.txt_result)
    TextView mResultText;

    @BindView(R.id.edit_query)
    EditText mInputText;


    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }


    @OnClick(R.id.btn_submit)
    void onSumbit(){

    }
}
