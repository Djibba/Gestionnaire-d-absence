/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import BDD.Requete;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class Authentification {
    
    Requete requete =new Requete();
  
     public boolean Connection(String login,String pwd){
        String req = "SELECT * FROM user WHERE login='"+login+"' AND pwd='"+pwd+"'";
        ResultSet res = requete.exeRead(req);
        try {
            if (res.next()) {
                System.out.println("utilisateur trouvé");
                return true;               
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Authentification.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
      
    }
    

