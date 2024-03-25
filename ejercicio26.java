import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, cuadradoHipotenusa;

        System.out.println("Ingresa la longitud de los dos catetos");
        System.out.print("-");
        cateto1 = sc.nextDouble();
        System.out.print("-");
        cateto2 = sc.nextDouble();
        sc.close();

        cuadradoHipotenusa = cateto1 * cateto1 + cateto2 * cateto2;
        cuadradoHipotenusa = Math.sqrt(cuadradoHipotenusa);

        System.out.println("El cuadrado de la hipotenusa del triangulo rectangulo es "+ String.format("%.2f", cuadradoHipotenusa));
    }

}
