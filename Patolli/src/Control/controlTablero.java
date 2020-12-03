/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import POJOS.Tablero;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Equipo 4
 */
public class controlTablero extends Canvas {
    Tablero tablero;
    
    public controlTablero(Tablero t){
        this.tablero = t;
    }
    
    @Override
    public void paint(Graphics g){
    super.paint(g);
    int x = 0;
    int y = 0;
    g.setColor(Color.BLACK);
    if(this.tablero.getTamanio() == 8)
    {
        x = 190; y = 350;
//  Se pinta un rectangulo grande para las dos aspas horizontales
        g.drawRect(x, y, 400, 80);
        for(int i = 0; i < 11; i++)
        {
//  Se pintan lineas verticales brincando de 80 en 80 el eje Y
            g.drawLine(x, y, x, y+80);
//  Se rellenan los cuadros de inicio de los jugadores
            if(i == 3)
            {
                g.setColor(Color.red);
                g.fillRect(x, y+40, 40, 40);
                g.setColor(Color.BLACK);
            }
            else if(i == 6)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);                
            }
// Se incrementa el eje x pra poder pintar la siguiente linea.
            x = x + 40;
        }
//  Se pinta una sola linea horizontal para terminar de pintar los cuadros.        
        g.drawLine(190, 390, 590, 390);
        
        x = 350;
        y = 190;
// Se pinta un rectanguo vertical para las 2 aspas
        g.drawRect(x, y, 80, 400);
        for(int i = 0; i < 11; i++)
        {            
//  Se pintan lineas horizontales brincando de 80 en 80 en el eje X            
            g.drawLine(x, y, x+80, y);
//  Se rellenan las casillas de inicio de los jugadores.
            if(i == 3)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);
            }
            if(i == 6)
            {
                g.setColor(Color.red);
                g.fillRect(x+40, y, 40, 40);
                g.setColor(Color.BLACK);
            }          
// Se incrementa el eje Y para ´pintar las siguiente linea.            
            y = y + 40;
        }
// Finalmente se pinta una sola linea vertical para terminar de pintar los cuadrados.        
        g.drawLine(390, 190, 390, 590);    
    }

    else if(this.tablero.getTamanio() == 10)
    {
        x = 150; y = 350;
//  Se pinta un rectangulo grande para las dos aspas horizontales        
        g.drawRect(x, y, 480, 80);
        for(int i = 0; i < 12; i++)
        {
//  Se pintan lineas verticales brincando de 80 en 80 el eje Y            
            g.drawLine(x, y, x, y+80);
//  Se rellenan los cuadros de inicio de los jugadores
            if(i == 4)
            {
                g.setColor(Color.red);
                g.fillRect(x, y+40, 40, 40);
                g.setColor(Color.BLACK);
            }
            else if(i == 7)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);                
            }
// Se incrementa el eje x pra poder pintar la siguiente linea.            
            x = x + 40;
        }
//  Se pinta una sola linea horizontal para terminar de pintar los cuadros.        
        g.drawLine(150, 390, 630, 390);
        
        x = 350;
        y = 150;
// Se pinta un rectanguo vertical para las 2 aspas        
        g.drawRect(x, y, 80, 480);
        for(int i = 0; i < 12; i++)
        {            
// Se pintan lineas horizontales que aumentan su eje x de 80 en 80            
            g.drawLine(x, y, x+80, y);
// Se rellenan las casillas de partida de cada jugador.
            if(i == 4)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);
            }
            if(i == 7)
            {
                g.setColor(Color.red);
                g.fillRect(x+40, y, 40, 40);
                g.setColor(Color.BLACK);
            }       
// Se incrementa el eje Y para poder pintar la siguiente linea horizontal.            
            y = y + 40;
        }
// Se pinta una sola linea vertical para terminar de pintar las casillas.        
        g.drawLine(390, 150, 390, 630);   
    }

    else if(this.tablero.getTamanio() == 12)
    {
        x = 110; y = 350;
// Se pinta un rectangulo grande horizontal para las dos aspas.        
        g.drawRect(x, y, 560, 80);
        for(int i = 0; i < 14; i++)
        {
// Se pintan lineas verticales que aumentan su eje Y de 80 en 80            
            g.drawLine(x, y, x, y+80);
// Se pintan las casilas de inicio de los jugadores.
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
// Se aumenta el eje X para pintar las siguiente linea vertical            
            x = x + 40;
        }
// Se pinta una sola linea horizontal para terminar de pintar las casillas.        
        g.drawLine(110, 390, 670, 390);
        
        x = 350;
        y = 110;
// Se pinta un rectangulo vertical grande para las 2 aspas        
        g.drawRect(x, y, 80, 560);
        for(int i = 0; i < 14; i++)
        {            
// Se pintan lineas horizontales que aumentan su eje x de 80 en 80            
            g.drawLine(x, y, x+80, y);
// Se rellenan las casillas de inicio de los jugadores.            
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
// Se incrementa el eje Y para poder pintar la siguiente linea horizontal..            
            y = y + 40;
        }
// Se pinta una sola linea vertical para terminar de pitnar las casillas.        
        g.drawLine(390, 110, 390, 670);
    }

//      Tablero de 14 casillas
    else if(this.tablero.getTamanio() == 14)
    {
        x = 70; y = 350;
// Se pinta un rectangulo grande para las dos aspas.        
        g.drawRect(x, y, 640, 80);
        for(int i = 0; i < 16; i++)
        {
// Se pintan lineas verticales que aumentan su eje Y en 80            
            g.drawLine(x, y, x, y+80);
// Se rellenan las casilas de inicio de cada jugador.
            if(i == 6)
            {
                g.setColor(Color.red);
                g.fillRect(x, y+40, 40, 40);
                g.setColor(Color.BLACK);
            }
            else if(i == 9)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);                
            }                                    
// Se incrementa el eje X para poder pintar la siguiente linea vertical.            
            x = x + 40;
        }
// Se dibuja una sola linea horizontal para terminar de pintar las casillas.        
        g.drawLine(70, 390, 710, 390);
        
        x = 350;
        y = 70;
// Se dibuja un rectangulo vertical grande para las dos aspas.        
        g.drawRect(x, y, 80, 640);
        for(int i = 0; i < 16; i++)
        {            
// Se dibujan lineas horizontales que aumentan su eje X en 80.            
            g.drawLine(x, y, x+80, y);
// Se rellenan las casillas de inicio de cada jugador.            
            if(i == 6)
            {
                g.setColor(Color.red);
                g.fillRect(x, y, 40, 40);
                g.setColor(Color.BLACK);
            }
            if(i == 9)
            {
                g.setColor(Color.red);
                g.fillRect(x+40, y, 40, 40);
                g.setColor(Color.BLACK);
            }                                    
// Se aumenta el eje Y para poder pintar la siguiente linea horizontal.            
            y = y + 40;
        }
// Se pinta una sola linea vertical para terminar de pintal las casillas.        
        g.drawLine(390, 70, 390, 710);        
    }    
    }
 }
