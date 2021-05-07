package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Tanggal Pengerjaan : 07-05-2021
//Deskripsi          : Latihan 3 Monitory
//NAMA               : Surya Fakhriy Hasbi
//NIM                : 10118028
//Kelas              : IF-1
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mulai = findViewById(R.id.btn_mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Kodekeluarga.class);
                startActivity(i);
                finish();
            }
        });

    }
}