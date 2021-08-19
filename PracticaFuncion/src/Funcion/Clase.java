package Funcion;

import javax.swing.JOptionPane;

public class Clase {

    public static void main(String[] args) {

        int N1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));

        Retorno op = new Retorno();
        System.out.println(op.Sumar(N1, N2));
        System.out.println(op.Restar(N1, N2));
        System.out.println(op.Dividir(N1, N2));
        System.out.println(op.Multiplicacion(N1, N2));

    }
}
