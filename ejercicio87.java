import java.util.Scanner;

public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de un lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();

        if (lado <= 0) {
            System.out.println("DATOS NO VÁLIDOS: La longitud del lado debe ser un número positivo.");
        } else {
            double area = calcularAreaTrianguloEquilatero(lado);
            System.out.println("El área del triángulo equilátero es: " + area);
            if (area > 1000) {
                System.out.println("DATOS NO VÁLIDOS: El área es mayor a 1000.");
            }
        }

        scanner.close();
    }

    public static double calcularAreaTrianguloEquilatero(double lado) {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
}

