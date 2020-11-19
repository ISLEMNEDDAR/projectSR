package projectSR.Server.Model;

import projectSR.Server.Enum.Etat;
import projectSR.Server.Enum.Service;

public class Personnel {
    private int identifiant;
    private String nom_prenom;
    private Etat etat;
    private Service service;
    private double freq_cardiaque;
    private double taux_sudation;
    private Position coordonnes;



    //Constructeur

    public Personnel(int identifiant, String nom_prenom, Etat etat, Service service, double freq_cardiaque, double taux_sudation, Position coordonnes) {
        this.identifiant = identifiant;
        this.nom_prenom = nom_prenom;
        this.etat = etat;
        this.service = service;
        this.freq_cardiaque = freq_cardiaque;
        this.taux_sudation = taux_sudation;
        this.coordonnes = coordonnes;
    }


    // Getters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }

    public Etat getEtat() {
        return etat;
    }

    public Service getService() {
        return service;
    }

    public double getFreq_cardiaque() {
        return freq_cardiaque;
    }

    public double getTaux_sudation() {
        return taux_sudation;
    }

    public Position getCoordonnes() {
        return coordonnes;
    }


    //Setters

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom_prenom(String nom_prenom) {
        this.nom_prenom = nom_prenom;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setFreq_cardiaque(float freq_cardiaque) {
        this.freq_cardiaque = freq_cardiaque;
    }

    public void setTaux_sudation(float taux_sudation) {
        this.taux_sudation = taux_sudation;
    }

    public void setCoordonnes(Position coordonnes) {
        this.coordonnes = coordonnes;
    }
}
