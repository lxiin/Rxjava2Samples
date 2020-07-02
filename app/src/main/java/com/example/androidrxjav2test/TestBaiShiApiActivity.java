package com.example.androidrxjav2test;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestBaiShiApiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testbaishi);
    }

    public void testApiClick(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String str = new BaiShiApiService().getData("550002327421310");
            }
        }).start();

    }
}
