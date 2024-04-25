import java.util.Scanner;
public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        
        String cadenaInvertida = invertirCadena(cadena);

        
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    
    public static String invertirCadena(String cadena) {
        
        StringBuilder cadenaInvertida = new StringBuilder();

        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }

       
        return cadenaInvertida.toString();
    }
}

