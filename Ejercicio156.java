import java.util.Scanner;
public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la primera cadena en minúsculas: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena en minúsculas: ");
        String cadena2 = scanner.nextLine();

        
        String cadena1Mayusculas = cadena1.toUpperCase();
        String cadena2Mayusculas = cadena2.toUpperCase();

        
        if (cadena1Mayusculas.equals(cadena2Mayusculas)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
    }
}

