import java.util.Scanner;

public class ejercicio43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("digite el primer numero");
        numero1 = entrada.nextInt();
        System.out.println("digite el segundo numero ");
        numero2 = entrada.nextInt();

        if (numero1 < numero2) {
            System.out.println("El número menor es: " + numero1);
        } else {
            System.out.println("El número menor es: " + numero2);
        }
         
    }
} 