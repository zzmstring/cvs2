package com.zzmstring.cvs2.UIAty;

import android.os.Bundle;
import android.os.PersistableBundle;


import com.zzmstring.cvs2.base.BaseAty;

import butterknife.ButterKnife;

/**
 * Created by zzmstring on 2015/4/4.
 */
public class FlatUiAty extends BaseAty {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void initView() {

        ButterKnife.inject(this);

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

}
