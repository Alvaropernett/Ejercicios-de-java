import java.util.Scanner;

public class ejercicio58 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double horasTrabajadas;
        double pagoPorHora;
        double salario;

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        pagoPorHora = entrada.nextDouble();

        
         salario = horasTrabajadas * pagoPorHora;
        
         System.out.println("El salario es de: $" + salario); 
        }

      
    }