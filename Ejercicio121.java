import java.util.Scanner;
public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        
        double sumaTotal = 0;
        for (double numero : numeros) {
            sumaTotal += numero;
        }

        
        System.out.println("La suma total de los números ingresados es: " + sumaTotal);
    }
}

