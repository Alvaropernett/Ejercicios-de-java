import java.util.Scanner;

public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia en metros: ");
        double distanciaMetros = scanner.nextDouble();

        double distanciaKilometros = convertirAKilometros(distanciaMetros);

        System.out.println("La distancia ingresada es equivalente a " + distanciaKilometros + " kilómetros.");

        scanner.close();
    }

    public static double convertirAKilometros(double metros) {
        return metros / 1000;
    }
}
