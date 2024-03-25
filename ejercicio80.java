import java.util.Scanner;
public class ejercicio80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datoEntero;
        double datoReal;

        System.out.println("Ingresa dato Entero");
        datoEntero = sc.nextInt();

        System.out.println("Ingresa dato real");
        datoReal = sc.nextDouble();
        sc.close();

        System.out.println("\nDato Entero: \n"+datoEntero);
        System.out.println("Dato Real: \n"+datoReal);

    }
}
