package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esthefany
 */
public class Asiento {
    private int idAsiento;
    private boolean disponible;

    public Asiento(int idAsiento, boolean disponibildad) {
        this.idAsiento = idAsiento;
        this.disponible = disponibildad;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponibildad(boolean disponibildad) {
        this.disponible = disponibildad;
    }
    
}
