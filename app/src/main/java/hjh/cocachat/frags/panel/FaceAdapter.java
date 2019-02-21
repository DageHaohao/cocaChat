package hjh.cocachat.frags.panel;

import android.view.View;

import java.util.List;

import hjh.cocachat.R;
import hjh.common.widget.recycler.RecyclerAdapter;
import hjh.face.Face;

/**
 * @author 91319
 * @Title: FaceAdapter
 * @ProjectName cocaChat
 * @Description: 表情适配器
 * @date 2019/2/21
 */
public class FaceAdapter extends RecyclerAdapter<Face.Bean> {

    public FaceAdapter(List<Face.Bean> beans,AdapterListener<Face.Bean> listener) {
        super(beans,listener);
    }

    @Override
    protected int getItemViewType(int position, Face.Bean bean) {
        return R.layout.cell_face;
    }

    @Override
    protected ViewHolder<Face.Bean> onCreateViewHolder(View root, int viewType) {
        return new FaceHolder(root);
    }
}
