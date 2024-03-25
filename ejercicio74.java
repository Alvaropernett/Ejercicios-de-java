import java.util.Arrays;
import java.util.Scanner;
public class ejercicio74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[3];

        System.out.println("Ingresa tres numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("- Numero "+(i+1)+ ":");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(numeros);
        System.out.println();
        for (int j = 0; j < numeros.length; j++) {
            System.out.print(numeros[j]+" ");
        }
        
    }
}
