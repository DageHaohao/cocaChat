package hjh.common.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;


public class GalleyView extends RecyclerView {


    public GalleyView(Context context) {
        super(context);
        init(null, 0);
    }

    public GalleyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public GalleyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {

        setLayoutManager(new GridLayoutManager(getContext(),4));

        

    }


}
