package com.example.matapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bangundatar2 extends AppCompatActivity {
    EditText txtpanjang, txtlebar;
    Button hitungkl;
    TextView txtluas, txtkeliling;
    Double panjang, lebar, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangundatar2);

        txtpanjang = (EditText) findViewById(R.id.txtpanjang);
        txtlebar = (EditText) findViewById(R.id.txtlebar);
        hitungkl = (Button) findViewById(R.id.hitungkl);
        txtluas = (TextView) findViewById(R.id.txtluas);
        txtkeliling = (TextView) findViewById(R.id.txtkeliling);

        hitungkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpanjang=((EditText) txtpanjang).getText().toString();
                String strlebar=((EditText) txtlebar).getText().toString();
                switch (v.getId()) {
                    case R.id.hitungkl:
                        hideKeybaord(v);
                        break;
                }

                if (txtpanjang.length()==0) {
                    txtpanjang.setError("Tidak Boleh Kosong!");
                }  else if (txtlebar.length()==0) {
                    txtlebar.setError("Tidak Boleh Kosong!");
                }
                else {
                    panjang=Double.parseDouble(strpanjang);
                    lebar=Double.parseDouble(strlebar);

                    luas= panjang*lebar;
                    keliling= (2*panjang)+(2*lebar);

                    txtluas.setText(""+luas);
                    txtkeliling.setText(""+keliling);
                }
            }
            private void hideKeybaord(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
            }
        });
    }
    public void checkkembali (View arg0) {
        Intent intent = new Intent(bangundatar2.this, MenuActivity.class);
        startActivity(intent);
    }
}
