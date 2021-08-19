
package proyecto_teorema_mora_arellano_joshua_zoram_nl_16_grupo311;

import java.util.*;

public class ProyectoTeorema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner Teclado = new Scanner (System.in);
        double CatetoAdyacente = 0,CatetoOpuesto = 0,Hipotenusa = 0,Resultado = 0,Raiz = 0;
        System.out.println("Ingresa el valor del cateto adyacente (En caso de no conocerlo ingresa 0)");
        CatetoAdyacente  = Teclado.nextDouble();
        System.out.println("Ingresa el valor del cateto opuesto (En caso de no conocerlo ingresa 0)");
        CatetoOpuesto = Teclado.nextDouble();
        System.out.println("Ingresa el valor de la hipotenusa (En caso de no conocerlo ingresa 0)");
        Hipotenusa = Teclado.nextDouble();
        
        if (CatetoAdyacente>0 && CatetoOpuesto>0){
            Raiz = (CatetoAdyacente*CatetoAdyacente) + (CatetoOpuesto * CatetoOpuesto);
            Resultado = Math.sqrt(Raiz);
            System.out.println("La hipotenusa mide: " + Resultado);
            
        }else if (CatetoAdyacente>0 && Hipotenusa>0){
            Raiz = (Hipotenusa * Hipotenusa) - (CatetoAdyacente * CatetoAdyacente);
            Resultado = Math.sqrt(Raiz);
            System.out.println("El cateto opuesto mide: " + Resultado);
          
        }else if(CatetoOpuesto>0 && Hipotenusa>0){
            Raiz = (Hipotenusa * Hipotenusa) - (CatetoOpuesto * CatetoOpuesto);
            Resultado = Math.sqrt(Raiz);
            System.out.println("El cateto adyacente mide: " + Resultado);
        }
    }
    
}
