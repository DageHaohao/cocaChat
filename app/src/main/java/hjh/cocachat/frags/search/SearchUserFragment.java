package hjh.cocachat.frags.search;


import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.factory.modle.card.UserCard;
import com.example.factory.presenter.search.SearchContract;

import java.util.List;

import butterknife.BindView;
import hjh.cocachat.R;
import hjh.cocachat.activities.SearchActivity;
import hjh.common.app.PresenterFragment;
import hjh.common.widget.EmptyView;
import hjh.common.widget.recycler.RecyclerAdapter;

/**
 * 搜索人的界面实现
 */
public class SearchUserFragment extends PresenterFragment<SearchContract.Presenter>
        implements SearchActivity.SearchFragment,SearchContract.UserView {

    @BindView(R.id.empty)
    EmptyView mEmptyView;

    @BindView(R.id.recycler)
    RecyclerView mRecycler;

    public SearchUserFragment() {
        // Required empty public constructor
    }

    //RecyclerView适配器
    private RecyclerAdapter<UserCard> mAdapter;

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_search_user;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);

        // 初始化Recycler
        mRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecycler.setAdapter(mAdapter = new RecyclerAdapter<UserCard>() {
            @Override
            protected int getItemViewType(int position, UserCard userCard) {
                // 返回cell的布局id
                return 0;
            }

            @Override
            protected ViewHolder<UserCard> onCreateViewHolder(View root, int viewType) {
                return null;
            }
        });

    }

    @Override
    public void search(String content) {

    }


    @Override
    public void onSearchDone(List<UserCard> userCards) {

    }

    @Override
    protected SearchContract.Presenter initPresenter() {
        return null;
    }

    class ViewHolder extends RecyclerAdapter.ViewHolder<UserCard>{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        protected void onBind(UserCard userCard) {

        }
    }

}
