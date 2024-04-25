import java.util.Scanner;
public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el límite para la serie Fibonacci: ");
        int limite = scanner.nextInt();

        
        System.out.println("Serie Fibonacci hasta el número " + limite + ":");
        for (int i = 0; fib(i) <= limite; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

