package com.example.preman.fisikakubusbalok;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.preman.fisikakubusbalok.fragment.GambarFragment;
import com.example.preman.fisikakubusbalok.fragment.HomeFragment;
import com.example.preman.fisikakubusbalok.fragment.VideoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Objects.requireNonNull(getSupportActionBar()).setTitle("Fisika Home");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, new HomeFragment())
                            .commit();
                    return true;
                case R.id.navigation_dashboard:
                    Objects.requireNonNull(getSupportActionBar()).setTitle("Fisika Gambar");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, new GambarFragment())
                            .commit();
                    return true;
                case R.id.navigation_notifications:
                    Objects.requireNonNull(getSupportActionBar()).setTitle("Fisika Video");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, new VideoFragment())
                            .commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string.app_name);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content, new HomeFragment())
                .commit();
    }

}
