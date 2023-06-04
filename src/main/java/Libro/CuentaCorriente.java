/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Nuria
 */
public class CuentaCorriente {
    private double saldo;
    private String nombre;
    private String dni;
    private double limite;

    public CuentaCorriente( String nombre, String dni) {
        this.saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        this.limite = -50;
    }

    public CuentaCorriente(double saldo) {
        this.saldo = 0;
        this.limite=0;
        this.nombre="";
        this.dni="";
        
    }

    public CuentaCorriente(double saldo, String dni, double limite) {
        this.saldo = saldo;
        this.dni = dni;
        this.limite = limite;
        this.nombre="";
    }

    
    boolean sacarDinero(int cantidad){
        
        boolean operacionPosible;
        
        if((saldo-cantidad)>=limite){
        
        saldo-=cantidad;
        
        operacionPosible=true;
         }else{
            System.out.println("No hay dinero suficiente");
           operacionPosible=false;
        }
        return (operacionPosible);
            
    }
    
    void ingresoCantidad(double cantidad){
        
        saldo+=cantidad;
    }
    
    void  mostrarInformación(){
        
        System.out.println("Nombre:" + nombre);
        System.out.println("DNI:" + dni);
        System.out.println("Saldo" + saldo);
        System.out.println("Limite descubierto:" + limite);
        
    }
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
