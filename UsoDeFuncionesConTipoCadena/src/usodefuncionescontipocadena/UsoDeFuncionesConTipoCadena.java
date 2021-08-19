
package usodefuncionescontipocadena;

import java.util.*;

public class UsoDeFuncionesConTipoCadena {


    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner (System.in);
        int Largo;
        String Letra;
        String Nombre;
        
        System.out.println("Ingresa un nombre...");
        Nombre = Teclado.next();
        Largo = Nombre.length();
        Letra = Nombre.substring(Largo - 1, Largo);
    
        System.out.println("Hola " + Nombre + " tu nombre termina con " + Letra);
    }
    
}
