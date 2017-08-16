package robot.com.myapplication;

import android.app.Application;

/**
 * Created by win10 on 2017/7/14.
 */

public class App extends Application {
    public static App mApp;
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }

    public static App getApp() {
        return mApp;
    }
}
