package hjh.common.widget.adapter;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * @author 91319
 * @Title: TextWatcherAdapter
 * @ProjectName cocaChat
 * @Description: TODO
 * @date 2019/2/1
 */
public abstract class TextWatcherAdapter implements TextWatcher {

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

}
