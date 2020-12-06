/**
 * Esta clase representa una casilla.
 */
package POJOS;

/**
 *
 * @author Equipo 4
 */
public class Casilla {
    private int x;
    private int y;
    private int numero;

    public Casilla(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.numero = n;
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
    
    public int[] getPosicion(){
        int p[] = {this.x, this.y};
        return p;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }        
}
