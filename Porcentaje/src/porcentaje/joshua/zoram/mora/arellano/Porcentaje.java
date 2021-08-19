/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentaje.joshua.zoram.mora.arellano;

import java.util.*;


/**
 *
 * @author josh
 */
public class Porcentaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
      double PuntosObtenidos;
      double TotaldePuntos;
      double Resultado;
      
      Scanner Teclado= new Scanner (System.in);
      
      System.out.println("Ingresa los puntos a favor");
      PuntosObtenidos= Teclado.nextDouble();
      System.out.println("Ingresa el total de puntos");
      TotaldePuntos= Teclado.nextDouble();
      
      Resultado= (PuntosObtenidos*100)/TotaldePuntos;
      
      System.out.println("El porcentaje es: "+ Resultado + "%");
      
      
      
      
    }
    
}
