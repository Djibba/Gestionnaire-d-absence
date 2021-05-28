package BDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class Requete {

    MyConnexion mc = MyConnexion.getInstance();

    public boolean exeCreate(String sql) {  /* Execution de la requete INSERTE */
        try {
            Statement statement = mc.getConnexion().createStatement();
            statement.executeUpdate(sql); /* Execution de la requete */
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Requete.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean exeUpdate(String sql) {  /* Execution de la requete Update */
        try {
            Statement statement = mc.getConnexion().createStatement();
            statement.executeUpdate(sql); /* Execution de la requete */
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Requete.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean exeDelete(String sql) {  /* Execution de la requete DELETE */
        try {
            Statement statement = mc.getConnexion().createStatement();
            statement.executeUpdate(sql); /* Execution de la requete */
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Requete.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


    public ResultSet exeRead(String sql) {  /* Execution de la requete SELECT */
        System.out.println("Test lecture ... Crude");
        try {
            Statement statement = mc.getConnexion().createStatement();
            
            ResultSet re = statement.executeQuery(sql); /* Execution de la requete */
            return re;
        } catch (SQLException ex) {
            Logger.getLogger(Requete.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }






    }