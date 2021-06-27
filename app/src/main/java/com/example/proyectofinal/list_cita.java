package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectofinal.apimanager.RetrofitClient;
import com.example.proyectofinal.models.Cita;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_cita extends AppCompatActivity {
    ListView listCitas;
    List<Cita> myCita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cita);

        listCitas = findViewById(R.id.ListVCita);
        getFromInternetCitas();
    }

    private void getFromInternetCitas(){
        Call<List<Cita>> call= RetrofitClient.getInstance().getMyApi().getCita();
        call.enqueue(new Callback<List<Cita>>() {

            @Override
            public void onResponse(Call<List<Cita>> call, Response<List<Cita>> response) {
                myCita = response.body();
                String message ="";
                CitaAdapter adapter = new CitaAdapter(list_cita.this, myCita);
                listCitas.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Cita>> call, Throwable t) {
                Toast.makeText(list_cita.this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        });
    }
}