import java.util.Scanner;

public class ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        if (radio <= 0) {
            System.out.println("DATOS ERRÓNEOS: El radio debe ser un número positivo.");
        } else {
            double area = calcularAreaCirculo(radio);
            System.out.println("El área del círculo es: " + area);
            if (area > 5000) {
                System.out.println("DATOS ERRÓNEOS: El área es mayor a 5000.");
            }
        }

        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}