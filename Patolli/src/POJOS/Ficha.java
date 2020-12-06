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
    private int x, y;
    private int posicion;
    
    public Ficha(){}
    
    public Ficha(String color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
        this.posicion = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
/*
    Método que se encarga de devolver las dos posiciones en un arreglo
    (Me daba flojera estar obteniendo la x y la y por separado ajajaja)
*/
    public void setCoordenadas(int[] c) {
        this.x = c[0];
        this.y = c[1];        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }               
}
