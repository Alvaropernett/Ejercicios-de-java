import java.util.Scanner;
public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el valor de la primera variable: ");
        int variable1 = scanner.nextInt();
        System.out.print("Ingrese el valor de la segunda variable: ");
        int variable2 = scanner.nextInt();

        
        System.out.println("Valores originales:");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);

        
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;

        
        System.out.println("\nValores después del intercambio:");
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
    }
}

