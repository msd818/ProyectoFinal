package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnpersonajes;
    private Button btnepisodios;
    private Button btncitas;
    private Button btnfallecidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpersonajes = findViewById(R.id.btnpersonajes);
        btnpersonajes.setOnClickListener(this);

        btnepisodios = findViewById(R.id.btnepisodios);
        btnepisodios.setOnClickListener(this);

        btncitas = findViewById(R.id.btncitas);
        btncitas.setOnClickListener(this);

        btnfallecidos = findViewById(R.id.btnfallecidos);
        btnfallecidos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnpersonajes) {
            Intent intent= new Intent(this,list_personaje.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnepisodios) {
            Intent intent= new Intent(this,list_episodio.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btncitas) {
            Intent intent= new Intent(this,list_cita.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnfallecidos) {
            Intent intent= new Intent(this,list_muerto.class);
            startActivity(intent);
        }

    }
}