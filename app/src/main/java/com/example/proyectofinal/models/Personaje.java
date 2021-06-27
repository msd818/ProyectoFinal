package com.example.proyectofinal.models;

import com.google.gson.annotations.SerializedName;

public class Personaje {
    @SerializedName("char_id")
    private String idPersonaje;
    @SerializedName("name")
    private String namePersonaje;
    @SerializedName("birthday")
    private String birthdayPersonaje;
    @SerializedName("status")
    private String statusPersonaje;
    @SerializedName("nickname")
    private String nicknamePersonaje;


    public String getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(String idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNamePersonaje() {
        return namePersonaje;
    }

    public void setNamePersonaje(String namePersonaje) {
        this.namePersonaje = namePersonaje;
    }

    public String getBirthdayPersonaje() {
        return birthdayPersonaje;
    }

    public void setBirthdayPersonaje(String birthdayPersonaje) {
        this.birthdayPersonaje = birthdayPersonaje;
    }

    public String getStatusPersonaje() {
        return statusPersonaje;
    }

    public void setStatusPersonaje(String statusPersonaje) {
        this.statusPersonaje = statusPersonaje;
    }

    public String getNicknamePersonaje() {
        return nicknamePersonaje;
    }

    public void setNicknamePersonaje(String nicknamePersonaje) {
        this.nicknamePersonaje = nicknamePersonaje;
    }
}
