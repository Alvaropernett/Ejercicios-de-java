import java.util.Scanner;
public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el numerador y denominador de la primera fracción (en ese orden):");
        int numerador1 = scanner.nextInt();
        int denominador1 = scanner.nextInt();

        System.out.println("Ingrese el numerador y denominador de la segunda fracción (en ese orden):");
        int numerador2 = scanner.nextInt();
        int denominador2 = scanner.nextInt();

        
        if (denominador1 != denominador2) {
            System.out.println("Ambas fracciones deben tener el mismo denominador.");
            return;
        }

        
        int numeradorSuma = numerador1 + numerador2;
        int numeradorResta = numerador1 - numerador2;
        int denominador = denominador1; 

        
        System.out.println("La suma de las fracciones es: " + numeradorSuma + "/" + denominador);
        System.out.println("La resta de las fracciones es: " + numeradorResta + "/" + denominador);
    }
}

