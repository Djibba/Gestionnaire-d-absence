package BDD;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnexion     {

    static String login = "root"; 

    static String pwd = ""; 

    static String url = "jdbc:mysql://localhost:3306/gestionabsence";

    public static  Connection connexion;
    /* Elle sera utilisée en externe pour la connexion avec les BD */

    private static MyConnexion instance;


    public MyConnexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); /* Chargement du piote de JDBC en mémoire */
            System.out.println("Driver chargé");

            connexion = DriverManager.getConnection(url, login, pwd);
            /* Tester la connexion */
            System.out.println("Connetion a la BD reussie");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver n'est pas chargé");
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Connetion a la BD echoué");
            Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnexion() {
        return connexion;
    }

    public static MyConnexion getInstance() { /* Afin que la connexion ne s'établisse qu'une seule fois */
        if(instance==null)
            instance = new MyConnexion();
        System.out.println("Utilisation de la connexion precedement établie");
        return instance;
    }
  

    
}
