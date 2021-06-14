package com.example.authentification;

public class dataholder {
    String nom;
    String prenom;
    String age;
    String taille;
    String uidhome;

    public String getUidhome() {
        return uidhome;
    }

    public void setUidhome(String uidhome) {
        this.uidhome = uidhome;
    }

    public dataholder(String uidhome) {
        this.uidhome = uidhome;
    }



    public dataholder(String nom, String prenom, String age, String taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }
}
