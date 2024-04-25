import java.util.Scanner;
public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número (A): ");
        double numA = scanner.nextDouble();
        System.out.print("Ingrese el segundo número (B): ");
        double numB = scanner.nextDouble();

        
        double suma = numA + numB;
        double resta = numA - numB;
        double multiplicacion = numA * numB;
        double division = numA / numB;
        double residuo = numA % numB;

        
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);
    }
}

