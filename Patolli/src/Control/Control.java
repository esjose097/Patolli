/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Equipo 4
 */
public class Control {
    private controlApuestas controlA;
    private controlPartida controlP;
    private controlTablero controlT;
    
    public Control(){}
    
    public controlApuestas getControlA(){
        if(this.controlA == null)
        {
            this.controlA = new controlApuestas();
            return this.controlA;
        }
        else
        {
            return this.controlA;
        }
    }

    public controlPartida getControlP(){
        if(this.controlP == null)
        {
//            this.controlP = new controlPartida();
            return this.controlP;
        }
        else
        {
            return this.controlP;
        }
    }
    
    public controlTablero getControlT(){
        if(this.controlT == null)
        {
            this.controlT = new controlTablero();
            return this.controlT;
        }
        else
        {
            return this.controlT;
        }
    }    
}
