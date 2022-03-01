package com.example.la;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Variabel
    Button btn_lapor, btn_history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Koneksi dengan Variabel
        btn_lapor = findViewById(R.id.btnlapor);
        btn_history = findViewById(R.id.btnhistory);

        btn_lapor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah  = new Intent(MainActivity.this, Form.class );
                startActivity(pindah);
            }
        });
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder pesan = new AlertDialog.Builder(MainActivity.this);
                pesan.setTitle("Warning");
                pesan.setMessage("Apakah anda yakin akan di input?");
//                penambahan Konfirmasi
                pesan.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "bERHASIL", Toast.LENGTH_SHORT).show();
                    }
                });
                pesan.setNegativeButton("No", null);

                pesan.show();
            }
        });

    }
}