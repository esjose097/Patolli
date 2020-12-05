/**
 * Esta clase fue creada con el objetivo de gestionar la graficación de las cañas.
 */
package Control;

import POJOS.Cañas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Casal
 */
public class controlCanias extends JPanel{
    private Graphics2D g2d;        
    private int tirada;
    
    
    public controlCanias(){
        this.tirada = 0;
    }

    @Override
    public void paintComponent(Graphics g){
    super.paintComponents(g);
    g2d = (Graphics2D) g;
    int y = 250;
    int x = 15;
    g2d.setColor(Color.green);
    for(int i = 0; i < 6; i++)
        {
            g2d.drawRect(x, y, 40, 40);
            y += 45;
        }
    x=25;
    y=260;
    g2d.setColor(Color.BLACK);
    for (int i = 0; i < this.tirada; i++)
        {
            g2d.fillOval(x, y, 21, 21);
            y += 45;
        }    
        System.out.println(this.tirada);
    }               
    public void pintarTiro(){
        g2d.setColor(Color.black);
        int x = 25;
        int y = 260;
        if (this.tirada >= 0) 
        {
            for (int i = 0; i < this.tirada; i++)
            {
                g2d.fillOval(x, y, 21, 21);
                y += 45;
            }
            System.out.println(this.tirada);
            this.repaint();            
        }
    }

    public void setTirada(int tirada) {
        this.tirada = tirada;
    }        
}