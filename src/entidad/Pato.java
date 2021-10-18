/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Guillermo
 */
public class Pato {
    private String color;
    private String raza;

    public Pato() {
    }

    public Pato(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Pato{" + "color=" + color + ", raza=" + raza + '}';
    }
    
    
    
}
