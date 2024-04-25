import java.util.Scanner;

public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Usted ingresó la edad: " + edad);

        scanner.close();
    }
}

