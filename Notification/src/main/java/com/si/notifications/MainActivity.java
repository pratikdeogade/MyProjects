package com.si.notifications;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SiNotification.GCMRegistered {
    Context cxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cxt=this;
        SiNotification.getInstance().init(cxt,this);
    }

    @Override
    public void onTaskCompleted(String regId) {

    }
}
