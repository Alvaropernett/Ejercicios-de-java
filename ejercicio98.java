import java.util.Scanner;

public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;

        
        if (suma % resta == 0) {
            System.out.println("La división de la suma entre la resta es exacta.");
        } else {
            System.out.println("La división de la suma entre la resta no es exacta.");
        }

        scanner.close();
    }
}