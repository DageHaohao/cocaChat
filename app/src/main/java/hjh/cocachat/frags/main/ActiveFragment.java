package hjh.cocachat.frags.main;


import butterknife.BindView;
import hjh.cocachat.R;
import hjh.common.app.Fragment;
import hjh.common.widget.GalleryView;


public class ActiveFragment extends Fragment {

    @BindView(R.id.galleryView)
    GalleryView mGalley;


    public ActiveFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_active;
    }


}
