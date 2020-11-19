package projectSR.Server.Model;

import projectSR.Server.Enum.Sujet;

import java.util.Date;

public class Formation {

    private String nom_formation;
    private Sujet sujet;
    private Date date;
    private double pourcentage_engagement;
    private double pourcentage_satisfaction;
    private String mot_utilise_formateur;
    private String mot_utilise_personnel;



    //Constructeur

    public Formation(String nom_formation, Sujet sujet, Date date, double pourcentage_engagement, double pourcentage_satisfaction, String mot_utilise_formateur, String mot_utilise_personnel) {
        this.nom_formation = nom_formation;
        this.sujet = sujet;
        this.date = date;
        this.pourcentage_engagement = pourcentage_engagement;
        this.pourcentage_satisfaction = pourcentage_satisfaction;
        this.mot_utilise_formateur = mot_utilise_formateur;
        this.mot_utilise_personnel = mot_utilise_personnel;
    }


    // Getters

    public String getNom_formation() {
        return nom_formation;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public Date getDate() {
        return date;
    }

    public double getPourcentage_engagement() {
        return pourcentage_engagement;
    }

    public double getPourcentage_satisfaction() {
        return pourcentage_satisfaction;
    }

    public String getMot_utilise_formateur() {
        return mot_utilise_formateur;
    }

    public String getMot_utilise_personnel() {
        return mot_utilise_personnel;
    }


    //Setters


    public void setNom_formation(String nom_formation) {
        this.nom_formation = nom_formation;
    }

    public void setSujet(Sujet sujet) {
        this.sujet = sujet;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPourcentage_engagement(float pourcentage_engagement) {
        this.pourcentage_engagement = pourcentage_engagement;
    }

    public void setPourcentage_satisfaction(float pourcentage_satisfaction) {
        this.pourcentage_satisfaction = pourcentage_satisfaction;
    }

    public void setMot_utilise_formateur(String mot_utilise_formateur) {
        this.mot_utilise_formateur = mot_utilise_formateur;
    }

    public void setMot_utilise_personnel(String mot_utilise_personnel) {
        this.mot_utilise_personnel = mot_utilise_personnel;
    }
}
