package com.zzmstring.cvs2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    @InjectView(R.id.bt1)
    Button bt1;
    @InjectView(R.id.bt2)
    Button bt2;
    @InjectView(R.id.bt3)
    Button bt3;
    @InjectView(R.id.bt4)
    Button bt4;
    @InjectView(R.id.bt5)
    Button bt5;
    @InjectView(R.id.bt6)
    Button bt6;
    @InjectView(R.id.bt7)
    Button bt7;
    @InjectView(R.id.bt8)
    Button bt8;
    @InjectView(R.id.bt9)
    Button bt9;
    @InjectView(R.id.bt10)
    Button bt10;
    @InjectView(R.id.bt11)
    Button bt11;
    @InjectView(R.id.bt12)
    Button bt12;
    @InjectView(R.id.bt13)
    Button bt13;
    @InjectView(R.id.bt14)
    Button bt14;
    @InjectView(R.id.bt15)
    Button bt15;
    @InjectView(R.id.bt16)
    Button bt16;
    @InjectView(R.id.bt17)
    Button bt17;
    @InjectView(R.id.bt18)
    Button bt18;
    @InjectView(R.id.bt19)
    Button bt19;
    @InjectView(R.id.bt20)
    Button bt20;
    @InjectView(R.id.bt21)
    Button bt21;
    @InjectView(R.id.bt22)
    Button bt22;
    @InjectView(R.id.bt23)
    Button bt23;
    @InjectView(R.id.bt24)
    Button bt24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle("My Title");
        toolbar.setSubtitle("Sub title");
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Handle the menu item
                return true;
            }
        });
        // Inflate a menu to be displayed in the toolbar
        toolbar.inflateMenu(R.menu.menu_main);
        init();
        initListener();
    }
    private void init(){
        bt1.setText("fb");

    }
    private void initListener(){
        bt1.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:

                break;
        }
    }
}
