package com.kurio.dagger2test;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @MyApplicationScope
    Context provideContext() {
        return context;
    }
}