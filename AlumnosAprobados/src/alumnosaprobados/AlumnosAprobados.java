package alumnosaprobados;

import java.util.*;

public class AlumnosAprobados {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        double TotalAlumnos, AlumnosAprobados;
        double PorcentajeReprobados, PorcentajeAprobados;
        System.out.println("Ingrese el total de alumnos del grupo");
        TotalAlumnos = Teclado.nextDouble();
        System.out.println("Ingresa el total de alumnos aprobados");
        AlumnosAprobados = Teclado.nextDouble();

        PorcentajeAprobados = AlumnosAprobados * 100;
        PorcentajeAprobados = PorcentajeAprobados / TotalAlumnos;

        PorcentajeReprobados = TotalAlumnos - AlumnosAprobados;

        System.out.println("Alumnos Aprobados: " + PorcentajeAprobados + " %" + "\n Alumnos reprobados: " + PorcentajeReprobados + " %");
        
    }

}
