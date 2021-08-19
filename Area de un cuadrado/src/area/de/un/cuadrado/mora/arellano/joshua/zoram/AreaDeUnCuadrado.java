package area.de.un.cuadrado.mora.arellano.joshua.zoram;

import java.util.*;

public class AreaDeUnCuadrado {

    public static void main(String[] args) {

        int Lado, Resultado;

        Scanner Teclado = new Scanner(System.in);
        System.out.println("Este es un programa que le ayuda a calcular el area de un cuadrado");
        System.out.println("Ingresa la medida de un lado del cuadrado");
        Lado = Teclado.nextInt();

        Resultado = Lado * Lado;
        System.out.println("El area del cuadrado es: " + Resultado);

    }

}
