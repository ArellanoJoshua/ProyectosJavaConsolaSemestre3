/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorema.de.pitagoras.mora.arellano.joshua.zoram.grupo.pkg311;

import java.util.*;
import java.math.*;

/**
 *
 * @author josh
 */
public class TeoremaDePitagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    
     double CatetoAdyacente = 0;
     double CatetoOpuesto = 0;
     double Hipotenusa = 0;
     double ResultadoPotencia = 0;
     System.out.println("Este es un programa que haya la medida faltante a traves del teorema de pitagoras");
     System.out.println("Si no conoces la medida del cateto Opuesto o del cateto adyacente, ingresa 0");
     System.out.println("Ingresa la medida del cateto Adyacente");
     CatetoAdyacente = sc.nextDouble();
     System.out.println("Ingresa la medida del cateto opuesto");
     CatetoOpuesto = sc.nextDouble();
     System.out.println("Ingresa la medida de la hipotenusa, si no la conoces ingresa 0");
     Hipotenusa = sc.nextDouble();
      if (CatetoAdyacente == 0){
          ResultadoPotencia = (Hipotenusa * Hipotenusa) - (CatetoOpuesto * CatetoOpuesto);
          CatetoAdyacente  = Math.sqrt(ResultadoPotencia);
          System.out.println("La medida del cateto adyacente es: " + CatetoAdyacente);
      }else if (CatetoOpuesto == 0){
          ResultadoPotencia = (Hipotenusa * Hipotenusa) - (CatetoAdyacente * CatetoAdyacente);
          CatetoOpuesto= Math.sqrt(ResultadoPotencia);
          System.out.println("La medida del cateto opuesto es:" + CatetoOpuesto);   
      }else{
          ResultadoPotencia = (CatetoAdyacente * CatetoAdyacente) + (CatetoOpuesto * CatetoOpuesto);
          Hipotenusa = Math.sqrt(ResultadoPotencia);
          System.out.println("La medida de la hipotenusa es: " + Hipotenusa);
      }
    }
}
