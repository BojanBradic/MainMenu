/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import db.KonekcijaSaBazom;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Clan;

/**
 *
 * @author boki
 */
public class NoviClanGUI extends javax.swing.JFrame {

    KonekcijaSaBazom db;

    /**
     * Creates new form NoviKorisnikGUI
     */
    public NoviClanGUI() {
        initComponents();
        db = new KonekcijaSaBazom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNoviClanIme = new javax.swing.JLabel();
        tfNoviClanIme = new javax.swing.JTextField();
        lbNoviClanPrezime = new javax.swing.JLabel();
        tfNoviClanPrezime = new javax.swing.JTextField();
        lbNoviClanNadimak = new javax.swing.JLabel();
        tfNoviClanNadimak = new javax.swing.JTextField();
        okNoviClan = new javax.swing.JButton();
        cancelNoviClan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lbNoviClanIme.setText("Ime");
        getContentPane().add(lbNoviClanIme);
        lbNoviClanIme.setBounds(40, 40, 50, 14);
        getContentPane().add(tfNoviClanIme);
        tfNoviClanIme.setBounds(90, 30, 170, 30);

        lbNoviClanPrezime.setText("Prezime");
        getContentPane().add(lbNoviClanPrezime);
        lbNoviClanPrezime.setBounds(40, 90, 50, 14);
        getContentPane().add(tfNoviClanPrezime);
        tfNoviClanPrezime.setBounds(90, 80, 170, 30);

        lbNoviClanNadimak.setText("Nadimak");
        getContentPane().add(lbNoviClanNadimak);
        lbNoviClanNadimak.setBounds(40, 140, 50, 14);
        getContentPane().add(tfNoviClanNadimak);
        tfNoviClanNadimak.setBounds(90, 130, 170, 30);

        okNoviClan.setText("OK");
        okNoviClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okNoviClanActionPerformed(evt);
            }
        });
        getContentPane().add(okNoviClan);
        okNoviClan.setBounds(30, 180, 90, 23);

        cancelNoviClan.setText("Cancel");
        cancelNoviClan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelNoviClanActionPerformed(evt);
            }
        });
        getContentPane().add(cancelNoviClan);
        cancelNoviClan.setBounds(170, 180, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okNoviClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okNoviClanActionPerformed
        String ime = tfNoviClanIme.getText();
        String prezime = tfNoviClanPrezime.getText();
        String nadimak = tfNoviClanNadimak.getText();
        boolean success = db.dodajClana(new Clan(ime, prezime, nadimak));
        if (success) {
            //TODO prikazi poruku da je clan sacuvan
            JOptionPane.showMessageDialog(new JFrame(), "Clan sacuvan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Clan nije sacuvan", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_okNoviClanActionPerformed

    private void cancelNoviClanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelNoviClanActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelNoviClanActionPerformed

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
            java.util.logging.Logger.getLogger(NoviClanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoviClanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoviClanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoviClanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new NoviClanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelNoviClan;
    private javax.swing.JLabel lbNoviClanIme;
    private javax.swing.JLabel lbNoviClanNadimak;
    private javax.swing.JLabel lbNoviClanPrezime;
    private javax.swing.JButton okNoviClan;
    private javax.swing.JTextField tfNoviClanIme;
    private javax.swing.JTextField tfNoviClanNadimak;
    private javax.swing.JTextField tfNoviClanPrezime;
    // End of variables declaration//GEN-END:variables
}
