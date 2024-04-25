import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el voltaje " + i + ": ");
            double voltaje = scanner.nextDouble();
            suma += voltaje;
        }

        double promedio = suma / 5;

        if (promedio > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }

        scanner.close();
    }
}
