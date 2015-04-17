package com.zzmstring.cvs2.UIAty;



import com.zzmstring.cvs2.R;
import com.zzmstring.cvs2.base.BaseAty;



import java.util.List;

/**
 * Created by zzmstring on 2015/4/17.
 */
public class RecycleAty extends BaseAty {
//    private RecyclerView mRecyclerView;
    private List<String> mDatas;


    @Override
    public void initView() {
        setContentView(R.layout.aty_recycle);
        initData();
//        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setAdapter(mAdapter = new HomeAdapter());

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

}
