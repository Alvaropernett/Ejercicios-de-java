import java.util.Scanner;

public class Ejercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        if (promedio > 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("MEJORE LA NOTA");
        }

        scanner.close();
    }
}

