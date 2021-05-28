/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import BDD.Requete;
import Test.md5;

/**
 *
 * @author seck
 */
public class Admin {
    Requete requete = new Requete();
    md5 hacher = new md5();
    Classe C1 = new Classe();
    Enseignant Ens = new Enseignant();
    Etudiant Et = new Etudiant();
    
    public boolean AjouterEtudiant(Etudiant e) {
          String req ="INSERT INTO etudiant (nom_etudiant,prenom_etudiant,sexe,datenaissance_etudiant,classe,email_etudiant,tel_etudiant,"
                    + "numeroCarte )"
                    + "VALUES ('"+e.getNom()+"','"+e.getPrenom()+"','"+e.getSexe()+
                    "','"+e.getDateNaissance()+"','"+e.getClasse()+"','"+e.getEmailEtudiant()+"','"+e.getTelEtudiant()+
                    "','"+e.getNumeroCarte()+"')";
        return requete.exeCreate(req);
    }
    
    public boolean AjouterEnseignant(Enseignant ens) {
        String req ="INSERT INTO `enseignant`(`NOM_ENSEIGNANT`, `PRENOM_ENSEIGNANT`, `EMAIL_ENSEIGNANT`, `TEL_ENSEIGNANT`,`module`)"
                + " VALUES ('"+ens.getNom()+"','"+ens.getPrenom()+"','"+ens.getEmailEnseignant()+"','"+ens.getTelEnseignant()+"','"+ens.getModule()+"')";
        return requete.exeCreate(req);
    }
    
    public boolean AjouterUserEns(User user) {
        String password = new String(user.getPwd());
        String pass = hacher.hachPassword(password);
        String profil= "Enseignant";
        String req ="INSERT INTO `user`(`login`, `pwd`, `profil`,`id_enseignant`)"
                + " VALUES ('"+user.getLogin()+"','"+pass+"','"+profil+"','"+user.getId_enseignant()+"')";
        return requete.exeCreate(req);
    }
    
    public boolean AjouterUserET(User user) {
        String password = new String(user.getPwd());
        String pass = hacher.hachPassword(password);
        String profil= "Etudiant";
        String req ="INSERT INTO `user`(`login`, `pwd`, `profil`,`id_etudiant`)"
                + " VALUES ('"+user.getLogin()+"','"+pass+"','"+profil+"','"+user.getId_etudiant()+"')";
        return requete.exeCreate(req);
    }
    
    public boolean SupprimerEtudiant(Etudiant et){
        String req = "DELETE FROM `etudiant` WHERE id_etudiant="+et.getIdEtudiant();
        return requete.exeDelete(req);
    }
    public boolean SupprimerEnseignant(Enseignant ens){
        String req = "DELETE FROM `enseignant` WHERE id_enseignant="+ens.getIdEnseignant();
        return requete.exeDelete(req);
    
    }
    
    public boolean SupprimerUser(User us){
        String req = "DELETE FROM `user` WHERE id_user="+us.getId_user();
        return requete.exeDelete(req);
    
    }
    
    public boolean ModifierEtudiant(Etudiant et){
        String req = "UPDATE `etudiant` SET `NOM_ETUDIANT`='"+et.getNom()+"',`PRENOM_ETUDIANT`='"+et.getPrenom()+
                "',`sexe`='"+et.getSexe()+"',`DATENAISSANCE_ETUDIANT`='"+et.getDateNaissance()+
                "',`STATUS_ETUDIANT`='"+et.getStatusEtudiant()+"',`EMAIL_ETUDIANT`='"+et.getEmailEtudiant()+
                "',`TEL_ETUDIANT`='"+et.getTelEtudiant()+"',`NUMEROCARTE`='"+et.getNumeroCarte()+"'WHERE id_etudiant="+et.getIdEtudiant();
        return requete.exeUpdate(req);
    }
    public boolean ModifierStatusToPresent(Etudiant et){
        String req = "UPDATE `etudiant` SET `STATUS_ETUDIANT`='"+"present"+"'WHERE id_etudiant="+et.getIdEtudiant();
        return requete.exeUpdate(req);
    }
    public boolean ModifierStatusToAbsent(Etudiant et){
        String req = "UPDATE `etudiant` SET `STATUS_ETUDIANT`='"+"absent"+"'WHERE id_etudiant="+et.getIdEtudiant();
        return requete.exeUpdate(req);
    }
     public boolean ModifierEnseignant(Enseignant ens){
        String req = "UPDATE `enseignant` SET `NOM_ENSEIGNANT`='"+ens.getNom()+"',`PRENOM_ENSEIGNANT`='"+ens.getPrenom()+
               "',`EMAIL_ENSEIGNANT`='"+ens.getEmailEnseignant()+
                "',`TEL_ENSEIGNANT`='"+ens.getTelEnseignant()+"',`module`='"+ens.getModule()+"'WHERE id_enseignant="+ens.getIdEnseignant();
        return requete.exeUpdate(req);
    }
     
public boolean ModifierUser(int id,String login,String password){
     //String password = new String(user.getPwd());
     String pass = hacher.hachPassword(password);
        String req = "UPDATE `User` SET `login`='"+login+"',`pwd`='"+pass+
               "'WHERE id_user="+id;
        return requete.exeUpdate(req);
    }

    
}
