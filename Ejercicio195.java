import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] arreglo = new int[20];
        for (int i = 0; i < 20; i++) {
            arreglo[i] = (i + 1) * 2; 
        }

        
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();

        
        int comparaciones = 0;
        int indice = busquedaBinaria(arreglo, numeroBuscar, comparaciones);

        
        if (indice != -1) {
            System.out.println("El número " + numeroBuscar + " se encontró en la posición " + indice);
            System.out.println("Cantidad de comparaciones realizadas: " + comparaciones);
        } else {
            System.out.println("El número " + numeroBuscar + " no se encontró en el arreglo.");
        }
    }

    
    private static int busquedaBinaria(int[] arreglo, int numeroBuscar, int comparaciones) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            
            if (arreglo[medio] == numeroBuscar) {
                comparaciones++;
                return medio;
            }

            
            if (arreglo[medio] < numeroBuscar) {
                comparaciones++;
                izquierda = medio + 1;
            } else { 
                comparaciones++;
                derecha = medio - 1;
            }
        }

        
        return -1;
    }
}

