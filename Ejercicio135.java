import java.util.Scanner;
public class Ejercicio135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la cantidad de números a comparar: ");
        int cantidadNumeros = scanner.nextInt();

        
        if (cantidadNumeros <= 0) {
            System.out.println("La cantidad de números debe ser mayor que cero.");
            return; 
        }

        
        System.out.println("Ingrese los " + cantidadNumeros + " números:");
        int numero;
        int mayor = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}

