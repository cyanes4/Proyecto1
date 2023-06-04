/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libro;

/**
 *
 * @author Nuria
 */
public class CuentaCorriente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     CuentaCorriente c1=new CuentaCorriente("pepe","12345678Q");
     CuentaCorriente c2=new CuentaCorriente(1000);
     CuentaCorriente c3=new CuentaCorriente(1000, "12345678", 50);
     c1.mostrarInformación();
     c2.mostrarInformación();
     c3.mostrarInformación();
        
        
       
        
        
    }        
    
}
