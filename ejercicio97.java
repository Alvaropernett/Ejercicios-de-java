import java.util.Scanner;

public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double valorReferencia = 10000; 

        
        System.out.print("Ingrese el consumo de la Termoeléctrica Manta en kW: ");
        double consumo = scanner.nextDouble();

        
        double porcentaje = (consumo / valorReferencia) * 100;

        
        if (porcentaje >= 80 && porcentaje <= 100) {
            System.out.println("CONSUMO MEDIO");
        } else if (porcentaje > 100) {
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        } else {
            System.out.println("El consumo ingresado está por debajo del 80% del valor de referencia.");
        }

        scanner.close();
    }
}
