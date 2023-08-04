package com.junior.ec03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.junior.ec03.databinding.ActivityMainBinding;
import com.junior.ec03.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());//BINDING
        setContentView(R.layout.activity_main);//BINDING

        addHomeFragment();
    }

    private void addHomeFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(binding.fcvMain.getId(),new HomeFragment()).commit();
    }
}