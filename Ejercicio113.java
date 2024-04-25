import java.util.Scanner;
public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int distancia = 500;

        
        final double rendimientoMotocicleta = 20.0;
        final double rendimientoAutomovil = 10.0;
        final double rendimientoPickup = 5.0;

        
        System.out.println("Ingrese el costo de la gasolina por litro:");
        double costoGasolina = scanner.nextDouble();

        
        double gasolinaMotocicleta = distancia / rendimientoMotocicleta;
        double gasolinaAutomovil = distancia / rendimientoAutomovil;
        double gasolinaPickup = distancia / rendimientoPickup;

       
        double costoTotalMotocicleta = gasolinaMotocicleta * costoGasolina;
        double costoTotalAutomovil = gasolinaAutomovil * costoGasolina;
        double costoTotalPickup = gasolinaPickup * costoGasolina;

       
        System.out.println("Costo total de gasolina para viajar en Motocicleta: $" + costoTotalMotocicleta);
        System.out.println("Costo total de gasolina para viajar en Automóvil: $" + costoTotalAutomovil);
        System.out.println("Costo total de gasolina para viajar en Pickup: $" + costoTotalPickup);

        
        scanner.close();
    }
}

