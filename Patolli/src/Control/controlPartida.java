/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import POJOS.Ficha;
import POJOS.Partida;
import POJOS.Tablero;

/**
 *
 * @author Casal
 */
public class controlPartida {
    private Partida partida;
    int turno;
    
    public controlPartida(Partida t){
        this.partida = t;
        this.turno = 1;
    }
    public Ficha actualizarFicha(int tiro, Ficha f){
        Ficha ficha = f;
        ficha.setPosicion((f.getPosicion() + tiro));
        for(int i = 0; i < this.partida.getTablero().getCasillas().length; i++)
        {
            if(ficha.getPosicion() == this.partida.getTablero().getCasillas()[i].getNumero())
            {
                ficha.setCoordenadas(this.partida.getTablero().getCasillas()[i].getPosicion());
            }
        }
        return ficha;
    }
    
    public void setTablero(Partida t){
        this.partida = t;
    }
    
    public int getTurno(){
        return this.turno;
    }
    
    public void cambiarTurno(){
        if(this.turno < this.partida.getNumJugadores())
        {
            this.turno = this.turno+1;
        }
        else
        {
            this.turno = 1;
        }
    }
}
