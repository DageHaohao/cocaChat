package hjh.cocachat.frags.search;


import com.example.factory.modle.card.GroupCard;
import com.example.factory.presenter.search.SearchContract;

import java.util.List;

import hjh.cocachat.R;
import hjh.cocachat.activities.SearchActivity;
import hjh.common.app.PresenterFragment;

/**
 * 搜索群的界面实现
 */
public class SearchGroupFragment extends PresenterFragment<SearchContract.Presenter>
        implements SearchActivity.SearchFragment,SearchContract.GroupView {


    public SearchGroupFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_search_group;
    }

    @Override
    public void search(String content) {

    }

    @Override
    public void onSearchDone(List<GroupCard> groupCards) {

    }

    @Override
    protected SearchContract.Presenter initPresenter() {
        return null;
    }
}
