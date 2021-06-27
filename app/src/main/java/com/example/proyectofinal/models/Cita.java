package com.example.proyectofinal.models;

import com.google.gson.annotations.SerializedName;

public class Cita {
    @SerializedName("quote_id")
    private String idCitas;
    @SerializedName("quote")
    private String quoteCitas;
    @SerializedName("author")
    private String authorCitas;

    public String getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(String idCitas) {
        this.idCitas = idCitas;
    }

    public String getQuoteCitas() {
        return quoteCitas;
    }

    public void setQuoteCitas(String quoteCitas) {
        this.quoteCitas = quoteCitas;
    }

    public String getAuthorCitas() {
        return authorCitas;
    }

    public void setAuthorCitas(String authorCitas) {
        this.authorCitas = authorCitas;
    }
}
