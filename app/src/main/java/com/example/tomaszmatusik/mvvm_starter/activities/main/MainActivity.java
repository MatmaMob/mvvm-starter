package com.example.tomaszmatusik.mvvm_starter.activities.main;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.tomaszmatusik.mvvm_starter.R;
import com.example.tomaszmatusik.mvvm_starter.dagger.DaggApp;
import com.example.tomaszmatusik.mvvm_starter.databinding.ActivityMainBinding;
import com.example.tomaszmatusik.mvvm_starter.viewcontroller.ViewModelFactory;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ViewModelFactory viewModelFactory;

    private MainViewModel mainViewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ((DaggApp) getApplication()).getAppComponent().inject(this);
        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);
    }
}
