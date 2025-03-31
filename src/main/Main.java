/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Perro;
import core.Person;

/**
 *
 * @author Autologon
 */
public class Main {
    
    public static void main(String[] args) {
        Person persona = new Person ("Juan","Ingeniero", 15, 15.2);
        Perro perro = new Perro("Joel", 13, "Snowser", "blanco");
        System.out.println(persona);
        System.out.println(perro);
    }
    
}
