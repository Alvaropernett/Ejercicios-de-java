import java.util.Scanner;
public class ejercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, salarioxHorasExtra, horasTraba, tarifaPorHoras, horasExtra, tarifaPorHorasExtra, tarifaAumento50porciento;

        System.out.print("Ingresa las horas trabajadas: ");
        horasTraba = sc.nextDouble();

        System.out.print("Ingresa la tarifa por horas trabajadas: ");
        tarifaPorHoras = sc.nextDouble();
        sc.close();

        if (horasTraba > 40) {
            
            horasExtra = horasTraba - 40;
          
            horasTraba = horasTraba - horasExtra;
            
            salario = horasTraba * tarifaPorHoras;
           
            tarifaAumento50porciento = tarifaPorHoras * 0.5;
            tarifaPorHorasExtra = tarifaPorHoras + tarifaAumento50porciento;
            salarioxHorasExtra = horasExtra * tarifaPorHorasExtra;
            
            salario = salario + salarioxHorasExtra;
            System.out.println("El salario del trabajador es: $"+ salario);
        } else {
            salario = horasTraba * tarifaPorHoras;
            System.out.println("EL salario del trabajador es: $"+ salario);
        }
    }
}
