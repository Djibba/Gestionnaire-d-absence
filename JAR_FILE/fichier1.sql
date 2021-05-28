/*==============================================================*/
/* Nom de SGBD :  Sybase Anywhere SQL                           */
/* Date de création :  01/10/2019 12:42:54                      */
/*==============================================================*/


/*==============================================================*/
/* Table : CLASSE                                               */
/*==============================================================*/
create table CLASSE (
ID_CLASSE INT not null PRIMARY KEY AUTO_INCREMENT,
NOM_CLASSE VARCHAR(50) NOT NULL,
ANNEE_SCOLAIRE VARCHAR(50)
);

/*==============================================================*/
/* Table : ENSEIGNANT                                           */
/*==============================================================*/
create table ENSEIGNANT (
ID_ENSEIGNANT INT not null PRIMARY KEY AUTO_INCREMENT,
NOM_ENSEIGNANT VARCHAR(50) NOT NULL,
PRENOM_ENSEIGNANT VARCHAR(50) NOT NULL,
EMAIL_ENSEIGNANT VARCHAR(50),
TEL_ENSEIGNANT VARCHAR(50),
ID_USER INT NOT NULL,
CONSTRAINT FK_ENSEIGNANT_USER FOREIGN KEY (ID_USER) REFERENCES USER(ID_USER)
);

/*==============================================================*/
/* Table : ENSEIGNER                                            */
/*==============================================================*/
create table ENSEIGNER (
ID_MODULE INT not null,
ID_ENSEIGNANT INT not null,
CONSTRAINT FK_ENSEIGNER_MODULE FOREIGN KEY (ID_MODULE) REFERENCES MODULE(ID_MODULE),
CONSTRAINT FK_ENSEIGNER_ENSEIGNANT FOREIGN KEY (ID_ENSEIGNANT) REFERENCES ENSEIGNANT(ID_ENSEIGNANT)
);

/*==============================================================*/
/* Table : ETUDIANT                                             */
/*==============================================================*/
create table ETUDIANT (
ID_ETUDIANT INT not null PRIMARY KEY AUTO_INCREMENT,
ID_CLASSE INT not null,
NOM_ETUDIANT VARCHAR(50) NOT NULL,
PRENOM_ETUDIANT VARCHAR(50) NOT NULL,
DATENAISSANCE_ETUDIANT VARCHAR(50),
STATUS_ETUDIANT VARCHAR(50),
EMAIL_ETUDIANT VARCHAR(50),
TEL_ETUDIANT VARCHAR(50),
NUMEROCARTE VARCHAR(50),
ID_USER INT NOT NULL,
CONSTRAINT FK_ETUDIANT_USER FOREIGN KEY (ID_USER) REFERENCES USER(ID_USER),
CONSTRAINT FK_ETUDIANT_CLASSE FOREIGN KEY (ID_CLASSE) REFERENCES CLASSE(ID_CLASSE)
);

/*==============================================================*/
/* Table : LISTE_DE_PRESENCE                                    */
/*==============================================================*/
create table LISTE_DE_PRESENCE (
ID_ETUDIANT INT not null,
ID_MODULE INT not null,
HEURE_DE_COURS DATETIME NOT NULL,
CONSTRAINT FK_LISTE_MODULE FOREIGN KEY (ID_MODULE) REFERENCES MODULE(ID_MODULE),
CONSTRAINT FK_LISTE_ETUDIANT FOREIGN KEY (ID_ETUDIANT) REFERENCES ETUDIANT(ID_ETUDIANT)
);

/*==============================================================*/
/* Table : MODULE                                              */
/*==============================================================*/
create table MODULE (
ID_MODULE INT not null PRIMARY KEY AUTO_INCREMENT,
NOM_MODULE VARCHAR(50) NOT NULL,
HEURE_DEBUT INT NOT NULL,
HEURE_FIN INT NOT NULL
);

/*==============================================================*/
/* Table : USER                                              */
/*==============================================================*/
create table USER (
ID_USER INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
LOGIN VARCHAR(50) NOT NULL,
PWD VARCHAR(50) NOT NULL,
PROFIL VARCHAR(50) NOT NULL
);

