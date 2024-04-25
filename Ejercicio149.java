import java.util.Scanner;
import java.util.Random;
public class Ejercicio149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("Piensa un número entre 1 y 100.");

        
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;

        
        while (true) {
            System.out.print("Adivina el número: ");
            int intento = scanner.nextInt();
            intentos++;

            
            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
                break;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número que pensaste es mayor.");
            } else {
                System.out.println("El número que pensaste es menor.");
            }
        }
    }
}

