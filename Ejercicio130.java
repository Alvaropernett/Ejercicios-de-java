import java.util.Scanner;
public class Ejercicio130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el monto total a pagar: ");
        double montoTotal = scanner.nextDouble();

        
        System.out.print("Ingrese el plazo de pago en meses (12 o 24): ");
        int plazoPago = scanner.nextInt();

        
        double interesPorMes = 0.02; 
        double montoPorMes = montoTotal / plazoPago;

        
        double totalAPagar = 0;
        for (int i = 0; i < plazoPago; i++) {
            double interes = montoTotal * interesPorMes;
            montoTotal += interes;
            totalAPagar += montoPorMes + interes;
        }

        
        System.out.println("El monto a pagar por mes es: " + montoPorMes);
        System.out.println("El total a pagar es: " + totalAPagar);
    }
}

