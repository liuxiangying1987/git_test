package com.key.calc.git_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("master");
        System.out.println("git_fix");
        System.out.println("master1");
        System.out.println("dev");
        System.out.println("dev1");
        System.out.println("dev3");
    }
}