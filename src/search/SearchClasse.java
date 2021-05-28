/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Classe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class SearchClasse {
    
    Requete requete = new Requete();
    
     public Classe RechercherParId(int i) {
        String req = "SELECT * FROM classe WHERE id_Classe="+i;
        Classe c = new Classe();
        ResultSet res = requete.exeRead(req);
        
        try {
            while (res.next()) {
                c.setIdClasse(res.getInt(1));
                c.setNomClasse((res.getString(2)));
                c.setAnneeScolaire(res.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
            return c;
       
    }
     
     public ArrayList<Classe> RechercherParNomClasse(String classe) {
        String req = "SELECT * FROM classe WHERE nom_classe='" + classe + "'";
        ArrayList<Classe> liste = new ArrayList<>();
        Classe c = new Classe();
        ResultSet res = requete.exeRead(req);
        
        try {
            while (res.next()) {
                c.setIdClasse(res.getInt(1));
                c.setNomClasse((res.getString(2)));
                c.setAnneeScolaire(res.getString(3));
                liste.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
            return liste;
       
    }
     
    public ArrayList<Classe> RechercherParAnnee(String annee) {
        String req = "SELECT * FROM classe WHERE annee_scolaire='" + annee + "'";
        ArrayList<Classe> liste = new ArrayList<>();
        Classe c = new Classe();
        ResultSet res = requete.exeRead(req);
        
        try {
            while (res.next()) {
                c.setIdClasse(res.getInt(1));
                c.setNomClasse((res.getString(2)));
                c.setAnneeScolaire(res.getString(3));
                liste.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
            return liste;
       
    }
     
}
