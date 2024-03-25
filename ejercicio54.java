import java.util.Scanner;

public class ejercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double medidaCent, medidaPulg;

        System.out.println("Ingresa la longitud expresadas en CM");
        medidaCent = sc.nextDouble();
        sc.close();

        medidaPulg = medidaCent / 2.54;

        System.out.println("La medida de "+medidaCent+ " CM "+ " equivale a "+String.format("%.2f", medidaPulg) + " pulgadas" );


    }
}
