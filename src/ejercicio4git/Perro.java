/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4git;

/**
 *
 * @author Diego Figueroa
 */
public class Perro {
    public String nombre;
    public String raza;
    public String tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tama\u00f1o=" + tamaño + '}';
    }
    
}