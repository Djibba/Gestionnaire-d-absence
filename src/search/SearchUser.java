/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Classe;
import Entite.Enseignant;
import Entite.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class SearchUser {
    Requete requete=new Requete();
     public User RechercherParId(int i) {
        String req = "SELECT * FROM user WHERE id_user=" +i;
        User c = new User();
        ResultSet res = requete.exeRead(req);
        
       
        try {
            while (res.next()) {
                c.setId_user(res.getInt(1));
                c.setLogin((res.getString(2)));
                c.setPwd(res.getString(3));
                c.setProfil(res.getString(4));
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            return c;
       
    }
     
     public ArrayList<User> RechercherParlogin(String login) {
        String req = "SELECT * FROM user WHERE login='" + login + "'";
        User u = new User();
        ArrayList<User> userTab =new  ArrayList<>();
        ResultSet res = requete.exeRead(req);
        
       
        try {
            while (res.next()) {
                u.setId_user(res.getInt(1));
                u.setLogin(res.getString(2));
                u.setPwd(res.getString(3));
                u.setProfil(res.getString(4));
                userTab.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            return userTab;
       
    }
     
     public ArrayList<User> RechercherParProfil(String profil) {
        String req = "SELECT * FROM user WHERE profil='" + profil + "'";
        User u = new User();
        ArrayList<User> userTab =new  ArrayList<>();
        ResultSet res = requete.exeRead(req);
        
       
        try {
            while (res.next()) {
                u.setId_user(res.getInt(1));
                u.setLogin(res.getString(2));
                u.setPwd(res.getString(3));
                u.setProfil(res.getString(4));
                userTab.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            return userTab;
       
    }
     public ArrayList<User> RechercherParIdEns(int id_enseignant) {
        String req = "SELECT * FROM user WHERE id_enseignant=" +id_enseignant;
        User user ;
        ArrayList<User> userTab =new  ArrayList<>();
        ResultSet res = requete.exeRead(req);
        
       
        try {
            while (res.next()) {
//                c.setId_user(res.getInt(1));
//                c.setLogin((res.getString(2)));
//                c.setPwd(res.getString(3));
//                c.setProfil(res.getString(4));
                   user= new User(res.getInt("id_user"),res.getString("login"),res.getString("pwd"));
                userTab.add(user);

            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            return userTab;
       
    }
     
    public ArrayList<Enseignant> RechercherEnsEns(){
        Enseignant enseignant;
        ArrayList tab = new ArrayList();
                try {       
            String req ="SELECT nom_enseignant,prenom_enseignant FROM enseignant,user WHERE enseignant.id_enseignant = user.id_enseignant";
            ResultSet res = requete.exeRead(req); 
            while(res.next()){
                enseignant=new Enseignant(res.getString("nom_enseignant"),res.getString("prenom_enseignant"));
                tab.add(enseignant);
          }
               } catch (SQLException ex) {
                   Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
               }
                return tab;
    }
    
    public ArrayList<User> RechercherEnsUser(){
        User user;
        ArrayList tab = new ArrayList();
                try {       
            String req ="SELECT login,pwd,profil FROM enseignant,user WHERE enseignant.id_enseignant = user.id_enseignant";
            ResultSet res = requete.exeRead(req); 
            while(res.next()){
                user=new User(res.getString("login"),res.getString("profil"),res.getString("pwd"));
                tab.add(user);
          }
               } catch (SQLException ex) {
                   Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
               }
                return tab;
    }
}
