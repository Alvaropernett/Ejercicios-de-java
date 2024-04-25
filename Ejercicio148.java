import java.util.Scanner;
public class Ejercicio148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] calificaciones = leerDatos("calificaciones", scanner);

        
        calcularEstadisticas("calificaciones", calificaciones);

        
        double[] ventas = leerDatos("ventas", scanner);

        
        calcularEstadisticas("ventas", ventas);

        
        double[] mediciones = leerDatos("mediciones", scanner);

        
        calcularEstadisticas("mediciones", mediciones);
    }

    
    public static double[] leerDatos(String conjunto, Scanner scanner) {
        System.out.print("Ingrese la cantidad de " + conjunto + ": ");
        int cantidad = scanner.nextInt();
        double[] datos = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el dato #" + (i + 1) + ": ");
            datos[i] = scanner.nextDouble();
        }
        return datos;
    }

    
    public static void calcularEstadisticas(String conjunto, double[] datos) {
        double suma = 0;
        double minimo = Double.MAX_VALUE;
        double maximo = Double.MIN_VALUE;
        for (double dato : datos) {
            suma += dato;
            if (dato < minimo) {
                minimo = dato;
            }
            if (dato > maximo) {
                maximo = dato;
            }
        }
        double promedio = suma / datos.length;
        System.out.println("Estadísticas de " + conjunto + ":");
        System.out.println("  Promedio: " + promedio);
        System.out.println("  Mínimo: " + minimo);
        System.out.println("  Máximo: " + maximo);
    }
}

