package com.example.fragmentdata29072019;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    SeekBar skMain;
    Button btnAddAndroidFragment;
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skMain = findViewById(R.id.seekbarMain);
        btnAddAndroidFragment = findViewById(R.id.buttonAddAndroidFragment);

        btnAddAndroidFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AndroidFragment androidFragment = new AndroidFragment();
                Bundle bundle = new Bundle();
                bundle.putString("chuoi","Main send data");
                androidFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.linearMain, androidFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
