import java.util.Scanner;

public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de los vectores: ");
        int longitud = scanner.nextInt();

        int[] vector1 = new int[longitud];
        int[] vector2 = new int[longitud];

        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}

