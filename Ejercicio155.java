import java.util.Scanner;
public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        
        if (esPalindromo(palabra)) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
        }
    }

    
    public static boolean esPalindromo(String palabra) {
        
        palabra = palabra.replaceAll("\\s", "").toLowerCase();
        
        
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

