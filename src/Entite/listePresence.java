/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author seck
 */
public class listePresence {
    private Etudiant etudiant;
    private String date;
    private int heure;
    private int jour;

    public listePresence() {
    }

    public listePresence(Etudiant etudiant, String date, int heure, int jour) {
        this.etudiant = etudiant;
        this.date = date;
        this.heure = heure;
        this.jour = jour;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }
    
   
}

