/**
 * Esta clase se encarga de representar un objeto de tipo Invitado.
 */
package POJOS;

import java.util.ArrayList;

/**
 *
 * @author Equipo 4
 */
public class Invitado extends Usuario{

    public Invitado() {
    }    

    public Invitado(String nombre, ArrayList<Ficha> fichas, int fondos) {
        super(nombre, fichas, fondos);
    }        
    
    public Invitado(String nombre) {
        super(nombre);
    }    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public Cañas getCañas() {
        return cañas;
    }

    public void setCañas(Cañas cañas) {
        this.cañas = cañas;
    }            
}
