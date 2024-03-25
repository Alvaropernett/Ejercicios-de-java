import java.util.Scanner;

public class ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma=0;

        System.out.println("Ingresa un numero: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 2*n-1; i+=2) {
            suma = suma + i;
        }

        System.out.println("\nLa suma de la serie de numeros 1+3+5+...+"+ (2*n-1)+ " es: "+suma);

    }
}
