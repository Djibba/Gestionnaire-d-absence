/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.JFrame;

/**
 *
 * @author seck
 */
public class Acceuil_surveillant extends javax.swing.JFrame {

    /**
     * Creates new form acceuil
     */
    
    public Acceuil_surveillant() {
        initComponents();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_etudiant8 = new javax.swing.JButton();
        jButton_prof4 = new javax.swing.JButton();
        jButton_etudiant9 = new javax.swing.JButton();
        jButton_etudiant10 = new javax.swing.JButton();
        jButton_user2 = new javax.swing.JButton();
        jButtonEt2 = new javax.swing.JButton();
        jButton_listePre = new javax.swing.JButton();
        jButton_prof2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des emargements");
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSMISSION DE DONNEES ET SECURITE DE L'INFORMATION");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTION DES EMARGEMENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(0, 0, 0)));

        jButton_etudiant8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_etudiant8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/multiple-users-silhouette.png"))); // NOI18N
        jButton_etudiant8.setText("ETUDIANTS");
        jButton_etudiant8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 0, 153)));
        jButton_etudiant8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_etudiant8jButton_etudiantActionPerformed(evt);
            }
        });

        jButton_prof4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_prof4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/black-user-shape.png"))); // NOI18N
        jButton_prof4.setText("PROFESSEURS");
        jButton_prof4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 0, 0)));
        jButton_prof4.setMaximumSize(new java.awt.Dimension(85, 23));
        jButton_prof4.setMinimumSize(new java.awt.Dimension(85, 23));
        jButton_prof4.setPreferredSize(new java.awt.Dimension(85, 23));
        jButton_prof4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prof4jButton_profActionPerformed(evt);
            }
        });

        jButton_etudiant9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_etudiant9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user.png"))); // NOI18N
        jButton_etudiant9.setText("UTILISATEURS");
        jButton_etudiant9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 102, 102)));
        jButton_etudiant9.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant9.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant9.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton_etudiant9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_etudiant9ActionPerformed(evt);
            }
        });

        jButton_etudiant10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_etudiant10.setText("LISTE DE PRESENCE");
        jButton_etudiant10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 0, 153)));
        jButton_etudiant10.setMaximumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant10.setMinimumSize(new java.awt.Dimension(93, 23));
        jButton_etudiant10.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton_etudiant10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_etudiant10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_etudiant10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_etudiant9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jButton_prof4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_etudiant8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_etudiant8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton_prof4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton_etudiant9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_etudiant10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton_user2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_user2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user.png"))); // NOI18N
        jButton_user2.setText("UTILISATEURS");
        jButton_user2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 7, new java.awt.Color(0, 102, 102)));
        jButton_user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_user2ActionPerformed(evt);
            }
        });

        jButtonEt2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEt2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonEt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/multiple-users-silhouette.png"))); // NOI18N
        jButtonEt2.setText("ETUDIANTS");
        jButtonEt2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 7, new java.awt.Color(0, 0, 153)));
        jButtonEt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEt2ActionPerformed(evt);
            }
        });

        jButton_listePre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_listePre.setText("LISTE DE PRESENCE");
        jButton_listePre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 7, new java.awt.Color(153, 0, 153)));
        jButton_listePre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listePreActionPerformed(evt);
            }
        });

        jButton_prof2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_prof2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/black-user-shape.png"))); // NOI18N
        jButton_prof2.setText("PROFESSEURS");
        jButton_prof2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 7, new java.awt.Color(153, 0, 0)));
        jButton_prof2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prof2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/as.PNG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/Capt1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEt2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_user2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_listePre, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_prof2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(262, 262, 262))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 1200, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_prof2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEt2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_user2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton_listePre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 167, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1400, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_etudiant8jButton_etudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_etudiant8jButton_etudiantActionPerformed
        // TODO add your handling code here:
        Acceuil_Etudiant accueilEt = new Acceuil_Etudiant();
        accueilEt.setVisible(true);
    }//GEN-LAST:event_jButton_etudiant8jButton_etudiantActionPerformed

    private void jButton_prof4jButton_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prof4jButton_profActionPerformed
        // TODO add your handling code here:
        Acceuil_Prof accueilProf = new Acceuil_Prof();
        accueilProf.setVisible(true);
    }//GEN-LAST:event_jButton_prof4jButton_profActionPerformed

    private void jButton_etudiant10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_etudiant10ActionPerformed
        // TODO add your handling code here:
        Acceuil_Liste_presence accueilListe = new Acceuil_Liste_presence();
        accueilListe.setVisible(true);
    }//GEN-LAST:event_jButton_etudiant10ActionPerformed

    private void jButton_prof2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prof2ActionPerformed
        // TODO add your handling code here:
        Acceuil_Prof accueilProf = new Acceuil_Prof();
        accueilProf.setVisible(true);
    }//GEN-LAST:event_jButton_prof2ActionPerformed

    private void jButtonEt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEt2ActionPerformed
        // TODO add your handling code here:
         Acceuil_Etudiant accueilEt = new Acceuil_Etudiant();
         accueilEt.setVisible(true);
    }//GEN-LAST:event_jButtonEt2ActionPerformed

    private void jButton_etudiant9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_etudiant9ActionPerformed
        // TODO add your handling code here:
         Acceuil_user accueilUser = new Acceuil_user();
         accueilUser.setVisible(true);
    }//GEN-LAST:event_jButton_etudiant9ActionPerformed

    private void jButton_user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_user2ActionPerformed
        // TODO add your handling code here:
        Acceuil_user accueilUser = new Acceuil_user();
         accueilUser.setVisible(true);
    }//GEN-LAST:event_jButton_user2ActionPerformed

    private void jButton_listePreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listePreActionPerformed
        // TODO add your handling code here:
        Acceuil_Liste_presence accueilListe = new Acceuil_Liste_presence();
        accueilListe.setVisible(true);
    }//GEN-LAST:event_jButton_listePreActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil_surveillant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil_surveillant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEt2;
    private javax.swing.JButton jButton_etudiant10;
    private javax.swing.JButton jButton_etudiant8;
    private javax.swing.JButton jButton_etudiant9;
    private javax.swing.JButton jButton_listePre;
    private javax.swing.JButton jButton_prof2;
    private javax.swing.JButton jButton_prof4;
    private javax.swing.JButton jButton_user2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
