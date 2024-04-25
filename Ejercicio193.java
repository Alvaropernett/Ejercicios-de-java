import java.util.Scanner;
public class Ejercicio193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entre 1 y 255: ");
        int numero = scanner.nextInt();

        
        if (numero < 1 || numero > 255) {
            System.out.println("El número ingresado está fuera del rango permitido.");
            return; 
        }

        
        System.out.print("El número " + numero + " en binario es: ");
        for (int i = 7; i >= 0; i--) {
            if ((numero & (1 << i)) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

