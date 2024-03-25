 import java.util.Scanner;

public class ejercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double voltioporNaranja=0.05, kilovoltioIngresados, cantidadNaranja, pesoNaranjaGr, pesoNaranjaToneladas;

        System.out.println("Una naranja tiene la capacidad de producir 0.05 voltios. Si un sistema de \n iluminación requiere de x kilovoltios para su funcionamiento. Cuántas naranjas\nrealizan el trabajo deseado.");
        System.out.println("Ingresa la cantidad de kilovoltios (kV) para el funcionamiento del sistema de iluminacion");
        System.out.print("Kilovoltios: ");
        kilovoltioIngresados = entrada.nextDouble();
        
        double kiloVporNaranja = voltioporNaranja / 1000;

        cantidadNaranja = kilovoltioIngresados/kiloVporNaranja;

        pesoNaranjaGr = cantidadNaranja * 6;

        pesoNaranjaToneladas = pesoNaranjaGr/1e+6;

        System.out.println("La cantidad de naranjas necesarias para el trabajo es de "+cantidadNaranja+ " Naranjas.");
        System.out.println("Las toneladas de naranja necesarias en total son "+pesoNaranjaToneladas+ " Toneladas");

        
    }
}

