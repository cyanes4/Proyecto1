/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nogal.personas;
import com.nogal.exceptions.*;
/**
 *
 * @author Nuria
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad)throws TooHighNumberException,TooLowNumberException {
        this.nombre = nombre;
        this.setEdad(edad);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws TooHighNumberException,TooLowNumberException {

        if (edad > 130)  {
           throw new com.nogal.exceptions.TooHighNumberException("Edad demasiado alta"); 

        } else if (edad < 0) {
           throw new com.nogal.exceptions.TooLowNumberException("Edad demasiado baja");
            } else {
                this.edad = edad;
            }

        

    }
}
