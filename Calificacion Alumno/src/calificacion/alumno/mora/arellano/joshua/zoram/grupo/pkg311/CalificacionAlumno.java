/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion.alumno.mora.arellano.joshua.zoram.grupo.pkg311;
import java.util.*;
/**
 *
 * @author josh
 */
public class CalificacionAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner (System.in);
        
        double Calificacion;
        System.out.println("Ingresa la calificacion");
        Calificacion = Teclado.nextDouble();
        
        if (Calificacion <6){
            System.out.println("Calificacion insuficiente");
        }else if (Calificacion >6 && Calificacion <=7){
            System.out.println("Suficiente");
        }else if (Calificacion >7 && Calificacion <=9){
            System.out.println("Notable");
        }else if (Calificacion >9 && Calificacion <=10){
            System.out.println("Sobresaliente");
        }   
    }
}
