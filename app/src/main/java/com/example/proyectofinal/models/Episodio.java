package com.example.proyectofinal.models;

import com.google.gson.annotations.SerializedName;

public class Episodio {

    @SerializedName("episode_id")
    private String idEpisodio;
    @SerializedName("title")
    private String titleEpisodio;
    @SerializedName("season")
    private String seasonEpisodio;
    @SerializedName("episode")
    private String episodeEpisodio;
    @SerializedName("air_date")
    private String dateEpisodio;


    public String getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(String idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public String getTitleEpisodio() {
        return titleEpisodio;
    }

    public void setTitleEpisodio(String titleEpisodio) {
        this.titleEpisodio = titleEpisodio;
    }

    public String getSeasonEpisodio() {
        return seasonEpisodio;
    }

    public void setSeasonEpisodio(String seasonEpisodio) {
        this.seasonEpisodio = seasonEpisodio;
    }

    public String getDateEpisodio() {
        return dateEpisodio;
    }

    public void setDateEpisodio(String dateEpisodio) {
        this.dateEpisodio = dateEpisodio;
    }

    public String getEpisodeEpisodio() {
        return episodeEpisodio;
    }

    public void setEpisodeEpisodio(String episodeEpisodio) {
        this.episodeEpisodio = episodeEpisodio;
    }
}
