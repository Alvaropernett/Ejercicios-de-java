import java.util.Scanner;
public class Ejercicio132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;

        
        int opcion;
        do {
            
            System.out.println("Seleccione una opción:");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1: 
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    if (cantidadDeposito > 0) {
                        saldo += cantidadDeposito;
                        System.out.println("Depósito exitoso. Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("La cantidad a depositar debe ser mayor que cero.");
                    }
                    break;
                case 2: 
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    if (cantidadRetiro > 0 && cantidadRetiro <= saldo) {
                        saldo -= cantidadRetiro;
                        System.out.println("Retiro exitoso. Su saldo actual es: $" + saldo);
                    } else if (cantidadRetiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        System.out.println("La cantidad a retirar debe ser mayor que cero.");
                    }
                    break;
                case 3: 
                    System.out.println("Gracias por utilizar nuestro servicio. Su saldo final es: $" + saldo);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3); 
    }
}

