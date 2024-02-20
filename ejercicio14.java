
    import java.util.Scanner;
    public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de cuatro dígitos: ");
        int numero = scanner.nextInt();

        int digito1 = numero / 1000;
        int digito2 = (numero / 100) % 10;
        int digito3 = (numero / 10) % 10;
        int digito4 = numero % 10;

        int suma = (digito1 + digito2 + digito3 + digito4)  ;

        System.out.println("La suma de los dígitos es: " + suma);
    }
}

