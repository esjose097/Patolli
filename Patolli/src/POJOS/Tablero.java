/**
 * Esta clase se encarga de representar un objeto de tipo Tablero.
 */
package POJOS;

/**
 *
 * @author Equipo 4
 */
public class Tablero {
    
    private Integer tamanio;

    public Tablero() {}

    public Tablero(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }        
    
    private boolean dibujar(){
        return true;
    }
    
    private boolean actualizar(){
        return true;
    }
    
    
}
