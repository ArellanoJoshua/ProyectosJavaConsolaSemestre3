package numeros_pares_mora_arellano_joshua_zoram_nl_16_grupo_311;

import java.util.*;
import javax.swing.JOptionPane;

public class NumerosPares {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));

        while (numero != 0) {
            
            if (numero % 2 == 0) {
                System.out.println("El numero  " + numero + " es par");
                
            } else {
                System.out.println("El numero " + numero + " es impar");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero "));

        }
    }

}
