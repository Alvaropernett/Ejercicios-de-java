import java.util.Scanner;

public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        
        int suma = numero1 + numero2;

        
        if (suma % 2 == 0) {
            System.out.println("La suma de los dos números es par.");
        } else {
            System.out.println("La suma de los dos números es impar.");
        }

        scanner.close();
    }
}