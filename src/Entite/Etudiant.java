package Entite;

import BDD.MyConnexion;
import BDD.Requete;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Wilfried
 */
public class Etudiant {

    private int idEtudiant;
    private String nom;
    private String prenom;
    private String classe;
    private String emailEtudiant;
    private String telEtudiant;
    private String sexe;
    //private User user;
    private String numeroCarte;
    private String statusEtudiant;
    private String dateNaissance;
    
    Requete req = new Requete();
    MyConnexion mc = MyConnexion.getInstance();
    public Etudiant() {
       
    }

    public Etudiant(int idEtudiant, String nom, String prenom, String emailEtudiant, String telEtudiant, String sexe, String numeroCarte, String dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEtudiant = emailEtudiant;
        this.telEtudiant = telEtudiant;
        this.sexe = sexe;
        this.numeroCarte = numeroCarte;
        this.dateNaissance = dateNaissance;
    }

    public Etudiant(int idEtudiant, String nom, String prenom, String emailEtudiant, String telEtudiant, String sexe, String numeroCarte, String statusEtudiant, String dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEtudiant = emailEtudiant;
        this.telEtudiant = telEtudiant;
        this.sexe = sexe;
        this.numeroCarte = numeroCarte;
        this.statusEtudiant = statusEtudiant;
        this.dateNaissance = dateNaissance;
    }

    public Etudiant(String nom, String prenom, String classe, String emailEtudiant, String telEtudiant, String sexe, String numeroCarte, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.emailEtudiant = emailEtudiant;
        this.telEtudiant = telEtudiant;
        this.sexe = sexe;
        this.numeroCarte = numeroCarte;
        this.dateNaissance = dateNaissance;
    }
    

    public Etudiant(String nom, String prenom, String emailEtudiant, String telEtudiant, String sexe, String numeroCarte, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.emailEtudiant = emailEtudiant;
        this.telEtudiant = telEtudiant;
        this.sexe = sexe;
        this.numeroCarte = numeroCarte;
        this.dateNaissance = dateNaissance;
    }

    public Etudiant(int idEtudiant, String nom, String prenom, String classe, String emailEtudiant, String telEtudiant,String sexe, String numeroCarte, String statusEtudiant, String dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.emailEtudiant = emailEtudiant;
        this.telEtudiant = telEtudiant;
        this.sexe = sexe;
        this.numeroCarte = numeroCarte;
        this.statusEtudiant = statusEtudiant;
        this.dateNaissance = dateNaissance;
    }

    public Etudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    
    
    public int getIdEtudiant() {
        int id_etudiant=0;
         //System.err.println(this.emailEtudiant);
       try {
           String query="SELECT id_etudiant FROM etudiant WHERE email_etudiant = ?" ;
          ResultSet result ;
          PreparedStatement ps = mc.getConnexion().prepareStatement(query);
          ps.setString(1, this.emailEtudiant);
                result=ps.executeQuery();
          while(result.next()){
          id_etudiant = result.getInt("id_etudiant");
          //System.err.println(id_etudiant);
          }
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
        return id_etudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEmailEtudiant() {
        return emailEtudiant;
    }

    public void setEmailEtudiant(String emailEtudiant) {
        this.emailEtudiant = emailEtudiant;
    }

    public String getTelEtudiant() {
        return telEtudiant;
    }

    public void setTelEtudiant(String telEtudiant) {
        this.telEtudiant = telEtudiant;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getStatusEtudiant() {
        return statusEtudiant;
    }

    public void setStatusEtudiant(String statusEtudiant) {
        this.statusEtudiant = statusEtudiant;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    

    

}
