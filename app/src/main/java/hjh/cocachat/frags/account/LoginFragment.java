package hjh.cocachat.frags.account;


import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import com.example.factory.presenter.account.LoginContract;

import net.qiujuer.genius.ui.widget.Loading;

import butterknife.BindView;
import hjh.cocachat.R;
import hjh.common.app.Fragment;
import hjh.common.app.PresenterFragment;

/**
 * A simple {@link Fragment} subclass.
 * 登录界面
 */
public class LoginFragment extends PresenterFragment<LoginContract.Presenter>
        implements LoginContract.View {

    private AccountTrigger mAccountTrigger;

    @BindView(R.id.edit_phone)
    EditText mPhone;
    @BindView(R.id.edit_password)
    EditText mPassword;

    @BindView(R.id.loading)
    Loading mLoading;

    @BindView(R.id.btn_submit)
    Button mSubmit;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //拿到我们的activity的引用
        mAccountTrigger = (AccountTrigger) context;
    }

    @Override
    protected LoginContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_login;
    }


    @Override
    public void onResume() {
        super.onResume();
        //进行一次切换 默认切换为注册界面
        mAccountTrigger.triggerView();
    }

    @Override
    public void loginSuccess() {

    }
}
