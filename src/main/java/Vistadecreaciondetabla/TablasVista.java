
package Vistadecreaciondetabla;

import javax.swing.DefaultListModel;
import vistas.TextPrompt;

/**
 *
 * @author Brian
 */ 
//probando clase de creeacion de tbala
public class TablasVista extends javax.swing.JFrame {
DefaultListModel hardawre = new DefaultListModel();
private CreacionTabla VistaTabla;
    private DefaultListModel<String> listaModelo;
    /**
     * Creates new form CreacionTabla
     */
    public TablasVista() {
        initComponents();
        hardawre=new DefaultListModel();
        ListG.setModel(hardawre);
        listaModelo = new DefaultListModel<>();
        ListG.setModel(listaModelo);
        this.setLocationRelativeTo(null);
        TextPrompt placeNE= new TextPrompt("Nombre del esquema",NombreEsquema);
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraSuperior = new javax.swing.JPanel();
        GBDLabel = new javax.swing.JLabel();
        MinimizarButton = new javax.swing.JButton();
        Exitbutton = new javax.swing.JButton();
        ESQPanel = new javax.swing.JPanel();
        ESQLabel = new javax.swing.JLabel();
        InicioPanel = new javax.swing.JPanel();
        InicioLabel = new javax.swing.JLabel();
        CreacionESQPanel = new javax.swing.JPanel();
        CrearEsqLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListG = new javax.swing.JList<>();
        AbrirT = new javax.swing.JButton();
        NombreEsquema = new javax.swing.JTextField();
        CrearBoton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        BarraSuperior.setBackground(new java.awt.Color(255, 255, 255));

        GBDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GBDLabel.setText("Gestor de Base de Datos");

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

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GBDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinimizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MinimizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(BarraSuperiorLayout.createSequentialGroup()
                        .addComponent(GBDLabel)
                        .addContainerGap())
                    .addComponent(Exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ESQPanel.setBackground(new java.awt.Color(102, 51, 0));

        ESQLabel.setBackground(new java.awt.Color(102, 51, 0));
        ESQLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ESQLabel.setForeground(new java.awt.Color(255, 255, 255));
        ESQLabel.setText("    Esquemas");

        javax.swing.GroupLayout ESQPanelLayout = new javax.swing.GroupLayout(ESQPanel);
        ESQPanel.setLayout(ESQPanelLayout);
        ESQPanelLayout.setHorizontalGroup(
            ESQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ESQPanelLayout.createSequentialGroup()
                .addComponent(ESQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        ESQPanelLayout.setVerticalGroup(
            ESQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ESQPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ESQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InicioPanel.setBackground(new java.awt.Color(0, 0, 0));

        InicioLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InicioLabel.setForeground(new java.awt.Color(255, 255, 255));
        InicioLabel.setText("Inicio");

        javax.swing.GroupLayout InicioPanelLayout = new javax.swing.GroupLayout(InicioPanel);
        InicioPanel.setLayout(InicioPanelLayout);
        InicioPanelLayout.setHorizontalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        InicioPanelLayout.setVerticalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InicioLabel)
                .addContainerGap())
        );

        CreacionESQPanel.setBackground(new java.awt.Color(204, 204, 204));

        CrearEsqLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CrearEsqLabel.setForeground(new java.awt.Color(255, 255, 255));
        CrearEsqLabel.setText("°-Crear Esquema");
        CrearEsqLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearEsqLabelMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(ListG);

        AbrirT.setText("Abrir BD");
        AbrirT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreacionESQPanelLayout = new javax.swing.GroupLayout(CreacionESQPanel);
        CreacionESQPanel.setLayout(CreacionESQPanelLayout);
        CreacionESQPanelLayout.setHorizontalGroup(
            CreacionESQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreacionESQPanelLayout.createSequentialGroup()
                .addGroup(CreacionESQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CreacionESQPanelLayout.createSequentialGroup()
                        .addGroup(CreacionESQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreacionESQPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CrearEsqLabel))
                            .addGroup(CreacionESQPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(AbrirT)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CreacionESQPanelLayout.setVerticalGroup(
            CreacionESQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreacionESQPanelLayout.createSequentialGroup()
                .addComponent(CrearEsqLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AbrirT)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        NombreEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEsquemaActionPerformed(evt);
            }
        });

        CrearBoton.setBackground(new java.awt.Color(0, 102, 0));
        CrearBoton.setForeground(new java.awt.Color(255, 255, 255));
        CrearBoton.setText("Crear");
        CrearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBotonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de la tabla");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número de columnas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ESQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InicioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreacionESQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NombreEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CrearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InicioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ESQPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(CreacionESQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CrearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarButtonMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarButtonMouseClicked

    private void MinimizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarButtonActionPerformed

    }//GEN-LAST:event_MinimizarButtonActionPerformed

    private void ExitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitbuttonActionPerformed

    private void CrearEsqLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearEsqLabelMouseClicked
        // TODO add your handling code here:
            TablasVista newframe = new TablasVista();
            
            newframe.setVisible(true);
            
            this.dispose();
            
    }//GEN-LAST:event_CrearEsqLabelMouseClicked

    private void AbrirTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTActionPerformed
        // TODO add your handling code here:
           String elementoSeleccionado = ListG.getSelectedValue();
    if (elementoSeleccionado != null) {
        VistaTabla = new CreacionTabla(elementoSeleccionado);
        VistaTabla.setVisible(true);
        setVisible(false);
    }
    }//GEN-LAST:event_AbrirTActionPerformed

    private void NombreEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEsquemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEsquemaActionPerformed

    private void CrearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearBotonActionPerformed

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
            java.util.logging.Logger.getLogger(TablasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TablasVista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirT;
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JPanel CreacionESQPanel;
    private javax.swing.JButton CrearBoton;
    private javax.swing.JLabel CrearEsqLabel;
    private javax.swing.JLabel ESQLabel;
    private javax.swing.JPanel ESQPanel;
    private javax.swing.JButton Exitbutton;
    private javax.swing.JLabel GBDLabel;
    private javax.swing.JLabel InicioLabel;
    private javax.swing.JPanel InicioPanel;
    private javax.swing.JList<String> ListG;
    private javax.swing.JButton MinimizarButton;
    private javax.swing.JTextField NombreEsquema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}