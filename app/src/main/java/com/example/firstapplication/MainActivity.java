package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int number = 5;

        if (number == 9) {
            Log.d("DuanPham", "True");
        } else {
            Log.d("DuanPham", "false");

        }

        String moth = "March";
        switch (moth) {
            case "Feruary":
                Log.d("DuanPham", "February");
                break;
            case "March" :
                Log.d("DuanPham", "March");
                break;
            default: Log.d("DuanPham", "No Value");
        }
    }
}
