import java.util.Scanner;
public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número base (N): ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente (X): ");
        int exponente = scanner.nextInt();

        
        double resultado = calcularPotencia(base, exponente);

        
        System.out.println(base + " elevado a la potencia " + exponente + " es igual a: " + resultado);
    }

    
    public static double calcularPotencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }
        if (exponente < 0) {
            resultado = 1 / resultado; 
        }
        return resultado;
    }
}

