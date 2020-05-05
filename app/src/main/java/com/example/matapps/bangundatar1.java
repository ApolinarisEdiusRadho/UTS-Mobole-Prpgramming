package com.example.matapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bangundatar1 extends AppCompatActivity {

    EditText txtsisi;
    Button hitunglk;
    TextView txtluas, txtkeliling;
    Double sisi, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangundatar1);

        txtsisi = (EditText) findViewById(R.id.txtsisi);
        hitunglk = (Button) findViewById(R.id.hitunglk);
        txtluas = (TextView) findViewById(R.id.txtluas);
        txtkeliling = (TextView) findViewById(R.id.txtkeliling);

        hitunglk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strsisi = ((EditText) txtsisi).getText().toString();
                switch (v.getId()) {
                    case R.id.hitunglk:
                        hideKeybaord(v);
                        break;
                }

                if (txtsisi.length() == 0) {
                    txtsisi.setError("Tidak Boleh Kosong!");
                } else {
                    sisi = Double.parseDouble(strsisi);

                    luas = sisi * sisi;
                    keliling = 4 * sisi;

                    txtluas.setText("" + luas);
                    txtkeliling.setText("" + keliling);
                }
            }

            private void hideKeybaord(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
            }
        });
    }

    public void checkkembali (View arg0) {
        Intent intent = new Intent(bangundatar1.this, MenuActivity.class);
        startActivity(intent);
    }

}