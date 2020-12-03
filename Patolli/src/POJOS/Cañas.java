/**
 * Esta clase representa un objeto de tipo cañas.
 */
package POJOS;

import java.util.Random;

/**
 *
 * @author Equipo 4
 */
public class Cañas {
    
    public Cañas(){}
/*
 Método encargado de devolver un int alazar para simular la tirada de cañas
 utilizando un objeto de tipo Random.
*/    
    private int tirarCania(){
        Random r = new Random();
        int tirada;
        tirada = (r.nextInt(6)+1);        
        return tirada;
    }
}
