/**
 * Esta clase fue creada con el unico objetivo de hacer pruebas de java 2D.
 */
package Pruebas;

import POJOS.Cañas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Casal
 */
public class frmPrueba extends javax.swing.JFrame {

    /**
     * Creates new form frmPrueba
     */
    int posicionCasilla;
    int tirada;
    int x;
    int y;
    public frmPrueba() {
        initComponents();
        this.setBounds(0, 0, 800, 800);
        this.setLocationRelativeTo(null);
        posicionCasilla = 80;
        this.x = 320;
        this.y = 400;
        tirada = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMover.setText("Go");
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMover, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnMover)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverActionPerformed
        Cañas c = new Cañas();
        int aux = c.tirarCania();
        System.out.println(aux);
        this.tirada = aux;
        repaint();
        
    }//GEN-LAST:event_btnMoverActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMover;
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g){
        super.paint(g);
//     Permite cambiar el color de las líneas a dibujar.
        g.setColor(Color.BLACK);
        
/*      Se necesita x1, y1 estos representan la cordenada de la linea inicial.
        x2 y y2 son las cordenadas hasta donde se llegara.
*/
        //g.drawLine(350, 350, 300, 350);

        //Tablero de 8 aspas
//        int x = 0;
//        int y = 0;
//        x = 190; y = 350;
//        g.drawRect(x, y, 400, 80);
//        for(int i = 0; i < 11; i++)
//        {
//            g.drawLine(x, y, x, y+80);
//            if(i == 3)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y+40, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            else if(i == 6)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);                
//            }
//            x = x + 40;
//        }
//        g.drawLine(190, 390, 590, 390);
//        
//        x = 350;
//        y = 190;
//        g.drawRect(x, y, 80, 400);
//        for(int i = 0; i < 11; i++)
//        {            
//            g.drawLine(x, y, x+80, y);
//            if(i == 3)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            if(i == 6)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x+40, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }            
//            y = y + 40;
//        }
//        g.drawLine(390, 190, 390, 590);    


//        Tablero de 10
//        int x = 0;
//        int y = 0;
//        x = 150; y = 350;
//        g.drawRect(x, y, 480, 80);
//        for(int i = 0; i < 12; i++)
//        {
//            g.drawLine(x, y, x, y+80);
//            if(i == 4)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y+40, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            else if(i == 7)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);                
//            }            
//            x = x + 40;
//        }
//        g.drawLine(150, 390, 630, 390);
//        
//        x = 350;
//        y = 150;
//        g.drawRect(x, y, 80, 480);
//        for(int i = 0; i < 12; i++)
//        {            
//            g.drawLine(x, y, x+80, y);
//            if(i == 4)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            if(i == 7)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x+40, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }                        
//            y = y + 40;
//        }
//        g.drawLine(390, 150, 390, 630);   

//Tablero de 12 casillas.
        int x = 0;
        int y = 0;
        x = 110; y = 350;
        g.drawRect(x, y, 560, 80);
        for(int i = 0; i < 14; i++)
        {
            g.drawLine(x, y, x, y+80);
            if(i == 5)
            {
                g.setColor(Color.red);
                g.fillRect(x, y+40, 40, 40);
                g.setColor(Color.BLACK);
            }
            else if(i == 8)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);                
            }                        
            x = x + 40;
        }
        g.drawLine(110, 390, 670, 390);
        
        x = 350;
        y = 110;
        g.drawRect(x, y, 80, 560);
        for(int i = 0; i < 14; i++)
        {            
            g.drawLine(x, y, x+80, y);
            if(i == 5)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);
            }
            if(i == 8)
            {
                g.setColor(Color.red);
                g.fillRect(x+40, y, 40, 40);
                g.setColor(Color.BLACK);
            }                                    
            y = y + 40;
        }
        g.drawLine(390, 110, 390, 670);

//      Tablero de 14 casillas
//        int x = 0;
//        int y = 0;
//        x = 70; y = 350;
//        g.drawRect(x, y, 640, 80);
//        for(int i = 0; i < 16; i++)
//        {
//            g.drawLine(x, y, x, y+80);
//            if(i == 6)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y+40, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            else if(i == 9)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);                
//            }                                    
//            x = x + 40;
//        }
//        g.drawLine(70, 390, 710, 390);
//        
//        x = 350;
//        y = 70;
//        g.drawRect(x, y, 80, 640);
//        for(int i = 0; i < 16; i++)
//        {            
//            g.drawLine(x, y, x+80, y);
//            if(i == 6)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            if(i == 9)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x+40, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }                                    
//            y = y + 40;
//        }
//        g.drawLine(390, 70, 390, 710);        
//        g.drawRect(0, 0, 40, 40);
//        int x = 0;
//        int y = 0;
//        x = 190; y = 350;
//        g.drawRect(x, y, 400, 80);
//        for(int i = 0; i < 11; i++)
//        {
//            g.drawLine(x, y, x, y+80);
//            if(i == 3)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y+40, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            else if(i == 6)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);                
//            }
//            x = x + 40;
//        }
//        g.drawLine(190, 390, 590, 390);
//        
//        x = 350;
//        y = 190;
//        g.drawRect(x, y, 80, 400);
//        for(int i = 0; i < 11; i++)
//        {            
//            g.drawLine(x, y, x+80, y);
//            if(i == 3)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }
//            if(i == 6)
//            {
//                g.setColor(Color.red);
//                g.fillRect(x+40, y, 40, 40);
//                g.setColor(Color.BLACK);
//            }            
//            y = y + 40;
//        }
//        g.drawLine(390, 190, 390, 590);    
//
//        //Pintada de las cañas       
//         y = 250;
//         x = 15;
//        g.setColor(Color.green);
//        for(int i = 0; i < 6; i++)
//        {
//            g.drawRect(x, y, 40, 40);
//            y += 45;
//        }                
//        g.setColor(Color.black);
//        x = 25;
//        y = 260;
//        for(int i = 0; i < this.tirada; i++)
//        {
//            g.fillOval(x, y, 21, 21);
//            y += 45;
//        }
//        int auxX = this.x;
//        int auxY = this.y;
//        for(int i = 0; i < this.tirada; i++)
//        {
//            if(auxX == 320 && this.tirada >= 1)
//            {
//                auxX += 40;
//            }
//            else if(auxX >= 360 && auxY <560)
//            {
//                auxY += 40;
//            }
//            else if(auxX == 360 && this.tirada >= 1)
//            {
//                auxX += 40;
//            }
//            else if(auxX == 400 && auxY >= 400)
//            {
//                auxY-=40;
//            }
//            else if(auxX >= 400 && auxY == 400)
//            {
//                auxX += 40;
//            }
//        }
//        this.x = auxX;
  //      this.y = auxY;
        g.setColor(Color.BLACK);
        g.fillOval(360, 360, 20, 20);
        System.out.println("Cordenadas de X: " + this.x);
        System.out.println("Cordenadas de Y: " + this.y);

    }
    
    
}
