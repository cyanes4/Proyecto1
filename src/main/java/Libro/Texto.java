/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Nuria
 */
public class Texto {
    
    private String cad;
    private final int tamMax;
    static final String VOCALES="aeiouáéíóú";

    public Texto(int tamMax) {
        cad="";
        this.tamMax = tamMax;
    }
    
    public void add (char c){
        
        if(tamMax>cad.length()){
            cad=cad+c;
        }
    }
    
    public void add(String c){
        if(tamMax>cad.length()+c.length()){
            cad=cad+c;
        } 
    }
    
    public void addPrincipio(char c){
          if(tamMax>cad.length()){
            cad=c+cad;
        }
    }
     public void addPrincipio(String c){
           if(tamMax>cad.length()+c.length()){
            cad=c+cad;
        } 
     }
     
     public void mostrar(){
         System.out.println(cad);
         
     }
     
     public int numVocales(){
         
         int voc=0;
         
         for(int i=0;i<=cad.length();i++){
             
             if(esVocal(cad.charAt(i)))
                 
                 voc++;
         }
         return (voc);
     }
     
     
     public boolean esVocal(char c){
         
         boolean vocal=false;
         
         c=Character.toLowerCase(c);
         
         if(VOCALES.indexOf(c) !=-1){
             vocal=true;
         }
         return(vocal);
     }
    
}
