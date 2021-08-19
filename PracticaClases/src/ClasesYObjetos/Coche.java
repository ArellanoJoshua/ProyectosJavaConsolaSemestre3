package ClasesYObjetos;


public class Coche {
    
    String Color;
    String Marca;
    int Km;
    
    public static void main (String [] args ){
        
        Coche Coche1 = new Coche ();
        Coche1.Color = "Rojo";
        Coche1.Marca = "Chevrolet";
        Coche1.Km = 0;
        
        System.out.println("El color del coche es: " + Coche1.Color);
        System.out.println("La marca del coche es: " + Coche1.Marca);
        System.out.println("EL kilometraje del coche es: " + Coche1.Km);
    }
}
