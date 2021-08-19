/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula.general.mora.arellano.joshua.zoram.grupo.pkg311;

import java.util.*;
import java.math.*;

/**
 *
 * @author josh
 */
public class FormulaGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int A = 0;
        int B = 0;
        int C = 0;
        double Potencia = 0;
        double X1 = 0;
        double X2 = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa calcula los dos posibles resultados de una ecuacion cuadratica a traves de la formula general");
        System.out.println("Ingresa el valor A de la ecuacion...");
        A = sc.nextInt();
        System.out.println("Ingresa el valor B de la ecuacion...");
        B = sc.nextInt();
        System.out.println("Ingresa el valor C de la ecuacion...");
        C = sc.nextInt();
        Potencia = (B * B) - (4*A*C);
        if (Potencia > 0){
            X1 = (-B + Math.sqrt(Potencia))/2*A;
            X2 = (-B - Math.sqrt(Potencia))/2*A;
            System.out.println("La ecuacion tiene dos resultados");
            System.out.println("X1 es: "+ X1);
            System.out.println("X2 es: " + X2);
        }else if (Potencia == 0){
             X1 = (-B)/2*A;
             System.out.println("La ecuacion solo tiene un resultado disponible");
             System.out.println("X1: " + X1);
            
        }else{
            System.out.println("La ecuacion no tiene resultado");
        } 
    }  
}
