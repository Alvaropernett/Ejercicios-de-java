import java.util.Scanner;
public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBoletos = 0;
        double ventaBruta = 0;
        int boletosAdulto = 0;
        int boletosNiño = 0;
        int boletosPromocion = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Venta #" + i);

            
            System.out.println("Tipo de boleto: ");
            System.out.println("1. Adulto ($60)");
            System.out.println("2. Niño ($30)");
            System.out.println("3. Promoción ($20)");
            int tipoBoleto = scanner.nextInt();

            System.out.print("Cantidad vendida: ");
            int cantidad = scanner.nextInt();

            
            totalBoletos += cantidad;
            if (tipoBoleto == 1) {
                ventaBruta += cantidad * 60;
                boletosAdulto += cantidad;
            } else if (tipoBoleto == 2) {
                ventaBruta += cantidad * 30;
                boletosNiño += cantidad;
            } else if (tipoBoleto == 3) {
                ventaBruta += cantidad * 20;
                boletosPromocion += cantidad;
            } else {
                System.out.println("Tipo de boleto no válido.");
            }
        }

        
        System.out.println("\nResumen de ventas:");
        System.out.println("Total de boletos vendidos: " + totalBoletos);
        System.out.println("Venta bruta total: $" + ventaBruta);
        System.out.println("Venta por tipo de boleto:");
        System.out.println("Boletos Adulto: " + boletosAdulto);
        System.out.println("Boletos Niño: " + boletosNiño);
        System.out.println("Boletos Promoción: " + boletosPromocion);
    }
}

