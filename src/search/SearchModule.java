/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.MyConnexion;
import BDD.Requete;
import Entite.Enseignant;
import Entite.Module;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class SearchModule {
    Requete requete=new Requete();
    Module mod = new Module();
    PreparedStatement ps;
     MyConnexion mc = MyConnexion.getInstance();
     ////////////////Rechercher par idmodule///////////////////
    
     public ArrayList<Module> RechercherParIdmodule(int id_module) {
        try {
            String req = "SELECT * FROM module WHERE id_module='" + id_module + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par nom///////////////////
    
     public ArrayList<Module> RechercherParnom(String nom) {
        try {
            String req = "SELECT * FROM module WHERE nom_module='" + nom + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     
    ////////////////Rechercher par jour et heure///////////////////
    
     public Module RechercherParJourHeure(int jour, int heure) {
        try {
            heure=heure*60;
            String req = "SELECT * FROM module WHERE jour= ? and (heure_debut < ? and heure_fin > ?)" ;
             ps = mc.getConnexion().prepareStatement(req);
            ps.setInt(1, jour);
            ps.setInt(2, heure);
            ps.setInt(3, heure);
           
            Module liste = new Module();
            ResultSet res = ps.executeQuery();  
            while (res.next()) {
                liste.setIdModule(res.getInt(1));
                liste.setNomModule(res.getString(2));
                liste.setHeureDebut(res.getInt(3));
                liste.setHeureFin(res.getInt(4));
              
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     
     ////////////////Rechercher par heurdebut///////////////////
    
     public ArrayList<Module> RechercherParHeurdebut(int heurdebut) {
        try {
            String req = "SELECT * FROM module WHERE heure_debut='" + heurdebut + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par heurfin///////////////////
    
     public ArrayList<Module> RechercherParHeurfin(int heurfin) {
        try {
            String req = "SELECT * FROM module WHERE heure_fin='" + heurfin + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
