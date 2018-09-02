package com.example.tomaszmatusik.mvvm_starter.dagger;

import com.example.tomaszmatusik.mvvm_starter.activities.main.MainActivity;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggApp daggApp);

    void inject(MainActivity mainActivity);
}
