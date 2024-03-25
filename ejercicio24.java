import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pulgadasIngresadas;
        double conversionAcentimetros;

        System.out.println("Ingresa las pulgadas a convertir a centimetros");
        pulgadasIngresadas = sc.nextDouble();
        sc.close();

        conversionAcentimetros = pulgadasIngresadas * 2.54;

        System.out.println("Los pulgadas ingresadas "+ pulgadasIngresadas +" es igual  a "+ conversionAcentimetros + " cm");



    }
}
