/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor.de.edad.mora.arellano.joshua.zoram.mora.arellano.grupo.pkg311;

import java.util.*;

/**
 *
 * @author josh
 */
public class MayorDeEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        
        int Edad;
        System.out.println("Ingresa tu edad");
        Edad = Teclado.nextInt();
        
        if (Edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }
    }
    
}
