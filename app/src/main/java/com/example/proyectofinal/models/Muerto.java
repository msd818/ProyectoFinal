package com.example.proyectofinal.models;

import com.google.gson.annotations.SerializedName;

public class Muerto {
    @SerializedName("death_id")
    private String idMuerto;
    @SerializedName("death")
    private String deathMuerto;
    @SerializedName("cause")
    private String causeMuerto;
    @SerializedName("responsible")
    private String responsibleMuerto;
    @SerializedName("last_words")
    private String last_wordsMuerto;

    public String getIdMuerto() {
        return idMuerto;
    }

    public void setIdMuerto(String idMuerto) {
        this.idMuerto = idMuerto;
    }

    public String getDeathMuerto() {
        return deathMuerto;
    }

    public void setDeathMuerto(String deathMuerto) {
        this.deathMuerto = deathMuerto;
    }

    public String getCauseMuerto() {
        return causeMuerto;
    }

    public void setCauseMuerto(String causeMuerto) {
        this.causeMuerto = causeMuerto;
    }

    public String getResponsibleMuerto() {
        return responsibleMuerto;
    }

    public void setResponsibleMuerto(String responsibleMuerto) {
        this.responsibleMuerto = responsibleMuerto;
    }

    public String getLast_wordsMuerto() {
        return last_wordsMuerto;
    }

    public void setLast_wordsMuerto(String last_wordsMuerto) {
        this.last_wordsMuerto = last_wordsMuerto;
    }
}
