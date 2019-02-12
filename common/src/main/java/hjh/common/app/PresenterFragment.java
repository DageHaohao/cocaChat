package hjh.common.app;

import android.content.Context;

import hjh.factory.presenter.BaseContract;

/**
 * @author 91319
 * @Title: PresenterFragment
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/1/17
 */
public abstract class PresenterFragment<Presenter
        extends BaseContract.Presenter>
        extends Fragment
        implements BaseContract.View<Presenter> {

    protected Presenter mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // 在界面onAttach之后就触发初始化Presenter
        initPresenter();
    }

    /**
     * 初始化Presenter
     * @return Presenter
     */
    protected abstract Presenter initPresenter();

    @Override
    public void showError(int str) {

        if(mPlaceHolderView!=null){
            mPlaceHolderView.triggerError(str);
        }else {
            // 显示错误
            Application.showToast(str);
        }

    }

    @Override
    public void showLoading() {
       if(mPlaceHolderView!=null){
           mPlaceHolderView.triggerLoading();
       }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        // View中赋值Presenter
        mPresenter = presenter;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPresenter!=null)
            mPresenter.destroy();
    }
}
