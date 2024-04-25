import java.util.Scanner;
public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número múltiplo: ");
        int multiplo = scanner.nextInt();

        
        for (int i = 1; i <= 3000; i++) {
            
            if (i % multiplo == 0) {
                System.out.println(i);
            }
        }
    }
}

