/**
 * Esta clase se encarga de representar un objeto de tipo Partida.
 */
package POJOS;

import java.util.ArrayList;

/**
 *
 * @author Equipo 4
 */
public class Partida {
    private String codigo;
    private Tablero tablero;
    private Integer apuesaMax;
    private Integer apuesaMin;
    private Integer apuesaFija;
    private int numJugadores;
    private int numFichas;
    private ArrayList<Invitado> listaInvitado;
    private Anfitrion anfitrion;

    public Partida() {
    }    
    
    public Partida(String codigo, Tablero tablero, Integer apuesaMax, Integer apuesaMin, Integer apuesaFija, int numJugadores, int numFichas, Anfitrion anfitrion) {        
        this.codigo = codigo;
        this.tablero = tablero;
        this.apuesaMax = apuesaMax;
        this.apuesaMin = apuesaMin;
        this.apuesaFija = apuesaFija;
        this.numJugadores = numJugadores;
        this.numFichas = numFichas;
        this.listaInvitado = new ArrayList<>();
        this.anfitrion = anfitrion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Integer getApuesaMax() {
        return apuesaMax;
    }

    public void setApuesaMax(Integer apuesaMax) {
        this.apuesaMax = apuesaMax;
    }

    public Integer getApuesaMin() {
        return apuesaMin;
    }

    public void setApuesaMin(Integer apuesaMin) {
        this.apuesaMin = apuesaMin;
    }

    public Integer getApuesaFija() {
        return apuesaFija;
    }

    public void setApuesaFija(Integer apuesaFija) {
        this.apuesaFija = apuesaFija;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }

    public ArrayList<Invitado> getListaInvitado() {
        return listaInvitado;
    }

    public void setListaInvitado(ArrayList<Invitado> listaInvitado) {
        this.listaInvitado = listaInvitado;
    }

    public Anfitrion getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(Anfitrion anfitrion) {
        this.anfitrion = anfitrion;
    }            
    
    private boolean iniciarPartida(){
        return true;
    }
    
    private boolean turno(){
        return true;
    }
     private Usuario getGanador(){
         return null;
     }
}
