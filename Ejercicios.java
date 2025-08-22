public class Ejercicios {
    public static void main(String[] args) {

        final String carnet1 = "2500662025";
        final String nombre1 = "Cristian Alexander Galdámez Renderos";
        final String carnet2 = "2502662025";
        final String nombre2 = "Iván lizandro Castellanos Martínez";
        final String carnet3 = "2504622025";
        final String nombre3 = "Brayan Orlando Cabezas Moreno";
        final String carnet4 = "2521372025";
        final String nombre4 = "Emerson Eliseo Flamenco Hernandez";

        int numero1 = 15;
        int numero2 = 59;
        double real1 = 18.25;
        double real2 = 30.35;
        boolean respuesta = true;

        boolean ejercicio1 = numero2 < numero1;
        double ejercicio2 = real2 - real1;
        boolean ejercicio3 = respuesta != true;

        System.out.println("\n");
        System.out.println(nombre1);
        System.out.println(carnet1);
        System.out.println("===================================");
        System.out.println(nombre2);
        System.out.println(carnet2);
        System.out.println("===================================");
        System.out.println(nombre3);
        System.out.println(carnet3);
        System.out.println("===================================");
        System.out.println(nombre4);
        System.out.println(carnet4);
        System.out.println("===================================");
        System.out.println("\n");
        
        System.out.println("Es "+ numero2 + " menor que " + numero1 + "? " + ejercicio1);
        System.out.println(real1 + " menos "+ real2 + " es igual a: " + ejercicio2);
        System.out.println("Es " + respuesta + " diferente de \'true\'? " + ejercicio3);
        System.out.println("\n");
    }
}
