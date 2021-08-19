package practica_decimal_a_binario_mora_arellano_joshua_zoram_grupo_311_nl_16;

import java.util.*;

public class PracticaDecimalABinario {

    public static void main(String[] args) {
       
        Scanner Decimal = new Scanner (System.in);
        int Residuo = 0;
        System.out.println("Ingresa un numero decimal");
        String Numero = Decimal.nextLine();
        int Cociente = Integer.parseInt(Numero);
        
        while (Cociente != 0){
            Residuo = Cociente % 2;
            Cociente = Cociente / 2;
            System.out.println(Residuo);
        
        }
    }
}
