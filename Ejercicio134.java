import java.util.Scanner;
public class Ejercicio134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

       
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Por favor, ingrese al menos dos números diferentes.");
            return; 
        }

        
        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        int menor = Math.min(numero1, Math.min(numero2, numero3));

        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}

