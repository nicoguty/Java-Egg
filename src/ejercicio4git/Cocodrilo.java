/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4git;

/**
 *
 * @author nicolas
 */
public class Cocodrilo {
    
   private String nombre;
   private Integer numero_dientes;
   private String tipo_sangre;

    public Cocodrilo() {
    }

    public Cocodrilo(String nombre, Integer numero_dientes, String tipo_sangre) {
        this.nombre = nombre;
        this.numero_dientes = numero_dientes;
        this.tipo_sangre = tipo_sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero_dientes() {
        return numero_dientes;
    }

    public void setNumero_dientes(Integer numero_dientes) {
        this.numero_dientes = numero_dientes;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
   
   
    
    
}
