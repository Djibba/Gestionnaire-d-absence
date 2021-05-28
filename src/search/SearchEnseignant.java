/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Enseignant;
import Entite.Etudiant;
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
public class SearchEnseignant {
    
    Requete requete = new Requete();
    Enseignant ens = new Enseignant();
    
    ////////////////Rechercher par idEnseignant///////////////////
    
     public ArrayList<Enseignant> RechercherParidEnseignant(int id_ens) {
        try {
            String req = "SELECT * FROM enseignant WHERE id_enseignant='" + id_ens + "'" ;
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                ens.setIdEnseignant(res.getInt(1));
                ens.setNom(res.getString(2));
                ens.setPrenom(res.getString(3));
                ens.setEmailEnseignant(res.getString(4));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                liste.add(ens);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     
     ////////////////Rechercher par nom///////////////////
    
     public ArrayList<Enseignant> RechercherParNom(String nom) {
        try {
            String req = "SELECT * FROM enseignant WHERE nom_enseignant='" + nom + "'" ;
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                ens.setIdEnseignant(res.getInt(1));
                ens.setNom(res.getString(2));
                ens.setPrenom(res.getString(3));
                ens.setEmailEnseignant(res.getString(4));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                liste.add(ens);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par telephone///////////////////
    
     public ArrayList<Enseignant> RechercherParTelephone(String tel) {
        try {
            String req = "SELECT * FROM enseignant WHERE tel_enseignant='" + tel + "'" ;
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                ens.setIdEnseignant(res.getInt(1));
                ens.setNom(res.getString(2));
                ens.setPrenom(res.getString(3));
                ens.setEmailEnseignant(res.getString(4));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                liste.add(ens);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par prenom///////////////////
    
     public ArrayList<Enseignant> RechercherParPrenom(String prenom) {
        try {
            String req = "SELECT * FROM enseignant WHERE prenom_enseignant='" + prenom + "'" ;
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                ens.setIdEnseignant(res.getInt(1));
                ens.setNom(res.getString(2));
                ens.setPrenom(res.getString(3));
                ens.setEmailEnseignant(res.getString(4));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                liste.add(ens);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par email///////////////////
    
     public ArrayList<Enseignant> RechercherParEmail(String email) {
        try {
            String req = "SELECT * FROM enseignant WHERE email_enseignant='" + email + "'" ;
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                ens.setIdEnseignant(res.getInt(1));
                ens.setNom(res.getString(2));
                ens.setPrenom(res.getString(3));
                ens.setEmailEnseignant(res.getString(4));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                liste.add(ens);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par iduser///////////////////
    
     public ArrayList<Enseignant> RechercherParIduser(User id_user) {
        try {
            String req = "SELECT * FROM enseignant WHERE id_user='" + id_user.getId_user()+ "'" ;
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            
            
            while (res.next()) {
                ens.setIdEnseignant(res.getInt(1));
                ens.setNom(res.getString(2));
                ens.setPrenom(res.getString(3));
                ens.setEmailEnseignant(res.getString(4));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                ens.setTelEnseignant(res.getString(5));
                ens.setIdUser(res.getInt(6));
                liste.add(ens);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     
     ////////////////Rechercher par idEnseignant///////////////////
    
     public ArrayList<Enseignant> RechercherTousLesElement() {
        try {
            String req = "SELECT * FROM enseignant";
            ArrayList<Enseignant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            Enseignant enseignant;
            
            while (res.next()) {
                enseignant = new Enseignant(res.getInt("id_enseignant"),res.getString("nom_enseignant"),res.getString("prenom_enseignant"),res.getString("email_enseignant"),res.getString("tel_enseignant"),res.getString("module"));
//                ens.setIdEnseignant(res.getInt(1));
//                ens.setNom(res.getString(2));
//                ens.setPrenom(res.getString(3));
//                ens.setEmailEnseignant(res.getString(4));
//                ens.setTelEnseignant(res.getString(5));
//                ens.setIdUser(res.getInt(6));
                liste.add(enseignant);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
       
}
