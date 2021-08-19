/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resta.de.dos.numeros;
import java.util.*;

/**
 *
 * @author josh
 */
public class RestaDeDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Num1;
        int Num2;
        int Resultado;
        
        Scanner Teclado=new Scanner (System.in);
        System.out.println("Introduce el primer numero:");
        Num1=Teclado.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        Num2=Teclado.nextInt();
        
        Resultado= Num1-Num2;
        System.out.println("El resultado de la resta es:" + "\n"+ Resultado);
                
      
    }
    
}
