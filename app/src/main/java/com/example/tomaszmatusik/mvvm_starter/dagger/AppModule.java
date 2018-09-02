package com.example.tomaszmatusik.mvvm_starter.dagger;

import android.content.Context;

import com.example.tomaszmatusik.mvvm_starter.activities.main.MainRepository;
import com.example.tomaszmatusik.mvvm_starter.viewcontroller.ViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final DaggApp daggApp;

    public AppModule(DaggApp daggApp) {
        this.daggApp = daggApp;
    }

    @Provides
    Context provideContext() {
        return daggApp;
    }

    @Provides
    MainRepository provideMainRepository() {
        return new MainRepository();
    }

    @Provides
    ViewModelFactory provideViewModelFacotry(MainRepository mainRepository) {
        return new ViewModelFactory(mainRepository);
    }
}
