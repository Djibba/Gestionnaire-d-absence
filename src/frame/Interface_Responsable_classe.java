/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import BDD.Requete;
import Entite.Admin;
import Entite.Etudiant;
import Entite.Module;
import Test.md5;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import search.SearchClasse;
import search.SearchEtudiant;
import search.SearchModule;
import search.searchListePresence;

/**
 *
 * @author seck
 */
public class Interface_Responsable_classe extends javax.swing.JFrame {

    SearchClasse sc = new SearchClasse();
    SearchEtudiant se = new SearchEtudiant(); 
    ArrayList<Etudiant> listEt;
    Admin admin = new Admin();
    Requete req = new Requete();
    int id;
    searchListePresence slp = new searchListePresence();
    SearchModule Sm = new SearchModule();

    
    
    
    /**
     * Creates new form acceuil
     */
    public Interface_Responsable_classe() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = sdf.format(new java.util.Date());
        date.setText(s);
        addRowToTable1();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_login = new javax.swing.JTextField();
        jLabel_login = new javax.swing.JLabel();
        jTextField_prenom = new javax.swing.JTextField();
        jLabel_prenom = new javax.swing.JLabel();
        jLabel_nom = new javax.swing.JLabel();
        jTextField_nom = new javax.swing.JTextField();
        jPasswordField1_pass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel_nomProf = new javax.swing.JLabel();
        jLabel_prenomProf = new javax.swing.JLabel();
        jLabel_classe = new javax.swing.JLabel();
        jLabel_nom1 = new javax.swing.JLabel();
        jLabel_prenom1 = new javax.swing.JLabel();
        jLabel3Module = new javax.swing.JLabel();
        jButton_modifier = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelDate = new javax.swing.JLabel();
        jLabelDate1 = new javax.swing.JLabel();
        jLabelDate2 = new javax.swing.JLabel();
        heureDebut = new javax.swing.JTextField();
        heureFin = new javax.swing.JTextField();
        jButton_rechercher = new javax.swing.JButton();
        jTextField1Date = new javax.swing.JTextField();
        jLabel_date = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des émargements");
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 51, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSMISSION DE DONNEES ET SECURITE DE L'INFORMATION");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTION DES ETUDIANTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro Carte", "Nom", "Prénom", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel_password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_password.setText("Mot de passe");

        jTextField_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_loginActionPerformed(evt);
            }
        });

        jLabel_login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_login.setText("Nom Utilisateur");

        jLabel_prenom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_prenom.setText("Prenom");

        jLabel_nom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_nom.setText("Nom");

        jPasswordField1_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_prenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jTextField_prenom)
                    .addComponent(jTextField_login)
                    .addComponent(jPasswordField1_pass))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_prenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_prenom))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_login, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel_nomProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_nomProf.setText("Nom étudiant:");

        jLabel_prenomProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_prenomProf.setText("Prénom étudiant:");

        jLabel_classe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_classe.setText("Classe:");

        jLabel_nom1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_nom1.setText("jLabel1");
        jLabel_nom1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel_nom1ComponentAdded(evt);
            }
        });
        jLabel_nom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_nom1MouseClicked(evt);
            }
        });

        jLabel_prenom1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_prenom1.setText("jLabel2");

        jLabel3Module.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3Module.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_classe, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_prenomProf))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel_nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_prenom1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Module, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_prenomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_prenom1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_classe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3Module, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton_modifier.setBackground(new java.awt.Color(255, 255, 255));
        jButton_modifier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/file (2).png"))); // NOI18N
        jButton_modifier.setText("Modifier");
        jButton_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifierActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabelDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDate.setText("Date");

        jLabelDate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDate1.setText("Heure Début");

        jLabelDate2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDate2.setText("Heure Fin");

        jButton_rechercher.setBackground(new java.awt.Color(255, 255, 255));
        jButton_rechercher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher.setText("Rechercher une liste");
        jButton_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(heureDebut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .addComponent(jTextField1Date, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(heureFin)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(heureDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(heureFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_rechercher)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_date.setText("Date:");

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        date.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/as.PNG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/Capt1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 130, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_date)
                            .addComponent(date)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1410, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_loginActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPasswordField1_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1_passActionPerformed

    private void jLabel_nom1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel_nom1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_nom1ComponentAdded

    private void jLabel_nom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_nom1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_nom1MouseClicked

    private void jButton_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifierActionPerformed
     
        int id = recupererId();
        String login = jTextField_login.getText();
        String password = jPasswordField1_pass.getText();
        //User user = new User(id,login,password); 
        admin.ModifierUser(id,login,password);
       JOptionPane.showMessageDialog(null, "User modifie"+id);
    }//GEN-LAST:event_jButton_modifierActionPerformed

    private void jButton_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercherActionPerformed
        // TODO add your handling code here:
        int HDebut = Integer.parseInt(heureDebut.getText());
        int HFin = Integer.parseInt(heureFin.getText());
        String dat = jTextField1Date.getText();

        addRowToTable1(dat, HDebut, HFin);
    }//GEN-LAST:event_jButton_rechercherActionPerformed

    public void removeRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
       
    }
    
    public void addRowToTable1(){
        removeRowToTable();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        md5 md =new md5();
        String [] jourHeure = md.JourHeure();
        int Jour = Integer.parseInt(jourHeure[0]);
        int Heure = Integer.parseInt(jourHeure[1]);       
        Module module = Sm.RechercherParJourHeure(Jour, Heure);
        jLabel3Module.setText(module.getNomModule());
        ArrayList<Etudiant> list = slp.listeDePresence(md.getDate(),module.getHeureDebut(),module.getHeureFin());
       
        
        Object rowData[] = new Object[4];
        
         if (list.size()== 0) {
             //JOptionPane.showMessageDialog(null, "aucun etudiant trouvé");
         }else{
        for (int i = 0; i < list.size(); i++) {                       
            rowData[0] = list.get(i).getNumeroCarte();
            rowData[1] = list.get(i).getNom();
            rowData[2] = list.get(i).getPrenom();
            rowData[3] = list.get(i).getStatusEtudiant();
            model.addRow(rowData);
        }
        }
    }
    
     public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Etudiant> list = se.RechercherTousLesElement();
        Object rowData[] = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getNumeroCarte();
            rowData[1] = list.get(i).getNom();
            rowData[2] = list.get(i).getPrenom();
            rowData[3] = list.get(i).getStatusEtudiant();
            model.addRow(rowData);
        }
    }
     
     public void addRowToTable1(String date,int heureDebut,int heureFin){
        removeRowToTable();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Etudiant> list = slp.listeDePresence(date,heureDebut,heureFin);
       
        
        Object rowData[] = new Object[4];
        
         if (list.size()== 0) {
             JOptionPane.showMessageDialog(null, "aucun etudiant trouvé");
         }else{
        for (int i = 0; i < list.size(); i++) {                       
            rowData[0] = list.get(i).getNumeroCarte();
            rowData[1] = list.get(i).getNom();
            rowData[2] = list.get(i).getPrenom();
            rowData[3] = list.get(i).getStatusEtudiant();
            model.addRow(rowData);
        }
        }
    }
    
    public void AfficherNomProf(String nom,String prenom,String classe){
        jLabel_nom1.setText(nom);
        jLabel_prenom1.setText(prenom);
        jLabel3Module.setText(classe);
        jTextField_nom.setText(jLabel_nom1.getText());
        jTextField_prenom.setText(jLabel_prenom1.getText());
        
    }
    
    public int recupererId(){
        System.out.println(jLabel_prenom.getText());
        //int id_user=0;
        
        try {
                      String requete1="SELECT id_user FROM user inner join etudiant on etudiant.id_etudiant=user.id_etudiant WHERE prenom_etudiant='"+jLabel_prenom1.getText()+"'";
                      ResultSet res = req.exeRead(requete1);
                      while(res.next()){
                          id = res.getInt("id_user");
                      }
                  } catch (SQLException e) {
                  }
        JOptionPane.showMessageDialog(null, jLabel_prenom1.getText()+" "+id);
        return id;
    }
    /**
     * @param args the command line arguments
     */
     
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil_Etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JTextField heureDebut;
    private javax.swing.JTextField heureFin;
    private javax.swing.JButton jButton_modifier;
    private javax.swing.JButton jButton_rechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3Module;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDate1;
    private javax.swing.JLabel jLabelDate2;
    private javax.swing.JLabel jLabel_classe;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_nom;
    private javax.swing.JLabel jLabel_nom1;
    private javax.swing.JLabel jLabel_nomProf;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_prenom;
    private javax.swing.JLabel jLabel_prenom1;
    private javax.swing.JLabel jLabel_prenomProf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1_pass;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Date;
    private javax.swing.JTextField jTextField_login;
    private javax.swing.JTextField jTextField_nom;
    private javax.swing.JTextField jTextField_prenom;
    // End of variables declaration//GEN-END:variables
}
