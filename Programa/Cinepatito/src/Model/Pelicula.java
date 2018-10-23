/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Esthefany
 */
public class Pelicula {
    private String nombre;
    private String duracion;
    

    public Pelicula(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    public Pelicula(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
        
    }
    

