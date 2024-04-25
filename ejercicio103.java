import java.util.Scanner;
public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        
        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        
        System.out.println("El número menor ingresado es: " + menor);

        
        scanner.close();
    }
}
