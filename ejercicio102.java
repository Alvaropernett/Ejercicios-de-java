import java.util.Scanner;
public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

       
        double salario;

        if (horasTrabajadas > 40) {
            
            int horasExtras = horasTrabajadas - 40;
            salario = 40 * tarifaPorHora + horasExtras * (tarifaPorHora * 1.25);
        } else {
            
            salario = horasTrabajadas * tarifaPorHora;
        }

        
        System.out.println("El salario del trabajador es: $" + salario);

        
        scanner.close();
    }
}
