package Entite;

import BDD.Requete;
import java.sql.ResultSet;


public class Classe {

    private int idClasse;
    private String nomClasse;
    private String anneeScolaire;
  Requete req = new Requete();

    public Classe() {
    }

    public Classe(int idClasse, String nomClasse, String anneeScolaire) {
        this.idClasse = idClasse;
        this.nomClasse = nomClasse;
        this.anneeScolaire = anneeScolaire;
    }

    public int getIdClasse() {
        int count = 0;
        String query="SELECT count(*) AS total from classe";
       try {
          ResultSet result = req.exeRead(query);
          result.next();
          count = result.getInt("total");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       return count ;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }



    
}
