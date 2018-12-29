package hjh.cocachat.frags.main;


import butterknife.BindView;
import hjh.cocachat.R;
import hjh.common.app.Fragment;
import hjh.common.widget.GalleyView;


public class ActiveFragment extends Fragment {

    @BindView(R.id.galleyView)
    GalleyView mGalley;


    public ActiveFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_active;
    }


    /*@Override
    protected void initData() {
        super.initData();

        mGalley.setup(getLoaderManager(), new GalleyView.SelectedChangeListener() {
            @Override
            public void onSelectedCountChanged(int count) {

            }
        });

    }*/
}
