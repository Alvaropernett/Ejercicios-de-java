import java.util.Scanner;
public class ejercicio76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long numeroIngresado;
        String numero;
        int cifras;

        System.out.println("Ingresa un numero ");
        numeroIngresado = sc.nextLong();
        sc.close();

        numero = String.valueOf(numeroIngresado);

        cifras = numero.length();

        System.out.println("El numero de cifras de dicho numero es de "+ cifras+ " cifras");


    }
}
