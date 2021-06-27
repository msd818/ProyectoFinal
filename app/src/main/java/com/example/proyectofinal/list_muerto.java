package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectofinal.apimanager.RetrofitClient;
import com.example.proyectofinal.models.Muerto;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_muerto extends AppCompatActivity {

    ListView listMuertos;
    List<Muerto> myMuerto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_muerto);

        listMuertos = findViewById(R.id.ListVMuerto);
        getFromInternetMuertos();
    }

    private void getFromInternetMuertos(){
        Call<List<Muerto>> call= RetrofitClient.getInstance().getMyApi().getMuerto();
        call.enqueue(new Callback<List<Muerto>>() {

            @Override
            public void onResponse(Call<List<Muerto>> call, Response<List<Muerto>> response) {
                myMuerto = response.body();
                String message ="";
                MuertoAdapter adapter = new MuertoAdapter(list_muerto.this, myMuerto);
                listMuertos.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Muerto>> call, Throwable t) {
                Toast.makeText(list_muerto.this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        });
    }
}