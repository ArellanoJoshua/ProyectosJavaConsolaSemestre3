package Parametros;

import javax.swing.JOptionPane;

public class Operaciones {

    int Suma;
    int Resta;
    int Divicion;
    int Multiplicacion;

    public void Sumar(int Num1, int Num2) {
        Suma = Num1 + Num2;
    }

    public void Restar(int Num1, int Num2) {
        Resta = Num1 - Num2;
    }

    public void Dividir(int Num1, int Num2) {
        Divicion = Num1 / Num2;
    }

    public void Multiplicacion(int Num1, int Num2) {
        Multiplicacion = Num1 * Num2;
    }

    public void MostrarResultados() {
        System.out.println("La suma es: " + Suma);
        System.out.println("La resta es: " + Resta);
        System.out.println("La divicion es: " + Divicion);
        System.out.println("La multiplicacion es: " + Multiplicacion);
    }
}
