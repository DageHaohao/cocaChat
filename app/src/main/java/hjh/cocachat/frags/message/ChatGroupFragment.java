package hjh.cocachat.frags.message;


import android.app.Fragment;

import com.example.factory.modle.db.Group;
import com.example.factory.presenter.message.ChatContract;

import hjh.cocachat.R;

/**
 * A simple {@link Fragment} subclass.
 * 群聊天界面实现
 */
public class ChatGroupFragment extends ChatFragment<Group> implements ChatContract.GroupView {


    public ChatGroupFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_chat_group;
    }

    @Override
    public void onInit(Group group) {

    }

    @Override
    protected ChatContract.Presenter initPresenter() {
        return null;
    }
}
