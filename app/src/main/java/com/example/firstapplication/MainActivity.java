package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;

import java.util.ArrayList;

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

        int age = 1;

        while (age <10) {
            age++;
            Log.d("DuanPham " , String.valueOf(age));
        }

        for(int i = 0; i<10 ; i++) {
            Log.d("DuanPham", String.valueOf(i));
        }

        ArrayList<String> arrayCity = new ArrayList<>();
        arrayCity.add("HaNoi");
        arrayCity.add("NhaTrang");
        arrayCity.add("HoChiMinh");

        Log.d("DuanPham", "Size: " + arrayCity.size());
        Log.d("DuanPham", "First Element: " + arrayCity.get(0));

        arrayCity.remove(0);
        Log.d("DuanPham", "First Element: " + arrayCity.get(0));

        for(String city: arrayCity) {
            Log.d("DuanPham", city);
        }


        hello("Duan", 22);
        hello("Nick", 23);
        hello("Anna", 24);
    }

    private void hello(String name, int age) {
        Log.d("DuanPham", "Bonjour! je m'applle " + name +",j'ai " + age + " ans");
    }
}
