import java.util.Scanner;
public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Línea de autobuses ADO - Seleccione su destino:");
        System.out.println("a) Cartagena. [$150]");
        System.out.println("b) Barranquilla. [$320]");
        System.out.println("c) Sincelejo. [$120]");
        System.out.println("d) Valledupar. [$90]");
        System.out.println("e) Santa Marta.[$110]");

        
        System.out.println("Seleccione una opción (a, b, c, d, e):");
        char opcion = scanner.next().charAt(0);

        
        String destino;
        double precio;

        switch (opcion) {
            case 'a':
                destino = "Cartagena";
                precio = 150;
                break;
            case 'b':
                destino = "Barranquilla";
                precio = 320;
                break;
            case 'c':
                destino = "Sincelejo";
                precio = 120;
                break;
            case 'd':
                destino = "Valledupar";
                precio = 90;
                break;
            case 'e':
                destino = "Santa Marta";
                precio = 110;
                break;
            default:
                destino = "Destino inválido";
                precio = 0;
        }

        
        System.out.println("Destino seleccionado: " + destino);
        System.out.println("Precio del boleto: $" + precio);

        
        scanner.close();
    }
}

