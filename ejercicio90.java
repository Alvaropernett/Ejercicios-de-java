import java.util.Scanner;

public class Ejercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                matriz[i][j] = scanner.nextInt();

        
        int primosMatriz = contarPrimos(matriz);

        System.out.println("La cantidad de números primos en la matriz es: " + primosMatriz);

        
        System.out.print("Ingrese la longitud del vector: ");
        int longitud = scanner.nextInt();
        int[] vector = new int[longitud];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < longitud; i++)
            vector[i] = scanner.nextInt();

        
        int primosVector = contarPrimos(vector);

        System.out.println("La cantidad de números primos en el vector es: " + primosVector);

        scanner.close();
    }

    
    public static int contarPrimos(int[][] matriz) {
        int count = 0;
        for (int[] fila : matriz)
            for (int elemento : fila)
                if (esPrimo(elemento))
                    count++;
        return count;
    }

    
    public static int contarPrimos(int[] vector) {
        int count = 0;
        for (int elemento : vector)
            if (esPrimo(elemento))
                count++;
        return count;
    }

    
    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++)
            if (numero % i == 0)
                return false;
        return true;
    }
}

