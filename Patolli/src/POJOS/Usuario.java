/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOS;

import java.awt.List;
import java.util.ArrayList;
import POJOS.Ficha;
/**
 *
 * @author Heriberto
 */
public class Usuario {
    private String nombre;
    private ArrayList<Ficha> fichas; 
    private int puntos;
    private int fondos;
    private Cañas cañas;

    public Usuario() {
    }

    public Usuario(String nombre, ArrayList<Ficha> fichas, int puntos, int fondos, Cañas cañas) {
        this.nombre = nombre;
        this.fichas = fichas;
        this.puntos = puntos;
        this.fondos = fondos;
        this.cañas = cañas;
    }

   public boolean mover()
   {
       return true;
   }
   public boolean apostar()
   {
       return true;
   }
   public boolean apostarVariable(int apuesta)
   {
       return true;
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
