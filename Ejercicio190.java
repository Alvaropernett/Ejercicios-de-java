import java.util.Scanner;
public class Ejercicio190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el monto total a pagar: ");
        int montoTotal = scanner.nextInt();

       
        System.out.print("Ingrese el monto pagado por el cliente: ");
        int montoPagado = scanner.nextInt();

        
        int diferencia = montoPagado - montoTotal;

        
        System.out.println("La diferencia a devolver al cliente es: $" + diferencia);

        
        int[] denominaciones = {1000, 500, 300, 200, 100};
        int[] cantidades = new int[denominaciones.length];

        for (int i = 0; i < denominaciones.length; i++) {
            cantidades[i] = diferencia / denominaciones[i];
            diferencia %= denominaciones[i];
        }

        
        System.out.println("Denominaciones monetarias a utilizar:");
        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidades[i] > 0) {
                System.out.println("$" + denominaciones[i] + ": " + cantidades[i]);
            }
        }
    }
}

