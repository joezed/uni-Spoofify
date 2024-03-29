package sstest1;


import java.awt.event.ActionListener;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */


public class GUI2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI2
     */
    public GUI2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameBox = new javax.swing.JTextField();
        DOBbox = new javax.swing.JTextField();
        POBbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MusicProfileTextArea = new javax.swing.JTextArea();
        MusicProfileDropDown = new javax.swing.JComboBox<>();
        AddButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        UsernameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBoxActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameBox);
        UsernameBox.setBounds(127, 69, 160, 28);
        getContentPane().add(DOBbox);
        DOBbox.setBounds(127, 145, 160, 28);
        getContentPane().add(POBbox);
        POBbox.setBounds(127, 106, 160, 28);

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("SPOOFIFY");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 10, 210, 48);

        MusicProfileTextArea.setColumns(20);
        MusicProfileTextArea.setRows(5);
        jScrollPane1.setViewportView(MusicProfileTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(352, 111, 258, 133);

        MusicProfileDropDown.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        MusicProfileDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Rock", "Dance", "HipHop" }));
        MusicProfileDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicProfileDropDownActionPerformed(evt);
            }
        });
        getContentPane().add(MusicProfileDropDown);
        MusicProfileDropDown.setBounds(352, 67, 160, 34);

        AddButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(522, 67, 88, 34);

        RegisterButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterButton);
        RegisterButton.setBounds(18, 273, 73, 25);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(27, 151, 90, 17);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("or CANCEL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 270, 90, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(27, 75, 64, 17);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Place of Birth:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(27, 106, 90, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sstest1/bg1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 660, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        
        //MusicProfileDropDown.getText(MusicProfileTextArea.getSelectedValue().));
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UsernameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBoxActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        try{
           // FileWriter fileWriter = new FileWriter("Userdata.txt");
            //fileWriter.write(UsernameBox.getText());
            //fileWriter.close();
            
        // Accepts User Input
        String username = UsernameBox.getText();
        String DOB = POBbox.getText();
        String POB = DOBbox.getText();
        
        // Assigns which special characters we don't accept  

//        if (username.matches("[A-Za-z0-9")){
//            System.out.println("password contains only valid characters");
//       } else {
//            System.out.println("invalid characters in password");
////            break;
//       }
        
//        PrintWriter writer = new PrintWriter("textFieldOutput.txt", "UTF-8");
        PrintWriter writer = new PrintWriter(new FileOutputStream(
                new File("textFieldOutput.txt"),
                true));
        writer.println(username + ", " + DOB + ", " + POB);
        writer.close();
        new GUI1().setVisible(true);
        this.dispose();
        }
        catch (Exception e){
            
        }
  
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void MusicProfileDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicProfileDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MusicProfileDropDownActionPerformed

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
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }


//Create the combo box, select item at index 4.
//Indices start at 0, so 4 specifies the pig.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField DOBbox;
    private javax.swing.JComboBox<String> MusicProfileDropDown;
    private javax.swing.JTextArea MusicProfileTextArea;
    private javax.swing.JTextField POBbox;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UsernameBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
