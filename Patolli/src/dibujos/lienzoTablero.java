/**
 * Esta clase se encargado de representar un canvas.
 * Fue hecha con el proposito de pintar de mejor manera el tablero
 * y poder manipuarlo de una mejor manera.
 */
package dibujos;

import POJOS.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Equipo 4
 */
public class lienzoTablero extends JPanel {
    private final Tablero tablero;
    private Graphics g2d;
    
    public lienzoTablero(Tablero t){
        this.tablero = t;        
    }
    
/**
 * Método encargado de pintar el tablero sobre el canvas segun el tamaño
 * del tablero.
*/    
    @Override
    public void paintComponent(Graphics g){
    super.paintComponents(g);
    this.g2d = (Graphics2D) g;
    int x = 0;
    int y = 0;
    g2d.setColor(Color.BLACK);
    if(this.tablero.getTamanio() == 8)
    {
        x = 190; y = 350;
//  Se pinta un rectangulo grande para las dos aspas horizontales
        g2d.drawRect(x, y, 400, 80);
        for(int i = 0; i < 11; i++)
        {
//  Se pintan lineas verticales brincando de 80 en 80 el eje Y
            g2d.drawLine(x, y, x, y+80);
//  Se rellenan los cuadros de inicio de los jugadores
            if(i == 3)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y+40, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            else if(i == 6)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);                
            }
// Se incrementa el eje x pra poder pintar la siguiente linea.
            x = x + 40;
        }
//  Se pinta una sola linea horizontal para terminar de pintar los cuadros.        
        g2d.drawLine(190, 390, 590, 390);
        
        x = 350;
        y = 190;
// Se pinta un rectanguo vertical para las 2 aspas
        g2d.drawRect(x, y, 80, 400);
        for(int i = 0; i < 11; i++)
        {            
//  Se pintan lineas horizontales brincando de 80 en 80 en el eje X            
            g2d.drawLine(x, y, x+80, y);
//  Se rellenan las casillas de inicio de los jugadores.
            if(i == 3)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            if(i == 6)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x+40, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }          
// Se incrementa el eje Y para ´pintar las siguiente linea.            
            y = y + 40;
        }
// Finalmente se pinta una sola linea vertical para terminar de pintar los cuadrados.        
        g2d.drawLine(390, 190, 390, 590);    
    }

    else if(this.tablero.getTamanio() == 10)
    {
        x = 150; y = 350;
//  Se pinta un rectangulo grande para las dos aspas horizontales        
        g2d.drawRect(x, y, 480, 80);
        for(int i = 0; i < 12; i++)
        {
//  Se pintan lineas verticales brincando de 80 en 80 el eje Y            
            g2d.drawLine(x, y, x, y+80);
//  Se rellenan los cuadros de inicio de los jugadores
            if(i == 4)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y+40, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            else if(i == 7)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);                
            }
// Se incrementa el eje x pra poder pintar la siguiente linea.            
            x = x + 40;
        }
//  Se pinta una sola linea horizontal para terminar de pintar los cuadros.        
        g2d.drawLine(150, 390, 630, 390);
        
        x = 350;
        y = 150;
// Se pinta un rectanguo vertical para las 2 aspas        
        g2d.drawRect(x, y, 80, 480);
        for(int i = 0; i < 12; i++)
        {            
// Se pintan lineas horizontales que aumentan su eje x de 80 en 80            
            g2d.drawLine(x, y, x+80, y);
// Se rellenan las casillas de partida de cada jugador.
            if(i == 4)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            if(i == 7)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x+40, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }       
// Se incrementa el eje Y para poder pintar la siguiente linea horizontal.            
            y = y + 40;
        }
// Se pinta una sola linea vertical para terminar de pintar las casillas.        
        g2d.drawLine(390, 150, 390, 630);   
    }

    else if(this.tablero.getTamanio() == 12)
    {
        x = 110; y = 350;
// Se pinta un rectangulo grande horizontal para las dos aspas.        
        g2d.drawRect(x, y, 560, 80);
        for(int i = 0; i < 14; i++)
        {
// Se pintan lineas verticales que aumentan su eje Y de 80 en 80            
            g2d.drawLine(x, y, x, y+80);
// Se pintan las casilas de inicio de los jugadores.
            if(i == 5)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y+40, 40, 40);
                g2d.setColor(Color.BLACK);
            }            
            else if(i == 8)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);                
            }          
// Se aumenta el eje X para pintar las siguiente linea vertical            
            x = x + 40;
        }
// Se pinta una sola linea horizontal para terminar de pintar las casillas.        
        g2d.drawLine(110, 390, 670, 390);
        
        x = 350;
        y = 110;
// Se pinta un rectangulo vertical grande para las 2 aspas        
        g2d.drawRect(x, y, 80, 560);
        for(int i = 0; i < 14; i++)
        {            
// Se pintan lineas horizontales que aumentan su eje x de 80 en 80            
            g2d.drawLine(x, y, x+80, y);
// Se rellenan las casillas de inicio de los jugadores.            
            if(i == 5)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            if(i == 8)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x+40, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }     
// Se incrementa el eje Y para poder pintar la siguiente linea horizontal..            
            y = y + 40;
        }
// Se pinta una sola linea vertical para terminar de pitnar las casillas.        
        g2d.drawLine(390, 110, 390, 670);
    }

//      Tablero de 14 casillas
    else if(this.tablero.getTamanio() == 14)
    {
        x = 70; y = 350;
// Se pinta un rectangulo grande para las dos aspas.        
        g2d.drawRect(x, y, 640, 80);
        for(int i = 0; i < 16; i++)
        {
// Se pintan lineas verticales que aumentan su eje Y en 80            
            g2d.drawLine(x, y, x, y+80);
// Se rellenan las casilas de inicio de cada jugador.
            if(i == 6)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y+40, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            else if(i == 9)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);                
            }                                    
// Se incrementa el eje X para poder pintar la siguiente linea vertical.            
            x = x + 40;
        }
// Se dibuja una sola linea horizontal para terminar de pintar las casillas.        
        g2d.drawLine(70, 390, 710, 390);
        
        x = 350;
        y = 70;
// Se dibuja un rectangulo vertical grande para las dos aspas.        
        g2d.drawRect(x, y, 80, 640);
        for(int i = 0; i < 16; i++)
        {            
// Se dibujan lineas horizontales que aumentan su eje X en 80.            
            g2d.drawLine(x, y, x+80, y);
// Se rellenan las casillas de inicio de cada jugador.            
            if(i == 6)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }
            if(i == 9)
            {
                g2d.setColor(Color.red);
                g2d.fillRect(x+40, y, 40, 40);
                g2d.setColor(Color.BLACK);
            }                                    
// Se aumenta el eje Y para poder pintar la siguiente linea horizontal.            
            y = y + 40;
        }
// Se pinta una sola linea vertical para terminar de pintal las casillas.        
        g2d.drawLine(390, 70, 390, 710);        
    }    
    }
}
