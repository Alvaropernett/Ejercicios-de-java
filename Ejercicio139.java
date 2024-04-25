import java.util.Scanner;
public class Ejercicio139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("El factorial de un número negativo no está definido.");
        } else {
            
            long factorial = calcularFactorial(numero);

            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }

    
    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

