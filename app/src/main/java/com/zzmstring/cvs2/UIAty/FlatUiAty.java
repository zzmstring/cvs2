package com.zzmstring.cvs2.UIAty;

import android.graphics.Color;
import android.os.Bundle;


import com.cengalabs.flatui.FlatUI;
import com.cengalabs.flatui.views.FlatButton;
import com.cengalabs.flatui.views.FlatSeekBar;
import com.cengalabs.flatui.views.FlatTextView;
import com.zzmstring.cvs2.R;
import com.zzmstring.cvs2.base.BaseAty;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by zzmstring on 2015/4/4.
 */
public class FlatUiAty extends BaseAty {
    @InjectView(R.id.flatbt)
    FlatButton flatbt;
    @InjectView(R.id.seekbar)
    FlatSeekBar seekbar;
    @InjectView(R.id.textview)
    FlatTextView textview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    int[] myColors = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};
    @Override
    public void initView() {
        setContentView(R.layout.aty_flatui);
        ButterKnife.inject(this);
        FlatUI.initDefaultValues(this);

// Setting default theme to avoid to add the attribute "theme" to XML
// and to be able to change the whole theme at once
        FlatUI.setDefaultTheme(FlatUI.DEEP);

        seekbar.getAttributes().setColors(myColors);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

}
