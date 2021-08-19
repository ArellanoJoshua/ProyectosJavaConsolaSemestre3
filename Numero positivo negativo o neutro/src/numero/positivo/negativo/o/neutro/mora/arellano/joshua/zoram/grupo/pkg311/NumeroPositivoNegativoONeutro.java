/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.positivo.negativo.o.neutro.mora.arellano.joshua.zoram.grupo.pkg311;

 import java.util.*;

/**
 *
 * @author josh
 */
public class NumeroPositivoNegativoONeutro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner (System.in);
        double Numero;
        
        System.out.println("Ingresa un numero");
        Numero = Teclado.nextDouble();
        
        if (Numero > 0){
            System.out.println("El numero que ingresaste es positivo");
        }else if(Numero == 0){
            System.out.println("El numero que ingresaste es neutro");
        }else if(Numero < 0){
            System.out.println("El numero que ingresaste es negativo");
        }
    }
}
