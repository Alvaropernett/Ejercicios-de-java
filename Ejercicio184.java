import java.util.Scanner;
public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese los datos para generar el RFC:");
        System.out.print("Nombre o razón social: ");
        String nombre = scanner.nextLine().toUpperCase();
        System.out.print("Fecha de nacimiento o de creación (en formato AAAA-MM-DD): ");
        String fecha = scanner.next().replaceAll("-", ""); 

       
        String iniciales = obtenerIniciales(nombre);

        
        String rfc = iniciales + fecha.substring(2, 8);

        
        System.out.println("RFC generado: " + rfc);
    }

    public static String obtenerIniciales(String nombre) {
        StringBuilder iniciales = new StringBuilder();

        
        iniciales.append(nombre.charAt(0));

       
        for (int i = 1; i < nombre.length(); i++) {
            if (nombre.charAt(i - 1) == ' ') {
                iniciales.append(nombre.charAt(i));
            }
        }

       
        while (iniciales.length() < 3) {
            iniciales.append('X');
        }

        return iniciales.toString();
    }
}

