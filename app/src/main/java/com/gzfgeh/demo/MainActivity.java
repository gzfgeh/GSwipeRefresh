package com.gzfgeh.demo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.gzfgeh.swipeheader.DefaultCustomHeadView;
import com.gzfgeh.swipeheader.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener {
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
        swipeRefreshLayout.setOnRefreshListener(this);
    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(false);
            }
        }, 3000);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.checkbox);
        CheckBox box = (CheckBox) item.getActionView();
        box.setChecked(true);
        box.setText("自定义下拉头");
        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    swipeRefreshLayout.setCustomHeadview(new DefaultCustomHeadView(MainActivity.this));
                else {
                    swipeRefreshLayout.setCustomHeadview(
                            LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_header, null)
                    );
                }
            }
        });
        return true;
    }
}
