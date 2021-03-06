/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frame;

import Entite.Admin;
import Entite.Classe;
import Entite.Etudiant;
import Entite.User;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class formulaireEtudiant extends javax.swing.JFrame {

    Admin admin = new Admin();
    Classe c1 = new Classe();
    Acceuil_Etudiant AccueilEt = new Acceuil_Etudiant();
    /** Creates new form formulaireEtudiant */
    public formulaireEtudiant() {
        initComponents();
        jLabel_username.setVisible(false);
        jTextField_username.setVisible(false);
        jLabel_password.setVisible(false);
        jPasswordField_password.setVisible(false);
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_nom1 = new javax.swing.JLabel();
        jTextField_nom = new javax.swing.JTextField();
        jLabel_prenom1 = new javax.swing.JLabel();
        jTextField_prenom = new javax.swing.JTextField();
        jLabel_sexe1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel_dateNaissance1 = new javax.swing.JLabel();
        dateChooserCombo = new datechooser.beans.DateChooserCombo();
        jLabel_numeroCarte1 = new javax.swing.JLabel();
        jTextField_numerCarte = new javax.swing.JTextField();
        jLabel_email1 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_telephone1 = new javax.swing.JLabel();
        jTextField_telephone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        non = new javax.swing.JRadioButton();
        oui = new javax.swing.JRadioButton();
        jLabel_username = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jLabel_classe = new javax.swing.JLabel();
        jTextField_classe = new javax.swing.JTextField();
        jButton_enregister1 = new javax.swing.JButton();
        jButton_annuler1 = new javax.swing.JButton();

        buttonGroup.add(oui);
        buttonGroup.add(non);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscription Etudiant");

        jPanel5.setBackground(new java.awt.Color(0, 53, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel_nom1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_nom1.setText("Nom:");

        jLabel_prenom1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_prenom1.setText("Prenom:");

        jTextField_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_prenomActionPerformed(evt);
            }
        });

        jLabel_sexe1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel_sexe1.setText("Sexe:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel_dateNaissance1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_dateNaissance1.setText("Date de naissance:");

        dateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    jLabel_numeroCarte1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel_numeroCarte1.setText("Numero carte:");

    jTextField_numerCarte.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_numerCarteActionPerformed(evt);
        }
    });

    jLabel_email1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel_email1.setText("Email:");

    jTextField_email.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_emailActionPerformed(evt);
        }
    });

    jLabel_telephone1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel_telephone1.setText("Telephone:");

    jTextField_telephone.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_telephoneActionPerformed(evt);
        }
    });

    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel1.setText("Est Responsable?");

    non.setText("non");
    non.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nonActionPerformed(evt);
        }
    });

    buttonGroup.add(oui);
    oui.setText("oui");
    oui.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ouiActionPerformed(evt);
        }
    });

    jLabel_username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel_username.setText("Nom d'utilisateur:");

    jTextField_username.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_usernameActionPerformed(evt);
        }
    });

    jLabel_password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel_password.setText("Mot de passe:");

    jLabel_classe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel_classe.setText("Classe:");

    jTextField_classe.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_classeActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)
                    .addComponent(oui)
                    .addGap(85, 85, 85)
                    .addComponent(non, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                            .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel_nom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_prenom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_dateNaissance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_sexe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_numeroCarte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_telephone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_classe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_email)
                                .addComponent(jTextField_numerCarte)
                                .addComponent(jTextField_prenom)
                                .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_nom)
                                .addComponent(dateChooserCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                .addComponent(jTextField_telephone)
                                .addComponent(jTextField_classe))))
                    .addGap(37, 37, 37))))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap(34, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_prenom1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addComponent(jLabel_sexe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel_dateNaissance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateChooserCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_classe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_classe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_numeroCarte1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_numerCarte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_email1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_telephone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(44, 44, 44)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(oui)
                .addComponent(non))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    jButton_enregister1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jButton_enregister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/save.png"))); // NOI18N
    jButton_enregister1.setText("Enregistrer");
    jButton_enregister1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_enregister1ActionPerformed(evt);
        }
    });

    jButton_annuler1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jButton_annuler1.setText("Annuler");
    jButton_annuler1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_annuler1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(54, Short.MAX_VALUE))
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(80, 80, 80)
            .addComponent(jButton_annuler1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_enregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(120, 120, 120))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap(19, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton_annuler1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton_enregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(22, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jTextField_telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telephoneActionPerformed

    private void jButton_enregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enregister1ActionPerformed
        // TODO add your handling code here:
         String nom_etudiant = jTextField_nom.getText();
        String prenom_etudiant = jTextField_prenom.getText();
        String sexe_etudiant = jComboBox.getSelectedItem().toString();
        String numeroCarte = jTextField_numerCarte.getText();
        String email_etudiant = jTextField_email.getText();
        String tel_etudiant = jTextField_telephone.getText();
        String date_naissance = dateChooserCombo.getText();
        String classe = jTextField_classe.getText();
        String username = jTextField_username.getText();
        String password = jPasswordField_password.getText();
        boolean a = nom_etudiant.isEmpty();
        boolean  b=prenom_etudiant.isEmpty();
        boolean c = sexe_etudiant.isEmpty();
        boolean d = numeroCarte.isEmpty();
        boolean e = email_etudiant.isEmpty();
        boolean f = tel_etudiant.isEmpty();
        boolean i = classe.isEmpty();
        if(a==true || b==true || c==true || d==true || e == true || f == true || i == true){
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs SVP");
        }
        else{
              if(non.isSelected()){
                Etudiant Et = new Etudiant(nom_etudiant,prenom_etudiant,classe,email_etudiant,tel_etudiant,sexe_etudiant,numeroCarte,date_naissance);
                admin.AjouterEtudiant(Et);
                JOptionPane.showMessageDialog(null, "Etudiant ajoute");
              } 
              if(oui.isSelected()){
                  Etudiant Et = new Etudiant(nom_etudiant,prenom_etudiant,classe,email_etudiant,tel_etudiant,sexe_etudiant,numeroCarte,date_naissance);
                  admin.AjouterEtudiant(Et);
                  int id_etudiant = Et.getIdEtudiant();
                  User user = new User(id_etudiant=id_etudiant,username,password);
                  admin.AjouterUserET(user);
                  JOptionPane.showMessageDialog(null, "Etudiant ajoute");
              }
              this.dispose();
              AccueilEt.removeRowToTable();
              AccueilEt.addRowToTable();
        }
    }//GEN-LAST:event_jButton_enregister1ActionPerformed

    private void jTextField_numerCarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_numerCarteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_numerCarteActionPerformed

    private void jTextField_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_prenomActionPerformed

    private void jButton_annuler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annuler1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_annuler1ActionPerformed

    private void ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouiActionPerformed
        // TODO add your handling code here:
        non.setSelected(false);
        oui.setSelected(true);
        jLabel_username.setVisible(true);
        jTextField_username.setVisible(true);
        jLabel_password.setVisible(true);
        jPasswordField_password.setVisible(true);
    }//GEN-LAST:event_ouiActionPerformed

    private void nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonActionPerformed
        // TODO add your handling code here:
        non.setSelected(true);
        oui.setSelected(false);
        jLabel_username.setVisible(false);
        jTextField_username.setVisible(false);
        jLabel_password.setVisible(false);
        jPasswordField_password.setVisible(false);
    }//GEN-LAST:event_nonActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jTextField_classeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_classeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_classeActionPerformed

    
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
            java.util.logging.Logger.getLogger(formulaireEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulaireEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulaireEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulaireEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulaireEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private datechooser.beans.DateChooserCombo dateChooserCombo;
    private javax.swing.JButton jButton_annuler1;
    private javax.swing.JButton jButton_enregister1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_classe;
    private javax.swing.JLabel jLabel_dateNaissance1;
    private javax.swing.JLabel jLabel_email1;
    private javax.swing.JLabel jLabel_nom1;
    private javax.swing.JLabel jLabel_numeroCarte1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_prenom1;
    private javax.swing.JLabel jLabel_sexe1;
    private javax.swing.JLabel jLabel_telephone1;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_classe;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_nom;
    private javax.swing.JTextField jTextField_numerCarte;
    private javax.swing.JTextField jTextField_prenom;
    private javax.swing.JTextField jTextField_telephone;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JRadioButton non;
    private javax.swing.JRadioButton oui;
    // End of variables declaration//GEN-END:variables
    
}
