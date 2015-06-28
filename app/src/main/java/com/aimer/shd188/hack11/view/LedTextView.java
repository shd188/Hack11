package com.aimer.shd188.hack11.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import java.io.File;

/**
 * Created by shd188 on 15/6/28.
 */
public class LedTextView extends TextView {

    private static final String FONTS_FOLDER = "fonts";
    private static final String FONT_DIGITAL_7 = FONTS_FOLDER
            + File.separator + "digital-7.ttf";


    public LedTextView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        AssetManager assetManager=context.getAssets();
        //设置字体
        Typeface font = Typeface.createFromAsset(assetManager,"fonts/digital-7.ttf");
        setTypeface(font);
    }


    public LedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
}
