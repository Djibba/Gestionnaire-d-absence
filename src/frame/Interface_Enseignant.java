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
import java.awt.Color;
import java.awt.Font;
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
public class Interface_Enseignant extends javax.swing.JFrame {

    SearchClasse sc = new SearchClasse();
    SearchEtudiant se = new SearchEtudiant(); 
    ArrayList<Etudiant> listEt;
    Admin admin = new Admin();
    Requete req = new Requete();
    searchListePresence slp = new searchListePresence();
    SearchModule Sm = new SearchModule();
    int id;
    
    
    
    /**
     * Creates new form acceuil
     */
    public Interface_Enseignant() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Segeo UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.getTableHeader().setForeground(new Color(0, 0, 0));
        jTable1.setRowHeight(25);
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
        jLabel_module = new javax.swing.JLabel();
        jLabel_nom1 = new javax.swing.JLabel();
        jLabel_prenom1 = new javax.swing.JLabel();
        jLabel3Module = new javax.swing.JLabel();
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
        jButton_modifier = new javax.swing.JButton();
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
        jLabel2.setText("LISTE DE PRESENCES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(0, 51, 204));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
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
                .addGap(33, 33, 33)
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel_nomProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_nomProf.setText("Nom professeur:");

        jLabel_prenomProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_prenomProf.setText("Prénom professeur:");

        jLabel_module.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_module.setText("Module");

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
                    .addComponent(jLabel_module, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel_module, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3Module, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabelDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDate.setText("Date");

        jLabelDate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDate1.setText("Heure Debut");

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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(heureDebut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jTextField1Date, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heureFin))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jButton_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jButton_rechercher)
                .addContainerGap())
        );

        jLabel_date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_date.setText("Date:");

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        date.setText("jLabel1");

        jButton_modifier.setBackground(new java.awt.Color(255, 255, 255));
        jButton_modifier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/file (2).png"))); // NOI18N
        jButton_modifier.setText("Modifier");
        jButton_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifierActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/as.PNG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/Capt1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jButton_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modifier))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1390, 730);

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
    
    private void jButton_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercherActionPerformed
        // TODO add your handling code here:
        int HDebut = Integer.parseInt(heureDebut.getText());
        int HFin = Integer.parseInt(heureFin.getText());
        String dat = jTextField1Date.getText();

        addRowToTable1(dat, HDebut, HFin);
    }//GEN-LAST:event_jButton_rechercherActionPerformed
    
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
    public void removeRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
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
    
    public void AfficherNomProf(String nom,String prenom,String module){
        jLabel_nom1.setText(nom);
        jLabel_prenom1.setText(prenom);
        jLabel3Module.setText(module);
        jTextField_nom.setText(jLabel_nom1.getText());
        jTextField_prenom.setText(jLabel_prenom1.getText());
        
    }
    
    public int recupererId(){
        System.out.println(jLabel_prenom.getText());
        //int id_user=0;
        
        try {
                      String requete1="SELECT id_user FROM user inner join enseignant on enseignant.id_enseignant=user.id_enseignant WHERE prenom_enseignant='"+jLabel_prenom1.getText()+"'";
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
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_module;
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