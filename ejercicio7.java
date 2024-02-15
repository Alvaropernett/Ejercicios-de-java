import java.util.Scanner;

public class ejercicio7 {
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número:");
        double numero = entrada.nextDouble();

        if (numero == 0) {
            System.out.println("El número es neutro");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }   
}
