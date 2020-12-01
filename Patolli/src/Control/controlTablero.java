/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Equipo 4
 */
public class controlTablero {
    
    private void dibujarTablero8(Graphics g){
           g.setColor(Color.BLACK);
           g.drawRect(310, 370, 40, 40);
           g.drawRect(350, 370, 40, 40);
           g.drawRect(310, 330, 40, 40);
           g.drawRect(350, 330, 40, 40);
           
           for (int i = 310; i>110; i=i-40) 
           {
               g.drawRect(i, 330, 40, 40);
           }
           for (int i = 310; i>110 ; i=i-40) 
           {
               g.drawRect(i, 370, 40, 40);
           }
           
          for (int i = 350; i<550; i=i+40) 
           {
               g.drawRect(i, 370, 40, 40);
           }
           for (int i = 350; i<550 ; i=i+40) 
           {
               g.drawRect(i, 330, 40, 40);
           }
           
           for (int i = 370; i<550; i=i+40) 
           {
               g.drawRect(350, i, 40, 40);
           }
           for (int i = 370; i<550 ; i=i+40) 
           {
               g.drawRect(310, i, 40, 40);
           }
           
           for (int i = 330; i>160; i=i-40) 
           {
               g.drawRect(350, i, 40, 40);
           }
           for (int i = 330; i>160 ; i=i-40) 
           {
               g.drawRect(310, i, 40, 40);
           }      
    }
    
    public void dibujarTablero10(Graphics g){
           g.setColor(Color.BLACK);
           g.drawRect(330, 370, 20, 20);
           g.drawRect(350, 370, 20, 20);
           g.drawRect(330, 310, 20, 20);
           g.drawRect(350, 310, 20, 20);
           
           for (int i = 330; i>210; i=i-20) 
           {
               g.drawRect(i, 350, 20, 20);
           }
           for (int i = 330; i>210 ; i=i-20) 
           {
               g.drawRect(i, 330, 20, 20);
           }
           
           for (int i = 350; i<470; i=i+20) 
           {
               g.drawRect(i, 350, 20, 20);
           }
           for (int i = 350; i<470 ; i=i+20) 
           {
               g.drawRect(i, 330, 20, 20);
           }
           
           for (int i = 370; i<470; i=i+20) 
           {
               g.drawRect(330, i, 20, 20);
           }
              
           for (int i = 370; i<470 ; i=i+20) 
           {
               g.drawRect(350, i, 20, 20);
           }
           
           for (int i = 310; i>210; i=i-20) 
           {
               g.drawRect(330, i, 20, 20);
           }
           for (int i = 310; i>210 ; i=i-20) 
           {
               g.drawRect(350, i, 20, 20);
           }        
    }
    
    public void dibujarTablero12(Graphics g){                
                
           g.setColor(Color.BLACK);
           g.drawRect(330, 370, 20, 20);
           g.drawRect(350, 370, 20, 20);
           g.drawRect(330, 310, 20, 20);
           g.drawRect(350, 310, 20, 20);
           
           for (int i = 330; i>190; i=i-20) 
           {
               g.drawRect(i, 350, 20, 20);
           }
           
           for (int i = 330; i>190 ; i=i-20) 
           {
               g.drawRect(i, 330, 20, 20);
           }
           
           for (int i = 350; i<490; i=i+20) 
           {
               g.drawRect(i, 350, 20, 20);
           }
             
           for (int i = 350; i<490 ; i=i+20) 
           {
               g.drawRect(i, 330, 20, 20);
           }
           
           for (int i = 370; i<490; i=i+20) 
           {
               g.drawRect(330, i, 20, 20);
           }
           for (int i = 370; i<490 ; i=i+20) {
               g.drawRect(350, i, 20, 20);
           }
           
           for (int i = 310; i>190; i=i-20) 
           {
               g.drawRect(330, i, 20, 20);
           }
           for (int i = 310; i>190 ; i=i-20) 
           {
               g.drawRect(350, i, 20, 20);
           }        
    }    
}
