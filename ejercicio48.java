import java.util.Scanner;
public class ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, suma, resta, multiplicacion, division, resto;

        System.out.println("Ingrese el numero 1: ");
        numero1 = sc.nextDouble();

        System.out.println("Ingresa el numero 2: ");
        numero2 = sc.nextDouble();
        sc.close();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma entre "+ numero1 + " y "+ numero2 +" es "+ suma);
        System.out.println("La resta entre "+ numero1 + " y "+ numero2 +" es "+ resta);
        System.out.println("La multiplicacion entre "+ numero1 + " y "+ numero2 +" es "+ multiplicacion);
        System.out.println("La division entre "+ numero1 + " y "+ numero2 +" es "+ division);
        System.out.println("El resto de la division entre "+ numero1 + " y "+ numero2 +" es "+ resto);


        
    }
}
