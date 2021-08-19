package arreglo_multidimensional_mora_arellano_joshua_zoram_nl_16_grupo_311;

import java.util.*;

public class ArregloMultidimensional {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        int Numeros[][] = new int[5][3];

        for (int i = 0; i < Numeros.length; i++) {
            for (int j = 0; j < Numeros[i].length; j++) {
                Numeros[i][j] = i + j;
            }
            System.out.println(Arrays.toString(Numeros[i]));
        }

        /*  
     Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingresa cuantas filas deseas agregar a la matriz: ");
        int Dato1 = Teclado.nextInt();
        System.out.println("Ingresa cuantas columnas deseas agregar a la matriz: ");
        int Dato2 = Teclado.nextInt();

        int ANumeros[][] = new int[Dato1][Dato2];
        //El primer valor corresponde a las fias y el segundo valor a las columnas 
        for (int i = 0; i < ANumeros.length; i++){
            for (int j = 0; j < ANumeros[i].length; j++) {
               
                System.out.println("Ingresa el primer dato a guardar en la fila: " + (i + 1) + " y columna: " + (j + 1));
                ANumeros[i][j] = Teclado.nextInt();
            }
        }
        for (int a = 0; a<ANumeros.length; a++){
            for (int b = 0; b<ANumeros [a].length; b++){
                System.out.println("El numero almacenado en la fila " + (a + 1) + " y columna "+ (b + 1) + " es: " + ANumeros[a][b]);
            }
         */
    }
}
