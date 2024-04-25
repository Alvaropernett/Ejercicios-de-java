import java.util.Scanner;
public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        
        while (true) {
            System.out.println("Ingrese un número (ingrese 0 para finalizar):");
            int numero = scanner.nextInt();

            
            contador++;

            
            if (numero == 0) {
                break;
            }
        }

        
        System.out.println("Se han leído " + (contador - 1) + " números.");

        
        scanner.close();
    }
}

