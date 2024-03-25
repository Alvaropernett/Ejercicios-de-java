import java.util.Scanner;

public class ejercicio52 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        
        System.out.println("Tabla de multiplicar del " + numero);
        System.out.println("--------------------");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    
}
}

