package com.imie.madrental.WS;

public class FormWS
{
    public String voiture;
    public String nom;
    public String image;
    public int prixjournalierbase;
    public String categorieco2;
    public int disponible;
    public int promotion;
    public int agemin;

    public FormWS(String nom, String image, int prixjournalierbase, String categorieco2, int disponible, int promotion, int agemin) {
        this.nom = nom;
        this.image = image;
        this.prixjournalierbase = prixjournalierbase;
        this.categorieco2 = categorieco2;
        this.disponible = disponible;
        this.promotion = promotion;
        this.agemin = agemin;
    }
}
