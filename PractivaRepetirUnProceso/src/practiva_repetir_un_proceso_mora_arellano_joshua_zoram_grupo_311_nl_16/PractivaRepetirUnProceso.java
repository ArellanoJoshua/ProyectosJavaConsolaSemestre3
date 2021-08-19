package practiva_repetir_un_proceso_mora_arellano_joshua_zoram_grupo_311_nl_16;

import java.util.*;

public class PractivaRepetirUnProceso {

 
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int i,Numero= 0;
        
        System.out.print("Ingresa desde que numero quieres realizar la cuenta regresiva: ");
        Numero = Teclado.nextInt();
        for (i=Numero; i>=0; i--){
            System.out.println(i);
        }
        
    }
    
}
