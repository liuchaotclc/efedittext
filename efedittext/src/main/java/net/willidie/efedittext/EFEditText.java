package net.willidie.efedittext;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by liuchao on 8/16/16.
 */

public class EFEditText extends EditText{

    public EFEditText(Context context) {
        super(context);
        init();
    }

    public EFEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){

        InputFilter[] base = getFilters();
        InputFilter[] nf = new InputFilter[base.length + 1];
        System.arraycopy(base, 0, nf, 0, base.length);
        nf[base.length] = new EmojiFilter();
        setFilters(nf);
    }
}
