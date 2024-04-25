import java.util.Scanner;
public class Ejercicio104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el número:");
        double numero = scanner.nextDouble();

        System.out.println("Ingrese el índice de la raíz:");
        double indice = scanner.nextDouble();

        
        double raiz = Math.pow(numero, 1.0 / indice);

        
        System.out.println("La raíz " + indice + " de " + numero + " es: " + raiz);

       
        scanner.close();
    }
}
