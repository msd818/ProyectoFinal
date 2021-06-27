package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectofinal.apimanager.RetrofitClient;
import com.example.proyectofinal.models.Episodio;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_episodio extends AppCompatActivity {

    ListView listEpisodios;
    List<Episodio> myEpisodio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_episodio);

        listEpisodios = findViewById(R.id.ListVEpisodio);
        getFromInternetEpisodios();
    }

    private void getFromInternetEpisodios(){
        Call<List<Episodio>> call= RetrofitClient.getInstance().getMyApi().getEpisodios();
        call.enqueue(new Callback<List<Episodio>>() {

            @Override
            public void onResponse(Call<List<Episodio>> call, Response<List<Episodio>> response) {
                myEpisodio = response.body();
                String message ="";
                EpisodioAdapter adapter = new EpisodioAdapter(list_episodio.this, myEpisodio);
                listEpisodios.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Episodio>> call, Throwable t) {
                Toast.makeText(list_episodio.this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        });
    }
}