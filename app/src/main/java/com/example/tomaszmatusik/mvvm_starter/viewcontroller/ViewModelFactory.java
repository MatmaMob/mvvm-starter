package com.example.tomaszmatusik.mvvm_starter.viewcontroller;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.tomaszmatusik.mvvm_starter.activities.main.MainRepository;
import com.example.tomaszmatusik.mvvm_starter.activities.main.MainViewModel;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private MainRepository mainRepository;

    public ViewModelFactory(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {

        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(mainRepository);
        } else {
            throw new IllegalArgumentException("View model not found");
        }
    }
}
