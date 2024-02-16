import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double num1,num2,num3,promedio,suma;
        System.out.print("Ingresa el primer número: ");
         num1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo número: ");
         num2 = entrada.nextDouble();

        System.out.print("Ingresa el tercer número: ");
         num3 = entrada.nextDouble();

        promedio = (num1 + num2 + num3) / 3;
        
         suma = num1 + num2 + num3;

        System.out.println("El promedio de los tres números es: " + promedio);
        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("El doble del primer número es: " + (2 * num1));
        System.out.println("El triple del segundo número es: " + (3 * num2));
        System.out.println("El cuadrado del tercer número es: " + (num3 * num3));

    }
}

