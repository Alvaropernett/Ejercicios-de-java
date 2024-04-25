import java.util.Scanner;
public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cantidadNumeros = 0;

        System.out.println("Ingrese una lista de números positivos (0 para terminar):");

        
        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            
            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                suma += numero;
                cantidadNumeros++;
            } else {
                System.out.println("Por favor, ingrese solo números positivos.");
            }
        }

        double promedio = cantidadNumeros > 0 ? (double) suma / cantidadNumeros : 0;


        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}

