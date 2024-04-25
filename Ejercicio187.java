import java.util.Scanner;
public class Ejercicio187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la posición inicial de la reina (fila columna): ");
        int filaInicial = scanner.nextInt();
        int columnaInicial = scanner.nextInt();

        
        System.out.print("Ingrese la posición a la que se moverá la reina (fila columna): ");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();

        
        if (esMovimientoValido(filaInicial, columnaInicial, filaDestino, columnaDestino)) {
            System.out.println("El movimiento es válido.");
        } else {
            System.out.println("El movimiento no es válido.");
        }
    }

    
    public static boolean esMovimientoValido(int filaInicial, int columnaInicial, int filaDestino, int columnaDestino) {
        
        return filaInicial == filaDestino || columnaInicial == columnaDestino || Math.abs(filaInicial - filaDestino) == Math.abs(columnaInicial - columnaDestino);
    }
}

