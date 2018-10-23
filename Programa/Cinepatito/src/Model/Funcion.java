package Model;


import Model.Asiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esthefany
 */
public class Funcion {
    private int idFuncion;
    private String hora;
    private int sala;
    private Asiento asientos[][];
    private boolean abierta;
    private Pelicula peli;

    public Funcion() {
    }

    public Funcion(int idFuncion, String hora, int sala, Asiento[][] asientos, boolean abierta, Pelicula pelicula) {
        this.idFuncion = idFuncion;
        this.hora = hora;
        this.sala = sala;
        this.asientos = asientos;
        this.abierta = abierta;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }


    
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    
    public void cerrar(){
        setAbierta(false);
        
        
    }
    
}
