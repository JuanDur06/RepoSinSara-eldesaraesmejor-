/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author juand
 */
public class Person {
    private String name;
    private String Profesion;
    private int edad;
    private double estatura;

    public Person(String name, String Profesion, int edad, double estatura) {
        this.name = name;
        this.Profesion = Profesion;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", Profesion=" + Profesion + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
}
