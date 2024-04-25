import java.util.Scanner;
public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        
        double salarioTotal;
        if (horasTrabajadas <= 40) {
            salarioTotal = tarifaPorHora * horasTrabajadas;
        } else {
            int horasNormales = 40;
            int horasExtra = horasTrabajadas - 40;
            salarioTotal = (tarifaPorHora * horasNormales) + (tarifaPorHora * 2 * horasExtra);
        }

        
        System.out.println("El salario total es: " + salarioTotal);
    }
}

