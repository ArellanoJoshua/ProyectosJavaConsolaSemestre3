/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generar.codigo;

import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author josh
 */
public class GenerarCodigo {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner Teclado = new Scanner(System.in);
     
        String Codigo;
        String Producto;
        String ProductoCorto;
        String DiaCaducidad;
        String DiaCorto;
        String MesCaducidad;
        String MesCorto;
        String AñoCaducidad;
        String AñoCorto;
        String Venta;
        String VentaCorta;
        String Envasado;
        String EnvasadoCorto;
        
        Producto = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto");
        DiaCaducidad = JOptionPane.showInputDialog(null, "Ingresa el dia en que caduce que el producto");
        MesCaducidad = JOptionPane.showInputDialog(null, "Ingresa el mes en el que caduce el producto");
        AñoCaducidad = JOptionPane.showInputDialog(null, "Ingresa el año en el que caduda el producto");
        Venta = JOptionPane.showInputDialog(null, "¿A que tienda se vendera");
        Envasado = JOptionPane.showInputDialog(null, "¿Cual es su tipo de envasado (Lata, Bolsa, envase de vidrio, etc)?");
        
        ProductoCorto = Producto.substring(0,3);
        DiaCorto = DiaCaducidad.substring(0,2);
        MesCorto = MesCaducidad.substring(0,2);
        AñoCorto = AñoCaducidad.substring(0,2);
        VentaCorta = Venta.substring(0,3);
        EnvasadoCorto = Envasado.substring(0,2);
        Codigo = ProductoCorto + DiaCorto + MesCorto + AñoCorto + VentaCorta + EnvasadoCorto;
        JOptionPane.showMessageDialog(null, "El codigo del producto es: " + Codigo);

    }
}