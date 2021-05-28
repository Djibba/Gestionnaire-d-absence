/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;


public class Surveillant {

    private int idResponsable;
    private String nomResponsable;
    private String prenomResponsable;

    public Surveillant() {
        
    }

    public Surveillant(int idResponsable, String nomResponsable, String prenomResponsable) {
        this.idResponsable = idResponsable;
        this.nomResponsable = nomResponsable;
        this.prenomResponsable = prenomResponsable;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public String getPrenomResponsable() {
        return prenomResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    public void setPrenomResponsable(String prenomResponsable) {
        this.prenomResponsable = prenomResponsable;
    }

    @Override
    public String toString() {
        return "Nom : "+nomResponsable+" \n" +
                "Prenom : "+prenomResponsable+" \n\n";
    }



}
