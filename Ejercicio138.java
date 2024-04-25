import java.util.Scanner;
public class Ejercicio138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int opcion;
        do {
            
            System.out.println("Elija una opción:");
            System.out.println("1. Calcular área del círculo");
            System.out.println("2. Calcular área del cuadrado");
            System.out.println("3. Calcular área del triángulo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    calcularAreaCirculo(scanner);
                    break;
                case 2:
                    calcularAreaCuadrado(scanner);
                    break;
                case 3:
                    calcularAreaTriangulo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0); 
    }

    
    public static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    
    public static void calcularAreaCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    
    public static void calcularAreaTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}

