import java.util.Scanner;
public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la coordenada de arranque del caballo (x y): ");
        int xInicial = scanner.nextInt();
        int yInicial = scanner.nextInt();

        
        System.out.print("Ingrese la coordenada destino del caballo (x y): ");
        int xDestino = scanner.nextInt();
        int yDestino = scanner.nextInt();

        
        if (esMovimientoValido(xInicial, yInicial, xDestino, yDestino)) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }
    }

    
    public static boolean esMovimientoValido(int xInicial, int yInicial, int xDestino, int yDestino) {
        
        int dx = Math.abs(xDestino - xInicial);
        int dy = Math.abs(yDestino - yInicial);
        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }
}

