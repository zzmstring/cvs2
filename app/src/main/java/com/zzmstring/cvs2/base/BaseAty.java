package com.zzmstring.cvs2.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by zzmstring on 2015/4/1.
 */
public abstract class BaseAty extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        initView();
        initData();
        initListener();
    }
    public abstract void initView();
    public abstract void initData();
    public abstract void initListener();
}
