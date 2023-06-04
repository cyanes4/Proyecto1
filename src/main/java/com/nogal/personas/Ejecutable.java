/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nogal.personas;
import com.nogal.exceptions.*;
/**
 *
 * @author Nuria
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Persona p1=null,p2=null;
       try{
       p1=new Persona("juan",15);
             
       }catch(TooHighNumberException e){
           System.out.println("EDad muy alta");
       }catch( TooLowNumberException e){
           System.out.println("EDad muy baja");
       }catch (Exception e){
           System.out.println("Ha habido un error");
       }
       
       try{
        p2=new Persona("pep2",-1);
        
      }catch( TooLowNumberException e){
           System.out.println("EDad muy baja");
       }catch (Exception e){
           System.out.println("Ha habido un error");
       }
       
       try{
          p1.setEdad(180);
           }catch(TooHighNumberException e){
           System.out.println("EDad muy alta");
       }catch( TooLowNumberException e){
           System.out.println("EDad muy baja");
       }catch (Exception e){
           System.out.println("Ha habido un error");
       }
       
    }
    
}
