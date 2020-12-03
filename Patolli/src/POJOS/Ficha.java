/**
 * Esta clase se encarga de reprentar un objeto de tipo Ficha.
 */
package POJOS;

/**
 *
 * @author Equipo 4
 */
public class Ficha {
    
    private String color;    
    private int posicion;
    
    public Ficha(){}
    
    public Ficha(String color, int posicion){
        this.color = color;
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
        
}
