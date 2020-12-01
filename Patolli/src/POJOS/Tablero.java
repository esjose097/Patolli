/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
