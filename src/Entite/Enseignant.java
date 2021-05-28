package Entite;

import BDD.MyConnexion;
import BDD.Requete;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Enseignant  {

    private int idEnseignant;
    private String nom;
    private String prenom;
    private String emailEnseignant;
    private String telEnseignant;
    private String module;
    private int idUser;
    MyConnexion mc = MyConnexion.getInstance();
    Requete req = new Requete();

    public Enseignant() {
       
    }

    public Enseignant(int idEnseignant, String nom, String prenom, String emailEnseignant, String telEnseignant) {
        this.idEnseignant = idEnseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
        this.telEnseignant = telEnseignant;
    }

    public Enseignant(int idEnseignant, String nom, String prenom, String emailEnseignant) {
        this.idEnseignant = idEnseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
    }

    public Enseignant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    

    public Enseignant(String nom, String prenom, String emailEnseignant, String telEnseignant) {
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
        this.telEnseignant = telEnseignant;
    }
    

    public Enseignant(int idEnseignant, String nom, String prenom, String emailEnseignant, String telEnseignant, int idUser) {
        this.idEnseignant = idEnseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
        this.telEnseignant = telEnseignant;
        this.idUser = idUser;
    }

    public Enseignant(int idUser) {
        this.idUser = idUser;
    }

    public Enseignant(String nom, String prenom, String emailEnseignant, String telEnseignant, String module) {
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
        this.telEnseignant = telEnseignant;
        this.module = module;
    }

    public Enseignant(int idEnseignant, String nom, String prenom, String emailEnseignant, String telEnseignant, String module) {
        this.idEnseignant = idEnseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
        this.telEnseignant = telEnseignant;
        this.module = module;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getIdEnseignant() {
         int id_enseignant=0;
         //System.err.println(this.emailEnseignant);
       try {
           String query="SELECT id_enseignant FROM enseignant WHERE email_enseignant = ?" ;
           ResultSet result ;
           PreparedStatement ps = mc.getConnexion().prepareStatement(query);
           ps.setString(1, this.emailEnseignant);
                result=ps.executeQuery();
           while(result.next()){
          id_enseignant= result.getInt("id_enseignant");
          //System.err.println(id_enseignant);
          }
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
        return id_enseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
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

    public String getEmailEnseignant() {
        return emailEnseignant;
    }

    public void setEmailEnseignant(String emailEnseignant) {
        this.emailEnseignant = emailEnseignant;
    }

    public String getTelEnseignant() {
        return telEnseignant;
    }

    public void setTelEnseignant(String telEnseignant) {
        this.telEnseignant = telEnseignant;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

  


    
}
