import java.util.Scanner;
public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        char respuesta;

        
        System.out.println("Hola usuario!");

        do {
            
            System.out.println("¿Desea que siga imprimiendo el saludo? [S/N]");
            respuesta = scanner.next().charAt(0);

            
            if (respuesta == 'S' || respuesta == 's') {
                System.out.println("Hola usuario!");
            }
        } while (respuesta == 'S' || respuesta == 's');

        
        scanner.close();
    }
}

