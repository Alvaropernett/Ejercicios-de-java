import java.util.Scanner;

public class Ejercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero positivo:");
        int m = Math.abs(scanner.nextInt()); 

        System.out.println("Ingrese el segundo número entero positivo:");
        int n = Math.abs(scanner.nextInt()); 
        
        int mcd = encontrarMCD(m, n);

        
        System.out.println("El máximo común divisor de " + m + " y " + n + " es: " + mcd);

        
        scanner.close();
    }

    
    public static int encontrarMCD(int m, int n) {
        
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
       
        return m;
    }
}

