import java.util.Scanner;
public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la primera cadena de caracteres: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena de caracteres: ");
        String cadena2 = scanner.nextLine();

        
        int comparacion = cadena1.compareTo(cadena2);

        
        if (comparacion == 0) {
            System.out.println("Ambas cadenas son iguales.");
        } else if (comparacion < 0) {
            System.out.println("La primera cadena es menor alfabéticamente que la segunda.");
        } else {
            System.out.println("La segunda cadena es menor alfabéticamente que la primera.");
        }
    }
}

