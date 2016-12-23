package com.gzfgeh.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gzfgeh.redview.RedHotView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RedHotView view = (RedHotView) findViewById(R.id.hot_one);
        view.setText("909");
    }
}
