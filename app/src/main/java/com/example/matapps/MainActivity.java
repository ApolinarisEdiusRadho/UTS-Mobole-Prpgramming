package com.example.matapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText useredittext;
    private EditText passedittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        useredittext = (EditText) findViewById(R.id.txtusername);
        passedittext = (EditText) findViewById(R.id.txtpassword);
    }

        public void checkLogin (View arg0) {

        if (useredittext.getText().toString().equals("18101045") && passedittext.getText().toString().equals("18101045"))
        {
        Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah", Toast.LENGTH_SHORT).show();
        }
    }
}