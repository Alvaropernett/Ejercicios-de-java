import java.util.Scanner;

public class ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero1, numero2, numero3;
        float suma, multiplicacion;

        System.out.println("Ingresa tres numeros: ");
        System.out.print("Numero 1: ");
        numero1 = sc.nextFloat();
        System.out.print("Numero 2: ");
        numero2 = sc.nextFloat();
        System.out.print("Numero 3: ");
        numero3 = sc.nextFloat();
        sc.close();

        suma = numero1 + numero2 + numero3;
        multiplicacion = numero1 * numero2 * numero3;

        System.out.println("La suma de "+ numero1 + ", "+numero2+ ", "+numero3+ " es de "+ suma);
        System.out.println("La multiplicacion de "+ numero1 + ", "+numero2+ ", "+numero3+ " es de "+ multiplicacion);



    }
}
