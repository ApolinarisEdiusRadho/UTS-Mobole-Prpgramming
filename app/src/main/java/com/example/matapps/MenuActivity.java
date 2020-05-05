package com.example.matapps;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void checkbangundatar1 (View arg0) {
        Intent intent = new Intent(MenuActivity.this, bangundatar1.class);
        startActivity(intent);
    }

    public void checkbangundatar2 (View arg0) {
        Intent intent = new Intent(MenuActivity.this, bangundatar2.class);
        startActivity(intent);
    }

    public void checkbangunruang (View arg0) {
        Intent intent = new Intent(MenuActivity.this, bangunruang.class);
        startActivity(intent);
    }


    public void checkKeluar (View arg0) {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

