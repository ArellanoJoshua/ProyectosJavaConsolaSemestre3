package practica_arreglos_unidimensionales_mora_arellano_joshua_zoram_nl_16_grupo_311;

import java.util.*;
import javax.swing.JOptionPane;

public class PracticaArreglosUnidimensionales {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos que desea tener"));
        char[] Letras = new char[nElementos];

        System.out.println("Digite los elementos del arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un caracter");
            Letras[i] = Teclado.next().charAt(0);
        }
        System.out.println("Los caracteres almacenados en el arreglo son: ");
        for (int j = 0; j < nElementos; j++) {
            System.out.println(Letras[j] + " ");
        }
    }

}
