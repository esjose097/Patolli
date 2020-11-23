/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Heriberto
 */
public class FrameCrearPartida extends javax.swing.JFrame {
  FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form FrameCrearPartida
     */
    public FrameCrearPartida() {
        this.setContentPane(fondo);
        initComponents();
         this.setLocationRelativeTo(this);
    }
    
    public void apuestas()
    {
        if(rbApuestaV.isSelected())
        {
            tfApuestaF.setEnabled(false);
            tfApuestaMax.setEnabled(true);
            tfApuestaMin.setEnabled(true);
            rbApuestaF.setSelected(false);
        }else{
            if(rbApuestaF.isSelected()){
            tfApuestaF.setEnabled(true);
            tfApuestaMax.setEnabled(false);
            tfApuestaMin.setEnabled(false);
            rbApuestaV.setSelected(false);
            }
        }
    }
    
    public boolean comprobarCampos(){
        if(this.tfApuestaF.getText().equalsIgnoreCase("") || this.tfApuestaF.getText().isEmpty() == true 
                ||this.tfApuestaMax.getText().equalsIgnoreCase("") || this.tfApuestaMax.getText().isEmpty() == true 
                || this.tfApuestaMin.getText().equalsIgnoreCase("") || this.tfApuestaMin.getText().isEmpty() == true)
        {
            JOptionPane.showMessageDialog(this, "El alguno de los campos de texto esta vacío. "
            + "Porfavor segúrese de haber llenado una cantidad apropiada.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfApuestaMin = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfApuestaMax = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbApuestaF = new javax.swing.JRadioButton();
        cbTablero = new javax.swing.JComboBox<>();
        rbApuestaV = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbJugadores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfApuestaF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btCrearPartida = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                apuesta(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(82, 67, 47));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfApuestaMin.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));

        jLabel6.setText("Apuesta maxima");

        jLabel1.setText("Numero de fichas");

        tfApuestaMax.setEnabled(false);

        jLabel2.setText("Tamaño tablero");

        rbApuestaF.setSelected(true);
        rbApuestaF.setText("Apuesta fija ");
        rbApuestaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApuestaFActionPerformed(evt);
            }
        });

        cbTablero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "14" }));

        rbApuestaV.setText("Apuesta variable ");
        rbApuestaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApuestaVActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero  de jugadores ");

        cbJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        cbJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJugadoresActionPerformed(evt);
            }
        });

        jLabel4.setText("Apuesta fija");

        jLabel5.setText("Apuesta minimo");

        btCrearPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boligrafo.png"))); // NOI18N
        btCrearPartida.setText("Crear partida");
        btCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearPartidaActionPerformed(evt);
            }
        });

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTablero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfApuestaMax))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfApuestaMin))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfApuestaF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(rbApuestaF)
                                .addGap(18, 18, 18)
                                .addComponent(rbApuestaV))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCrearPartida)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(rbApuestaF)
                    .addComponent(rbApuestaV))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfApuestaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfApuestaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfApuestaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCrearPartida)
                    .addComponent(btSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        FrameInicial salir=new FrameInicial();
        this.setVisible(false);
        salir.setVisible(true);
    }//GEN-LAST:event_btSalirActionPerformed

    private void apuesta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apuesta
        // TODO add your handling code here:
        apuestas();
    }//GEN-LAST:event_apuesta

    private void rbApuestaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApuestaVActionPerformed
        // TODO add your handling code here:
        rbApuestaF.setSelected(false);
    }//GEN-LAST:event_rbApuestaVActionPerformed

    private void rbApuestaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApuestaFActionPerformed
        // TODO add your handling code here:
        rbApuestaV.setSelected(false);
    }//GEN-LAST:event_rbApuestaFActionPerformed

    private void btCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearPartidaActionPerformed
        // TODO add your handling code here:
        if(this.comprobarCampos() == true)
        {
        FramePartida salir=new FramePartida();
        this.setVisible(false);
        salir.setVisible(true);
        }
        FramePartida.tableroT=this.cbTablero.getSelectedIndex();
    }//GEN-LAST:event_btCrearPartidaActionPerformed

    private void cbJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJugadoresActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCrearPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrearPartida;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<String> cbJugadores;
    private javax.swing.JComboBox<String> cbTablero;
    public transient javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton rbApuestaF;
    public static javax.swing.JRadioButton rbApuestaV;
    public static javax.swing.JTextField tfApuestaF;
    public static javax.swing.JTextField tfApuestaMax;
    public static javax.swing.JTextField tfApuestaMin;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Aztecas4.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
