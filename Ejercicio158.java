import java.util.Scanner;
public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine().toLowerCase();

        
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < cadena.length(); j++) {
            char caracter = cadena.charAt(j);
            if (caracter == 'a') {
                a++;
            } else if (caracter == 'e') {
                e++;
            } else if (caracter == 'i') {
                i++;
            } else if (caracter == 'o') {
                o++;
            } else if (caracter == 'u') {
                u++;
            }
        }

        
        System.out.println("Número de ocurrencias de cada vocal:");
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
    }
}

