package hjh.cocachat.frags.panel;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;

import butterknife.BindView;
import hjh.cocachat.R;
import hjh.common.widget.recycler.RecyclerAdapter;
import hjh.face.Face;

/**
 * @author 91319
 * @Title: FaceHolder
 * @ProjectName cocaChat
 * @Description:
 * @date 2019/2/21
 */
public class FaceHolder extends RecyclerAdapter.ViewHolder<Face.Bean> {

    @BindView(R.id.im_face)
    ImageView mFace;

    public FaceHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    protected void onBind(Face.Bean bean) {
        if (bean != null
                // drawable 资源 id
                && ((bean.preview instanceof Integer)
                // face zip 包资源路径
                || bean.preview instanceof String))
            Glide.with(itemView.getContext())
                    .load(bean.preview)
                    .asBitmap()
                    .format(DecodeFormat.PREFER_ARGB_8888) //设置解码格式8888，保证清晰度
                    .placeholder(R.drawable.default_face)
                    .into(mFace);

    }
}
