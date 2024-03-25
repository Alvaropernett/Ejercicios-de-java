import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosCentigrados;
        double gradosFahrenheit;

        System.out.println("Ingresa los grados en Centigrados");
        gradosCentigrados = sc.nextDouble();
        sc.close();

        gradosFahrenheit = ((gradosCentigrados *9)/5) + 32;

        System.out.println(gradosCentigrados +"°C grados centigrados equivale a "+ gradosFahrenheit + "°F Fahrenheit");

    }
}
