import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        
        System.out.println("Ingrese los números que desee. Ingrese 0 para terminar.");
        double numero;
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextDouble();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);

        
        double sumaTotal = 0;
        for (double num : numeros) {
            sumaTotal += num;
        }

        System.out.println("La suma total de los números ingresados es: " + sumaTotal);
    }
}

