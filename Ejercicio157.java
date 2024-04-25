import java.util.Scanner;
public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su nombre en MAYÚSCULAS: ");
        String nombre = scanner.nextLine();

        
        if (nombre.startsWith("A")) {
            
            nombre = nombre.toLowerCase();
            System.out.println("Su nombre convertido a minúsculas es: " + nombre);
        } else {
            System.out.println("Su nombre no comienza con la letra A, no se realizaron conversiones.");
        }
    }
}

