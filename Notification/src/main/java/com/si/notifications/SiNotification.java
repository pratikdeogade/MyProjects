package com.si.notifications;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by pdeogade on 13-04-2017.
 */

public class SiNotification {

    private String SENDER_ID="";

    private static volatile SiNotification ourInstance;
    private GoogleCloudMessaging gcm;
    private Context context;
    private GCMRegistered listener;



    public static SiNotification getInstance() {
        if (ourInstance == null) {
            synchronized (SiNotification.class) {
                if (ourInstance == null) ourInstance = new SiNotification();
            }
        }
        return ourInstance;
    }

    private SiNotification() {
    }

    public void setSenderId(String senderId){
        SENDER_ID=senderId;
    }

    public void init(Context cxt,GCMRegistered onGCMRegistered) {
        context=cxt;
        listener=onGCMRegistered;
        if (gcm == null) {
            gcm = GoogleCloudMessaging.getInstance(context);
            try {
                String regId=gcm.register(SENDER_ID);
                listener.onTaskCompleted(regId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    private void subscribeNotification(@NonNull String url, HashMap<String, String> hMap) {
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... params) {
                return null;
            }
        }.execute();
        //


    }

    private void unSubscribeNotification(@NonNull String url, HashMap<String, String> hMap) {

    }

    public interface GCMRegistered {
        //method invoked once app receives regId
        void onTaskCompleted(String regId);
    }

}
