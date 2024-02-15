import java.util.Scanner;

public class ejercicio8 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dividendo,divisor;
        System.out.println("ingrese el dividendo");
        dividendo = entrada.nextInt();
        System.out.println("igrese el divisor");
        divisor = entrada.nextInt();
        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;
        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
}
