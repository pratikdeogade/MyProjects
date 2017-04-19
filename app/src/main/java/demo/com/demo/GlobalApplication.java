package demo.com.demo;

import android.app.Application;
import android.util.Log;

/**
 * Created by pdeogade on 11-04-2017.
 */

public class GlobalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread paramThread, Throwable paramThrowable) {
                Log.e("Alert","Lets See if it Works !!!");
            }
        });
    }
}
