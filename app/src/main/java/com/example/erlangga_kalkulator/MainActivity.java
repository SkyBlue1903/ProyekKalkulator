package com.example.erlangga_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etInput1, etInput2;
    Button btTambah, btKurang, btKali, btBagi;
    TextView tvHasildari;
    double dInput1, dInput2, dHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput1 = findViewById(R.id.etInput1);
        etInput2 = findViewById(R.id.etInput2);
        btTambah = findViewById(R.id.btTambah);
        btKurang = findViewById(R.id.btKurang);
        btKali = findViewById(R.id.btKali);
        btBagi = findViewById(R.id.btBagi);
        tvHasildari = findViewById(R.id.tvHasildari);

        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etInput1.getText().toString().equalsIgnoreCase("")||etInput2.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !",Toast.LENGTH_SHORT).show();
                }else{
                    dInput1 = Double.parseDouble(etInput1.getText().toString());
                    dInput2 = Double.parseDouble(etInput2.getText().toString());
                    dHasil = dInput1 + dInput2;
                    tvHasildari.setText(etInput1.getText().toString() + " + " + etInput2.getText().toString() + " = " + dHasil);
                    etInput1.setText("");
                    etInput2.setText("");
                }
            }
        });

        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etInput1.getText().toString().equalsIgnoreCase("")||etInput2.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !",Toast.LENGTH_SHORT).show();
                }else{
                    dInput1 = Double.parseDouble(etInput1.getText().toString());
                    dInput2 = Double.parseDouble(etInput2.getText().toString());
                    dHasil = dInput1 - dInput2;
                    tvHasildari.setText(etInput1.getText().toString() + " - " + etInput2.getText().toString() + " = " + dHasil);
                    etInput1.setText("");
                    etInput2.setText("");
                }
            }
        });

        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etInput1.getText().toString().equalsIgnoreCase("")||etInput2.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !",Toast.LENGTH_SHORT).show();
                }else{
                    dInput1 = Double.parseDouble(etInput1.getText().toString());
                    dInput2 = Double.parseDouble(etInput2.getText().toString());
                    dHasil = dInput1 * dInput2;
                    tvHasildari.setText(etInput1.getText().toString() + " * " + etInput2.getText().toString() + " = " + dHasil);
                    etInput1.setText("");
                    etInput2.setText("");
                }
            }
        });

        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etInput1.getText().toString().equalsIgnoreCase("")||etInput2.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !",Toast.LENGTH_SHORT).show();
                }else{
                    dInput1 = Double.parseDouble(etInput1.getText().toString());
                    dInput2 = Double.parseDouble(etInput2.getText().toString());
                    dHasil = dInput1 / dInput2;
                    tvHasildari.setText(etInput1.getText().toString() + " / " + etInput2.getText().toString() + " = " + dHasil);
                    etInput1.setText("");
                    etInput2.setText("");
                }
            }
        });
    }
}