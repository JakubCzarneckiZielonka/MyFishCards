package com.example.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.security.Provider;

public class BaseApplication extends Application {

    public static BaseApplication of(Context context) {
        if (context.getApplicationContext() instanceof BaseApplication){
            return (BaseApplication) context.getApplicationContext();
        }
        return null;
    }
    public abstract Provider getProvider();
    public abstract INavigator getNavigator(Activity activity);
}
