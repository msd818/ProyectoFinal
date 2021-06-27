package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectofinal.apimanager.RetrofitClient;
import com.example.proyectofinal.models.Personaje;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_personaje extends AppCompatActivity {

    ListView listPersonajes;
    List<Personaje> myPersonaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_personaje);

        listPersonajes = findViewById(R.id.ListVPersonajes);
        getFromInternetPersonajes();
    }

    private void getFromInternetPersonajes(){
        Call<List<Personaje>> call= RetrofitClient.getInstance().getMyApi().getPersonajes();
        call.enqueue(new Callback<List<Personaje>>() {

            @Override
            public void onResponse(Call<List<Personaje>> call, Response<List<Personaje>> response) {
                myPersonaje = response.body();
                String message ="";
                PersonajeAdapter adapter = new PersonajeAdapter(list_personaje.this, myPersonaje);
                listPersonajes.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Personaje>> call, Throwable t) {
                Toast.makeText(list_personaje.this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        });
    }
}