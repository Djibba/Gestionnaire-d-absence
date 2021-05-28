package Entite;


public class Module {
    private String nomModule;
    private int heureDebut;
    private int heureFin;
    private int idModule;
    
    

    public Module() {
    }

    public Module(String nomModule, int heureDebut, int heureFin, int idModule) {
        this.nomModule = nomModule;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.idModule = idModule;
    }

    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }



    
}
