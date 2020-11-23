/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOS;

import java.util.ArrayList;

/**
 *
 * @author Heriberto
 */
public class Invitado extends Usuario{

    public Invitado() {
    }

    public Invitado(String nombre, ArrayList<Ficha> fichas, int puntos, int fondos, Cañas cañas) {
        super(nombre, fichas, puntos, fondos, cañas);
    }
    
}
