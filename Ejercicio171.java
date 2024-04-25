import java.util.Scanner;
public class Ejercicio171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            
            System.out.println("Menú de conversión de unidades:");
            System.out.println("1 - Libras a kilogramos");
            System.out.println("2 - Millas a kilómetros");
            System.out.println("3 - Galones a litros");
            System.out.println("4 - Fahrenheit a Celsius");
            System.out.println("5 - Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor en libras: ");
                    double libras = scanner.nextDouble();
                    double kilogramos = libras * 0.453592;
                    System.out.println(libras + " libras equivale a " + kilogramos + " kilogramos.\n");
                    break;
                case 2:
                    System.out.print("Ingrese el valor en millas: ");
                    double millas = scanner.nextDouble();
                    double kilometros = millas * 1.60934;
                    System.out.println(millas + " millas equivale a " + kilometros + " kilómetros.\n");
                    break;
                case 3:
                    System.out.print("Ingrese el valor en galones: ");
                    double galones = scanner.nextDouble();
                    double litros = galones * 3.78541;
                    System.out.println(galones + " galones equivale a " + litros + " litros.\n");
                    break;
                case 4:
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5/9;
                    System.out.println(fahrenheit + " grados Fahrenheit equivale a " + celsius + " grados Celsius.\n");
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.\n");
            }
        } while (opcion != 5);
    }
}

