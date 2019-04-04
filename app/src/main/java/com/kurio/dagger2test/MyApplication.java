package com.kurio.dagger2test;

import android.app.Application;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .sharedPreferencesModule(new SharedPreferencesModule(getApplicationContext()))
                .contextModule(new ContextModule(getApplicationContext()))
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}