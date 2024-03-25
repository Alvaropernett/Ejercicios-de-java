import java.util.Scanner;

public class ejercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma=0;
        
        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) {
            suma = suma + i;
            if (i<n) {
                System.out.print(i+ " + ");
            }  else {
                System.out.print(i+ ".");
            }  
        }

        System.out.println("\nSuma: "+suma);
    }
}
