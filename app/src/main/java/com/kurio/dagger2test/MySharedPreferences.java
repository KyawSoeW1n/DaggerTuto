package com.kurio.dagger2test;

import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;


public class MySharedPreferences {

    private SharedPreferences mSharedPreferences;

    @Inject
    public MySharedPreferences(SharedPreferences mSharedPreferences) {
        this.mSharedPreferences = mSharedPreferences;
    }

    public void putData(String key, int data) {
        mSharedPreferences.edit().putInt(key, data).apply();

    }

    public int getData(String key) {
        Log.i("KEY", "EKY" + key);
        return mSharedPreferences.getInt(key, 0);
    }
}