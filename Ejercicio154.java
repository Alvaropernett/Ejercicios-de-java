import java.util.Scanner;
public class Ejercicio154 {
    public static void main(String[] args) {
        
        String saludo = "Hola que tal";

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        
        String mensajeCompleto = saludo + " " + nombreUsuario;

        
        System.out.println("Mensaje completo: " + mensajeCompleto);
    }
}

