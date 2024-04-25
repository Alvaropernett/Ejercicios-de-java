import java.util.Scanner;

public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer voltaje:");
        double voltaje1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo voltaje:");
        double voltaje2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer voltaje:");
        double voltaje3 = scanner.nextDouble();

        double promedio = (voltaje1 + voltaje2 + voltaje3) / 3;

        if (promedio < 115) {
            System.out.println("VOLTAJE CORRECTO");
        } else if (promedio >= 115 && promedio < 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("PELIGRO");
        }

        scanner.close();
    }
}

