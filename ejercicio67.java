import java.util.Scanner;

public class ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, factorial=1;

        System.out.println("Ingresa un numero: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de "+ n + " es : "+ factorial);
    }
}
