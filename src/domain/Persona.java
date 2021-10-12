/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Santiago
 */
public class Persona {
    //Atributos
    private String nombre;
    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
    
    
}
