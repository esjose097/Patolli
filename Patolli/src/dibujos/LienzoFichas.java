/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import POJOS.Ficha;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Equipo 4
 */
public class LienzoFichas extends JPanel{
    
    private ArrayList<Ficha> fichas;
    private Graphics2D g2d;
    
    public LienzoFichas(ArrayList<Ficha> f){
        this.fichas = f;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        this.g2d = (Graphics2D) g;
        for(Ficha f : this.fichas)
        {
            if(f != null)
            {
                if(f.getColor().equalsIgnoreCase("blue"))
                {
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(f.getX(), f.getY(), 20, 20);
                }
            }
            if(f != null)
            {
                if(f.getColor().equalsIgnoreCase("green"))
                {
                    g2d.setColor(Color.green);
                    g2d.fillOval(f.getX(), f.getY(), 20, 20);
                }
            }            
        }
    }
    
    public void setFichas(ArrayList<Ficha> f){
        this.fichas = f;
    }
    public void actualizar(){
        repaint();
    }
}
