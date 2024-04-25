import java.util.Scanner;
public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la venta:");
        double montoVenta = scanner.nextDouble();

        if (montoVenta > 1000) {
            
            double descuento = montoVenta * 0.10;

            double montoNeto = montoVenta - descuento;

            System.out.println("El monto neto de la venta con descuento es: " + montoNeto + " pesos.");
        } else {
             
            System.out.println("El monto de la venta es menor o igual a 1000 pesos, no se aplica descuento.");
        }

        
        scanner.close();
    }
}

