package com.kurio.dagger2test;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPreferencesModule {

    private Context c;

    public SharedPreferencesModule(Context context) {
        c = context;
    }

    @MyApplicationScope
    @Provides
    @Inject
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("PrefName",Context.MODE_PRIVATE);
    }
}