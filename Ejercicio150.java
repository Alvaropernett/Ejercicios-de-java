import java.util.Scanner;

public class Ejercicio150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        
        System.out.print("La descomposición en factores primos de " + numero + " es: ");
        descomponerEnFactoresPrimos(numero);
    }

    
    public static void descomponerEnFactoresPrimos(int numero) {
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i);
                numero /= i;
                if (numero != 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}

