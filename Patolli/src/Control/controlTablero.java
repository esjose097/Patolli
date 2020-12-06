/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import POJOS.Casilla;
import POJOS.Ficha;
import java.util.ArrayList;

/**
 *
 * @author Equipo 4
 */
public class controlTablero {
    
    public Casilla[] asignarCasillas(int tamT){
        if(tamT == 8)
        {
            Casilla[] casillas =                
            {new Casilla(360, 400, 1),new Casilla(360, 440, 2),new Casilla(360, 480, 3),
             new Casilla(360, 520, 4),new Casilla(360, 560, 5),new Casilla(400, 560, 6),
             new Casilla(400, 520, 7),new Casilla(400, 480, 8),new Casilla(400, 440, 9),
             new Casilla(400, 400, 10),new Casilla(440, 400,11),new Casilla(480, 400, 12),
             new Casilla(520, 400, 13),new Casilla(560, 400, 14),new Casilla(560, 360, 15),
             new Casilla(520, 360, 16),new Casilla(480, 360, 17),new Casilla(440, 360, 18),
             new Casilla(400, 360, 19),new Casilla(400, 320, 20),new Casilla(400, 280, 21),
             new Casilla(400, 240, 22),new Casilla(400, 200, 23),new Casilla(360, 200, 24),
             new Casilla(360, 240, 25),new Casilla(360, 280, 26),new Casilla(360, 320, 27),
             new Casilla(360, 360, 28),new Casilla(320, 360, 29),new Casilla(280, 360, 30),
             new Casilla(240, 360, 31),new Casilla(200, 360, 32),new Casilla(200, 400, 33),
            new Casilla(240, 400, 34),new Casilla(280, 400, 35),new Casilla(320, 400, 36),         
            };
        return casillas;
        }
        else if(tamT == 10)
        {
            Casilla[] casillas =                
            {new Casilla(360, 400, 1),new Casilla(360, 440, 2),new Casilla(360, 480, 3),
             new Casilla(360, 520, 4),new Casilla(360, 560, 5),new Casilla(360, 600, 6),
             new Casilla(440, 560, 7),new Casilla(400, 560, 8),
             new Casilla(400, 520, 9),new Casilla(400, 480, 10),new Casilla(400, 440, 11),
             new Casilla(400, 400, 12),new Casilla(440, 400,13),new Casilla(480, 400, 14),
             new Casilla(520, 400, 15),new Casilla(560, 400, 16),new Casilla(600, 400, 17),
             new Casilla(600, 360, 18),new Casilla(560, 360, 19),
             new Casilla(520, 360, 20),new Casilla(480, 360, 21),new Casilla(440, 360, 22),
             new Casilla(400, 360, 23),new Casilla(400, 320, 24),new Casilla(400, 280, 25),
             new Casilla(400, 240, 26),new Casilla(400, 200, 27),new Casilla(400, 160, 28),
             new Casilla(360, 160, 29),new Casilla(360, 200, 30),
             new Casilla(360, 240, 31),new Casilla(360, 280, 32),new Casilla(360, 320, 33),
             new Casilla(360, 360, 34),new Casilla(320, 360, 35),new Casilla(280, 360, 36),
             new Casilla(240, 360, 37),new Casilla(200, 360, 38),new Casilla(160, 360, 39),
             new Casilla(160, 400, 40),new Casilla(200, 400, 41),
            new Casilla(240, 400, 42),new Casilla(280, 400, 43),new Casilla(320, 400, 44),
            };
            return casillas;
        }
        else
        {
            return null;
        }                
    }
    
}
