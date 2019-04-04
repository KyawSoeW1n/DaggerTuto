package com.kurio.dagger2test;

import dagger.Component;

@Component(modules ={ ContextModule.class,SharedPreferencesModule.class})
@MyApplicationScope
public interface MyComponent {
    void inject(MainActivity mainActivity);
}