import java.util.Scanner;
public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        
        nombreCompleto = nombreCompleto.toLowerCase();

        
        char[] nombreArray = nombreCompleto.toCharArray();

        
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        
        int totalVocales = 0;

        
        for (char letra : nombreArray) {
            if (letra == 'a') {
                contadorA++;
                totalVocales++;
            } else if (letra == 'e') {
                contadorE++;
                totalVocales++;
            } else if (letra == 'i') {
                contadorI++;
                totalVocales++;
            } else if (letra == 'o') {
                contadorO++;
                totalVocales++;
            } else if (letra == 'u') {
                contadorU++;
                totalVocales++;
            }
        }

        
        System.out.println("Total de vocales: " + totalVocales);
        System.out.println("Cantidad de 'A': " + contadorA);
        System.out.println("Cantidad de 'E': " + contadorE);
        System.out.println("Cantidad de 'I': " + contadorI);
        System.out.println("Cantidad de 'O': " + contadorO);
        System.out.println("Cantidad de 'U': " + contadorU);
    }
}

