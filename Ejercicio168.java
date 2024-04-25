import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese las 5 letras vocales en desorden:");
        String entrada = scanner.nextLine();

        
        if (entrada.length() != 5) {
            System.out.println("Debe ingresar exactamente 5 letras.");
            return;
        }

        
        char[] vocales = entrada.toCharArray();

        
        Arrays.sort(vocales);

        
        System.out.println("Las vocales ordenadas son:");
        for (char vocal : vocales) {
            System.out.print(vocal + " ");
        }
    }
}


