import java.util.Scanner;

public class ejercicio70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumadeValores=0;

        System.out.println("Ingresa un numero: ");
        n = sc.nextInt();
        sc.close();

        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumadeValores = sumadeValores - i;
                if (i<n) {
                    System.out.print(i+"+");
                } else {
                    System.out.println(i+".");
                }
                
            } else {
                sumadeValores = sumadeValores + i;
                if (i<n) {
                    System.out.print(i+ "-");
                } else {
                    System.out.println(i+".");
                }
                
            }
        }

        System.out.println("\nResultado = "+sumadeValores);

        
    }
}