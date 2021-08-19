package Parametros;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int N1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));
        
        Operaciones op = new Operaciones();
        op.Sumar(N1, N2);
        op.Restar(N1,N2);
        op.Dividir(N1, N2);
        op.Multiplicacion(N1,N2);
        op.MostrarResultados();
        
    }
}
