/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiz.cuadrada.de.un.numero.mora.arellano.joshua.zoram.grupo.pkg311;

import java.math.*;
import java.util.*;

/**
 *
 * @author josh
 */
public class RaizCuadradaDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        
        int Num1;
        double Resultado;
        
        System.out.println("Ingresa el numero del que se desea conocer su raiz cuadrada");
        Num1 = Teclado.nextInt();
        Resultado = Math.sqrt(Num1);
        System.out.println("El resultado de la raiz cuadrada de " + Num1 + " es de: " + Resultado);
 
    }
}
