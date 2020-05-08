package com.example.a13020170076;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double a, b, c;
    private EditText luasalas, tinggi, volume;
    private TextView hasil;
    private Button hitung, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luasalas = (EditText) findViewById(R.id.editText);
        tinggi = (EditText) findViewById(R.id.editText2);
        volume = (EditText) findViewById(R.id.editText3);
        hasil = (TextView) findViewById(R.id.editText3);
        hitung = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.button2);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a1 = Double.parseDouble(luasalas.getText().toString());
                double a2 = Double.parseDouble(tinggi.getText().toString());

                a=a1;
                b=a2;

                c=(a*b)/3;

                hasil.setText("   "+c);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("");
                luasalas.setText("");
                tinggi.setText("");
                luasalas.requestFocus();
            }
        });
    }
}
