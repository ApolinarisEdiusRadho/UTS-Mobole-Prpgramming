package com.example.matapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bangunruang extends AppCompatActivity {

    EditText txtsisi;
    Button hitungvolume;
    TextView txtvolume;
    Double sisi, volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangunruang);

            txtsisi = (EditText) findViewById(R.id.txtsisi);
            hitungvolume = (Button) findViewById(R.id.hitungvolume);
            txtvolume = (TextView) findViewById(R.id.txtvolume);

            hitungvolume.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String strsisi = ((EditText) txtsisi).getText().toString();
                    switch (v.getId()) {
                        case R.id.hitungvolume:
                            hideKeybaord(v);
                            break;
                    }

                    if (txtsisi.length() == 0) {
                        txtsisi.setError("Tidak Boleh Kosong!");
                    } else {
                        sisi = Double.parseDouble(strsisi);

                        volume = sisi * sisi * sisi;

                        txtvolume.setText("" + volume);
                    }
                }

                private void hideKeybaord(View v) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
                }
            });
        }
    public void checkkembali (View arg0) {
        Intent intent = new Intent(bangunruang.this, MenuActivity.class);
        startActivity(intent);
    }


    }

