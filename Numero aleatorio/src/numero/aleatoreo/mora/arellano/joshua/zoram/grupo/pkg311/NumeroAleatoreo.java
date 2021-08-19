/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.aleatoreo.mora.arellano.joshua.zoram.grupo.pkg311;

import java.util.*;
import java.math.*;

/**
 *
 * @author josh
 */
public class NumeroAleatoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Numero = 0; 
        int Resultado = 0;
        
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Este es un programa que calcula un numero aleatorio entre un determinado rango definido por usted");
      System.out.println("Cual sera el rango maximo del cual se podra generar el numero");
      Numero = sc.nextInt();
     Resultado= (int) (Math.random()*Numero + 1);
     System.out.println("El numero generado es: " + Resultado);
    }
    
}
