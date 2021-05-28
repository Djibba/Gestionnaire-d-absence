/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.MyConnexion;
import BDD.Requete;
import Entite.Admin;
import Entite.Etudiant;
import Entite.listePresence;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author seck
 */
public class searchListePresence {
    Requete requete = new Requete();
    listePresence list=new listePresence();
    MyConnexion mc = MyConnexion.getInstance();
    SearchEtudiant sE = new SearchEtudiant();
    Admin ad = new Admin();
    ////////////////Recherche par Etudiant///////////////////
    
    public ArrayList<listePresence> RechercherParEtudiant(String date, int heureDebut, int heureFin){
        //listePresence listPresence = new listePresence();
        ArrayList<listePresence> liste = new ArrayList<>();
        try {
            String req = "SELECT * FROM `liste_presence` WHERE `DATE` = ?  AND heure between ? AND ?"; 
            ResultSet result ;
            PreparedStatement ps = mc.getConnexion().prepareStatement(req);
            ps.setString(1,date);
            ps.setInt(2, heureDebut);
            ps.setInt(3, heureFin);
            result=ps.executeQuery();
            
            //result = requete.exeRead(req);    
            SearchEtudiant sEt = new SearchEtudiant();
            int id_etudiant;
            int i =0;
            while (result.next()) {
                id_etudiant = result.getInt("id_etudiant");
                liste.add(new listePresence(sEt.RechercherParId(id_etudiant),result.getString("date"),result.getInt("heure"),result.getInt("jour")));
                i++;
            }
            
            result.close();
            ps.close();
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    
    public ArrayList<Etudiant> listeDePresence(String date, int heureDebut, int heureFin){
        ArrayList<Etudiant> list =sE.RechercherTousLesElement();
        for (Etudiant list1 : list) {
            ad.ModifierStatusToAbsent(list1);
        }
        ArrayList<listePresence> listPresence = this.RechercherParEtudiant(date, heureDebut, heureFin);
        if(listPresence.isEmpty()){
            ArrayList<Etudiant> liste = new ArrayList<>();
            return liste  ;
        }else{
        for (listePresence listPresence1 : listPresence) {
            ad.ModifierStatusToPresent(listPresence1.getEtudiant());
        }
        
        list =sE.RechercherTousLesElement();        
       return list;
       }
    }
     
}
