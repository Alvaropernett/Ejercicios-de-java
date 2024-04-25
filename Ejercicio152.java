import java.util.Scanner;
public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        
        char[] arregloOriginal = cadena.toCharArray();

        
        char[] copia = new char[arregloOriginal.length];

       
        for (int i = 0; i < arregloOriginal.length; i++) {
            copia[i] = arregloOriginal[i];
        }

        
        System.out.println("Cadena original: " + cadena);
        System.out.print("Copia de la cadena: ");
        for (char c : copia) {
            System.out.print(c);
        }
        System.out.println();
    }
}

