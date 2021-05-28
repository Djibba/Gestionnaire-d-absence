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
public class User {
    private int id_user;
    private String login;
    private String profil;
    private String pwd;
    private int id_etudiant;
    private int id_enseignant;
    public User(int id_user, String login, String profil, String pwd) {
        this.id_user = id_user;
        this.login = login;
        this.profil = profil;
        this.pwd = pwd;
    }

    public User(int id_user) {
        this.id_user = id_user;
    }
    
    public User() {
        
    }

    public User(int id_user, String login, String profil, String pwd, int id_etudiant) {
        this.id_user = id_user;
        this.login = login;
        this.profil = profil;
        this.pwd = pwd;
        this.id_etudiant = id_etudiant;
    }

    public User(String login, String pwd, int id_enseignant) {
        this.login = login;
        this.pwd = pwd;
        this.id_enseignant = id_enseignant;
    }

    public User(String login, String profil, String pwd) {
        this.login = login;
        this.profil = profil;
        this.pwd = pwd;
    }
    
    public User(int id_etudiant,String login,String pwd){
        this.id_etudiant = id_etudiant;
        this.login = login;
        this.pwd = pwd;
    }
    
    public User(String login,String profil){
        this.login = login;
        this.profil = profil;
        
    }
    

    public int getId_user() {    
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public int getId_enseignant() {
        return id_enseignant;
    }

    public void setId_enseignant(int id_enseignant) {
        this.id_enseignant = id_enseignant;
    }
    
    
}
