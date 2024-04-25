import java.util.Scanner;

public class Ejercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = scanner.nextInt();

        
        int[] vector = new int[tamaño];

        
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        
        ordenarVector(vector);

        
        System.out.println("El vector ordenado de mayor a menor es:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    }

    
    public static void ordenarVector(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }
}

