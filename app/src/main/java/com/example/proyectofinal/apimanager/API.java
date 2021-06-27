package com.example.proyectofinal.apimanager;

import com.example.proyectofinal.models.Cita;
import com.example.proyectofinal.models.Episodio;
import com.example.proyectofinal.models.Muerto;
import com.example.proyectofinal.models.Personaje;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String BASE_URL = "https://www.breakingbadapi.com/api/";

    @GET("characters")
    Call<List<Personaje>> getPersonajes();

    @GET("episodes")
    Call<List<Episodio>>getEpisodios();

    @GET("quotes")
    Call<List<Cita>>getCita();

    @GET("deaths")
    Call<List<Muerto>>getMuerto();
}
