package com.example.menus_android;

public class AndroidVersion {
    private String nom;
    private String nomCode;
    private int version;
    public AndroidVersion(String nom, String nomCode, int version) {
        this.nom = nom;
        this.nomCode = nomCode;
        this.version = version;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomCode() {
        return nomCode;
    }

    public void setNomCode(String nomCode) {
        this.nomCode = nomCode;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


}
