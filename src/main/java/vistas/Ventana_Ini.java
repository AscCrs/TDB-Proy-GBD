/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
 

import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Set;
import conn.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Ventana_Ini extends javax.swing.JFrame {
    private Conexion conn;

    /**
     * Creates new form Ventana_Ini
     */
    public Ventana_Ini() {
        initComponents();
     //   setIconImage(getIconImage());
       this.setLocationRelativeTo(null);
       TextPrompt placeDns = new TextPrompt("Ingrese la DNS", dnsTextbox);
       TextPrompt placeHost = new TextPrompt("Ingrese el Host", hostTextbox);
       TextPrompt placePort= new TextPrompt("Ingrese la puerto", portTextbox);
       TextPrompt placeusr = new TextPrompt("Ingrese su Usu", usuTextbox);
       TextPrompt placecon = new TextPrompt("Ingrese su contraseña", contraTextbox);
    }

    //Icono del Jframe
   /*@Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Pictures/Logo.png"));
    return retValue;
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoConexion = new javax.swing.JLabel();
        Exitbutton = new javax.swing.JButton();
        MinimizarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        connectBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        conexItem1 = new javax.swing.JComboBox<>();
        dnsTextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hostTextbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        portTextbox = new javax.swing.JTextField();
        usuTextbox = new javax.swing.JTextField();
        contraTextbox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        conexionesBtn = new javax.swing.JButton();

        TextoConexion.setText("Selecionar Conexión");

        Exitbutton.setBackground(new java.awt.Color(255, 0, 51));
        Exitbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exitbutton.setForeground(new java.awt.Color(255, 255, 255));
        Exitbutton.setText("X");
        Exitbutton.setToolTipText("");
        Exitbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exitbutton.setBorderPainted(false);
        Exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbuttonActionPerformed(evt);
            }
        });

        MinimizarButton.setBackground(new java.awt.Color(0, 0, 0));
        MinimizarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MinimizarButton.setForeground(new java.awt.Color(255, 255, 255));
        MinimizarButton.setText("—");
        MinimizarButton.setToolTipText("");
        MinimizarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MinimizarButton.setBorderPainted(false);
        MinimizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarButtonMouseClicked(evt);
            }
        });
        MinimizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        connectBtn.setBackground(new java.awt.Color(89, 179, 10));
        connectBtn.setForeground(new java.awt.Color(255, 255, 255));
        connectBtn.setText("Conectar");
        connectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(179, 0, 56));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        conexItem1.setForeground(new java.awt.Color(153, 153, 153));
        conexItem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su conexion", "JDBC MySQL", "Postgree SQL" }));
        conexItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexItem1ActionPerformed(evt);
            }
        });

        dnsTextbox.setForeground(new java.awt.Color(153, 153, 153));
        dnsTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnsTextboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Conexión:");

        jLabel2.setText("DNS:");

        jLabel3.setText("HOTS:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Contraseña:");

        hostTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostTextboxActionPerformed(evt);
            }
        });

        jLabel6.setText("PORT:");

        usuTextbox.setForeground(new java.awt.Color(153, 153, 153));
        usuTextbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuTextboxFocusGained(evt);
            }
        });
        usuTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuTextboxActionPerformed(evt);
            }
        });

        contraTextbox.setForeground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Selecionar Conexión");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("—");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(10, 10, 10))
        );

        conexionesBtn.setBackground(new java.awt.Color(8, 51, 162));
        conexionesBtn.setForeground(new java.awt.Color(255, 255, 255));
        conexionesBtn.setText("Buscar Conexiónes");
        conexionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(connectBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conexionesBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(cancelBtn))
                    .addComponent(conexItem1, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)
                    .addComponent(dnsTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraTextbox, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(76, 76, 76))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conexItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dnsTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hostTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usuTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contraTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectBtn)
                    .addComponent(cancelBtn)
                    .addComponent(conexionesBtn))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void conexItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conexItem1ActionPerformed

    private void hostTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostTextboxActionPerformed

    private void usuTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuTextboxActionPerformed

    private void usuTextboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuTextboxFocusGained
        // TODO add your handling code here:
        /*if(jTextField1.getText().equals("Ingrese Usuario"))
        {
            jTextfield1.Set<String> hashSet = new HashSet<String>();
            
        }*/
    }//GEN-LAST:event_usuTextboxFocusGained

    private void dnsTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnsTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnsTextboxActionPerformed

    private void ExitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitbuttonActionPerformed

    private void MinimizarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarButtonMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarButtonMouseClicked

    private void MinimizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarButtonActionPerformed

    }//GEN-LAST:event_MinimizarButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBtnActionPerformed
        // TODO add your handling code here:
        if (this.conexItem1.getSelectedItem().equals("JDBC MySQL")) {
            try { 
                setSQLConn();
            } catch (SQLException ex) {
                Logger.getLogger(Ventana_Ini.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (this.conexItem1.getSelectedItem().equals("Postgree SQL")) {
            setPostConn();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de conexion");
        }
    }//GEN-LAST:event_connectBtnActionPerformed

    private void conexionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionesBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        setVisible(false);
        VistaSeleccion conexiones = new VistaSeleccion();
        conexiones.setVisible(true);
    }//GEN-LAST:event_conexionesBtnActionPerformed

    private void setSQLConn() throws SQLException {
        conn = new Conexion();
        if ((this.hostTextbox.getText().equals("")) && (this.portTextbox.getText().equals(""))) this.conn.setURL();
        else this.conn.setURL("mysql", this.hostTextbox.getText(), this.portTextbox.getText());
        if (!(this.usuTextbox.getText().equals(""))) {
            this.conn.setUser(this.usuTextbox.getText());
            if (!(this.contraTextbox.getText().equals(""))) this.conn.setPassword(this.contraTextbox.getText());
        }
        this.conn.setNombreCon(this.dnsTextbox.getText());
        
        MySQLConnection conexion = new MySQLConnection();
        conexion.setConnection(this.conn);
        conexion.openConnection();
    }
    
    private void setPostConn() {
        
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
            java.util.logging.Logger.getLogger(Ventana_Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Ini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbutton;
    private javax.swing.JButton MinimizarButton;
    private javax.swing.JLabel TextoConexion;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> conexItem1;
    private javax.swing.JButton conexionesBtn;
    private javax.swing.JButton connectBtn;
    private javax.swing.JTextField contraTextbox;
    private javax.swing.JTextField dnsTextbox;
    private javax.swing.JTextField hostTextbox;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField portTextbox;
    private javax.swing.JTextField usuTextbox;
    // End of variables declaration//GEN-END:variables
}
