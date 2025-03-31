/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author juand
 */
public class Perro {
    private String nombre; 
    private int edad; 
    private String raza; 
    private String color; 

    public Perro(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", color=" + color + '}';
    }
    
}
