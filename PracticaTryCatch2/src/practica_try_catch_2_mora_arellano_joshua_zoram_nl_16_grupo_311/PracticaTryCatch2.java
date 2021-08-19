
package practica_try_catch_2_mora_arellano_joshua_zoram_nl_16_grupo_311;

import java.util.*;

public class PracticaTryCatch2 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
   
       int Seleccion = 0;
       String Dia; 
       System.out.println("Ingresa un numero de la semana");
       Seleccion = Teclado.nextInt();
       switch (Seleccion)
       {
           case 1: Dia = "Lunes" ;
           break;
           case 2: Dia = "Martes";
           break;
           case 3: Dia = "Miercoles";
           break;
           case 4: Dia = "Jueves";
           break;
           case 5: Dia = "Viernes";
           break;
           case 6: Dia = "Sabado";
           break;
           case 7: Dia = "Domingo";
           break;
           default: Dia = "Invalido, ingresa un dato correcto";
           break;  
       }
       System.out.println ("El numero del dia que ingresaste es el de: " + Dia);
 
    }
    
}
