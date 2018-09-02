package com.example.tomaszmatusik.mvvm_starter.activities.main;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MainRepository mainRepository;

    public MainViewModel(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }
}
