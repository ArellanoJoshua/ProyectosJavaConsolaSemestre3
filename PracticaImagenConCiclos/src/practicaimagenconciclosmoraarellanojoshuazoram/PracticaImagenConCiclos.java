package practicaimagenconciclosmoraarellanojoshuazoram;

public class PracticaImagenConCiclos {

    public static void main(String[] args) {

        System.out.println("   FELIZ NAVIDAD");
        String Salida = "";
        char[] Arbol = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        for (int i = 9, j = 9; j > 0; i++, j--) {

            char Asterisco = '*';
            Arbol[i] = Asterisco;
            Arbol[j] = Asterisco;
            Salida = new String(Arbol);
            System.out.println(Salida);
        }
        System.out.println("        ***\n        ***");
    }

}
