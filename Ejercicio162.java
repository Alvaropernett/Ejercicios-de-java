import java.util.Scanner;
public class Ejercicio162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número positivo menor a 10: ");
        int numero = scanner.nextInt();

        
        if (numero <= 0 || numero >= 10) {
            System.out.println("El número ingresado no es válido.");
            return;
        }

        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

