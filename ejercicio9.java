import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad: ");
        double cantidad = scanner.nextDouble();
        double porcentajeIVA = 19.0;
        double iva = cantidad * (porcentajeIVA / 100.0);
        double totalConIVA = cantidad + iva;

        System.out.println("El IVA es: " + iva);
        System.out.println("El total con IVA es: " + totalConIVA);
    }
}

