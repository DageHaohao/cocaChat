package hjh.cocachat.frags.account;


import android.content.Context;

import hjh.cocachat.R;
import hjh.common.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * 登录界面
 */
public class LoginFragment extends Fragment {

    private AccountTrigger mAccountTrigger;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //拿到我们的activity的引用
        mAccountTrigger = (AccountTrigger) context;
    }

    public LoginFragment() {
        // Required empty public constructor
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
}
