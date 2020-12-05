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

/**
 * Método encaragdo de simular una tirada de cañas.
 * @return  tirada
 */    
    public int tirarCania(){
        Random r = new Random();
        int tirada;
        tirada = (r.nextInt(7));        
        return tirada;
    }
}
