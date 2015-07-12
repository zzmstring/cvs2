package com.zzmstring.cvs2.UIAty;



import android.support.v7.widget.RecyclerView;

import com.zzmstring.cvs2.R;
import com.zzmstring.cvs2.base.BaseAty;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by zzmstring on 15/7/12.
 */

public class RecyclerAty extends BaseAty{
    @InjectView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public void initView() {
        setContentView(R.layout.aty_recycle);
        ButterKnife.inject(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }
}
