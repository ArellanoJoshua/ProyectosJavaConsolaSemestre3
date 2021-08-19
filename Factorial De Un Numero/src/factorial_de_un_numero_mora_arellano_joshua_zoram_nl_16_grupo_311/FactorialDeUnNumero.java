package factorial_de_un_numero_mora_arellano_joshua_zoram_nl_16_grupo_311;

import java.util.*;

public class FactorialDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero:");

        int numero = Teclado.nextInt();
        int Factorial = 1;

        while (numero != 0) {
            Factorial *= numero;
            numero--;
        }
        System.out.println("El factorial es: " + Factorial);

    }
}
