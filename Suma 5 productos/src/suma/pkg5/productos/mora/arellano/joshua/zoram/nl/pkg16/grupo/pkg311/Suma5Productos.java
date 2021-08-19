/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.pkg5.productos.mora.arellano.joshua.zoram.nl.pkg16.grupo.pkg311;

import java.util.*;

/**
 *
 * @author josh
 */
public class Suma5Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        double Producto1, Producto2, Producto3, Producto4, Producto5, Descuento, Subtotal, Total;
        
        System.out.println("Ingresa el precio del primer producto");
        Producto1 = Teclado.nextDouble();
        System.out.println("Ingresa el precio del segundo producto");
        Producto2 = Teclado.nextDouble();
        System.out.println("Ingresa el precio del tercer producto");
        Producto3 = Teclado.nextDouble();
        System.out.println("Ingresa el precio del cuarto producto");
        Producto4 = Teclado.nextDouble();
        System.out.println("Ingresa el precio del quinto producto");
        Producto5 = Teclado.nextDouble();
        
        Subtotal = Producto1 + Producto2 + Producto3 + Producto4 + Producto5;
        
        System.out.println("El subtotal de la compra es:  $" + Subtotal);
        if (Subtotal <200){
            Descuento = Subtotal * 0.05;
            Total = Subtotal - Descuento;
            System.out.println("El total de la compra con el descuento aplicado del 5% es: $ " + Total);
        }else if (Subtotal >=200 && Subtotal <500){
              Descuento = Subtotal * 0.08;
            Total = Subtotal - Descuento;
            System.out.println("El total de la compra con el descuento aplicado del 8% es: $ " + Total);
        }else if (Subtotal>=500 && Subtotal <1000){
              Descuento = Subtotal * 0.10;
            Total = Subtotal - Descuento;
            System.out.println("El total de la compra con el descuento aplicado del 10% es: $ " + Total);
        }else if (Subtotal >=1000){
              Descuento = Subtotal * 0.15;
            Total = Subtotal - Descuento;
            System.out.println("El total de la compra con el descuento aplicado del 15% es: $ " + Total);
        }
        
    }
    
}
