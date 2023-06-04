/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libro;

/**
 *
 * @author Nuria
 */
public class Texto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Texto t=new Texto(5);
       t.addPrincipio("HO");
      t.addPrincipio(':');
      t.add("La");
      t.add('X');
      t.mostrar();
        System.out.println("Numero de vocales" + t.numVocales());
        
        
    }
    
}
