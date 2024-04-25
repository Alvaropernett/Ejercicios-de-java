import java.util.Scanner;
public class Ejercicio123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (en porcentaje): ");
        double tasaInteres = scanner.nextDouble() / 100; 

        System.out.print("Ingrese el número de días: ");
        int dias = scanner.nextInt();

        
        double capitalFinal = calcularCapitalFinal(capitalInicial, tasaInteres, dias);

        
        System.out.println("El capital final después de " + dias + " días es: " + capitalFinal);
    }

    
    public static double calcularCapitalFinal(double capitalInicial, double tasaInteres, int dias) {
        return capitalInicial * (1 + tasaInteres * dias);
    }
}

