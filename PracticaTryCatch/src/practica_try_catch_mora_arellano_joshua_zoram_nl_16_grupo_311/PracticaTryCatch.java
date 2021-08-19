package practica_try_catch_mora_arellano_joshua_zoram_nl_16_grupo_311;

import java.util.*;

public class PracticaTryCatch {

    public static void main(String[] args) {
        
        String Cadena = "ABCD";
        int Numero;
        
        try{
            Numero = Integer.parseInt(Cadena);
            
        }catch(NumberFormatException e){
            System.out.println("No es un numero, es una cadena");
        }
        
    }
    
}
