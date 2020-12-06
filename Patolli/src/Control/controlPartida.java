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
        if(ficha.getPosicion() != 0)
        {            
            ficha.setPosicion((f.getPosicion() + tiro));
            if(ficha.getPosicion() > this.partida.getTablero().getCasillas().length)
            {
                ficha.setPosicion(ficha.getPosicion() - this.partida.getTablero().getCasillas().length);
            }
            for(int i = 0; i < this.partida.getTablero().getCasillas().length; i++)
            {
                if(ficha.getPosicion() == this.partida.getTablero().getCasillas()[i].getNumero())
                {
                    ficha.setCoordenadas(this.partida.getTablero().getCasillas()[i].getPosicion());
                }
            }
            return ficha;
        }
        else if(tiro > 0){
            return this.insertarFicha(ficha);            
        }
        else{
            return ficha;
        }
    }
    
    public Ficha insertarFicha(Ficha f){
        Ficha ficha = f;
        
        if(ficha.getColor().equalsIgnoreCase("blue") && this.partida.getTablero().getTamanio() == 8)
        {
            ficha.setPosicion(1);
            for(int i = 0; i < this.partida.getTablero().getCasillas().length; i++)
            {
                if(ficha.getPosicion() == this.partida.getTablero().getCasillas()[i].getNumero())
                {
                    ficha.setCoordenadas(this.partida.getTablero().getCasillas()[i].getPosicion());
                    break;
                }
            }
            return ficha;
        }
        else if(ficha.getColor().equalsIgnoreCase("blue") && this.partida.getTablero().getTamanio() == 10)
        {
            ficha.setPosicion(1);
            for(int i = 0; i < this.partida.getTablero().getCasillas().length; i++)
            {
                if(ficha.getPosicion() == this.partida.getTablero().getCasillas()[i].getNumero())
                {
                    ficha.setCoordenadas(this.partida.getTablero().getCasillas()[i].getPosicion());
                    break;
                }
            }
            return ficha;
        }
        else if(ficha.getColor().equalsIgnoreCase("green") && this.partida.getTablero().getTamanio() == 8)
        {
            ficha.setPosicion(10);
            for(int i = 0; i < this.partida.getTablero().getCasillas().length; i++)
            {
                if(ficha.getPosicion() == this.partida.getTablero().getCasillas()[i].getNumero())
                {
                    ficha.setCoordenadas(this.partida.getTablero().getCasillas()[i].getPosicion());
                    break;
                }
            }
            return ficha;
        }
        else if(ficha.getColor().equalsIgnoreCase("green") && this.partida.getTablero().getTamanio() == 10)
        {
            ficha.setPosicion(12);
            for(int i = 0; i < this.partida.getTablero().getCasillas().length; i++)
            {
                if(ficha.getPosicion() == this.partida.getTablero().getCasillas()[i].getNumero())
                {
                    ficha.setCoordenadas(this.partida.getTablero().getCasillas()[i].getPosicion());
                    break;
                }
            }
            return ficha;
        }
        else{ return null;}        
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
