import java.util.Scanner;
public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese el área o departamento: ");
        String areaDepartamento = scanner.nextLine();

        
        String nombreUsuario = generarNombreUsuario(nombreCompleto, areaDepartamento);

        
        System.out.println("Nombre de usuario generado: " + nombreUsuario);
    }

    
    public static String generarNombreUsuario(String nombreCompleto, String areaDepartamento) {
        
        String[] partesNombre = nombreCompleto.split(" ");
        String primerNombre = partesNombre[0];
        String primerApellido = partesNombre[1];
        String segundoApellido = partesNombre[2];

        
        String nombreUsuario = areaDepartamento.substring(0, 3) +
                                primerNombre.substring(0, 2).toLowerCase() +
                                primerApellido.substring(0, 2).toLowerCase() +
                                segundoApellido.substring(0, 2).toLowerCase();

        return nombreUsuario;
    }
}

