import java.util.Scanner;

public class Ejercicio108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        
        scanner.close();
    }
}

