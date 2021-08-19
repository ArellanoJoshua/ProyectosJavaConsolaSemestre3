/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.dos.numeros.mora.arellano.joshua.zoram;

import java.util.*;

/**
 *
 * @author josh
 */
public class SumaDeDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Num1, Num2, Resultado;
        
        Scanner Teclado=new Scanner (System.in);
        System.out.println("Este es un programa que suma dos numeros");
        System.out.println("Ingresa el primer numero");
        Num1=Teclado.nextInt();
        System.out.println("Ingresa el segundo numero");
        Num2=Teclado.nextInt();
        
        Resultado = Num1 + Num2;
        System.out.println("La suma de los dos numeros es: " + Resultado);
        
        
        
        
    }
    
}
