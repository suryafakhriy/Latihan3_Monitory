package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nama_umur extends AppCompatActivity {

    private EditText edt_Nama;
    private String nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_umur);

        edt_Nama = findViewById(R.id.edt_nama);

        Button sl = findViewById(R.id.btn_selanjutnya);
        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nm = edt_Nama.getText().toString();

                Intent i = new Intent(Nama_umur.this,HalamanAkhir.class);
                i.putExtra("dataNama",nm);
                startActivity(i);
                finish();
            }
        });

    }
}