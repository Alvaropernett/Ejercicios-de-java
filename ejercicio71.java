import java.util.Scanner;
public class ejercicio71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Ingresa un numero: ");
        n = sc.nextInt();
        sc.close();
        int valores[] = new int[n];
        
        for (int i = 2; i < n; i++) {
            valores[0] = 1;
            valores[1] = 1;
            valores[i] = valores[i-2] + valores[i-1];
        }

        System.out.println("\nLa serie fibonacci de numeros antes de "+ n +" es: ");
        for (int i = 0; valores[i] <= n; i++) {
            System.out.print(valores[i]+" ");
        }
    }
}
