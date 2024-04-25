import java.util.Scanner;
public class Ejercicio140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        
        do {
            
            System.out.println("Menú:");
            System.out.println("1) Salir");
            System.out.println("2) Sumatoria");
            System.out.println("3) Factorial");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.println("Saliendo del programa...");
                    break;
                case 2:
                    calcularSumatoria(scanner);
                    break;
                case 3:
                    calcularFactorial(scanner);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 1); 
    }

    
    public static void calcularSumatoria(Scanner scanner) {
        System.out.print("Ingrese un número para calcular su sumatoria: ");
        int numero = scanner.nextInt();
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
        }
        System.out.println("La sumatoria de " + numero + " es: " + sumatoria);
    }

    
    public static void calcularFactorial(Scanner scanner) {
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

