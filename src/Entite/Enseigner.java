/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author seck
 */
public class Enseigner {
    private Enseignant enseignant;
    private Module module;

    public Enseigner() {
    }

    public Enseigner(Enseignant enseignant, Module module) {
        this.enseignant = enseignant;
        this.module = module;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
    
}
