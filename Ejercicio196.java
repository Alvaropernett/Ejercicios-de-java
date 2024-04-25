import java.util.Random;
public class Ejercicio196 {
    public static void main(String[] args) {
        
        double[][] ingresos = new double[18][10];

        
        llenarArreglo(ingresos);

        
        System.out.println("Total de ingresos de cada vendedor:");
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 0; producto < ingresos[vendedor].length; producto++) {
                totalVendedor += ingresos[vendedor][producto];
            }
            System.out.println("Vendedor " + (vendedor + 1) + ": $" + totalVendedor);
        }

        
        System.out.println("\nPromedio de ingresos por cada producto:");
        for (int producto = 0; producto < ingresos[0].length; producto++) {
            double totalProducto = 0;
            for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
                totalProducto += ingresos[vendedor][producto];
            }
            double promedioProducto = totalProducto / ingresos.length;
            System.out.println("Producto " + (producto + 1) + ": $" + promedioProducto);
        }

        
        System.out.println("\nPromedio de ingresos por vendedor:");
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 0; producto < ingresos[vendedor].length; producto++) {
                totalVendedor += ingresos[vendedor][producto];
            }
            double promedioVendedor = totalVendedor / ingresos[vendedor].length;
            System.out.println("Vendedor " + (vendedor + 1) + ": $" + promedioVendedor);
        }

        
        double totalIngresos = 0;
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
            for (int producto = 0; producto < ingresos[vendedor].length; producto++) {
                totalIngresos += ingresos[vendedor][producto];
            }
        }
        System.out.println("\nIngresos totales de la empresa: $" + totalIngresos);
    }

    
    private static void llenarArreglo(double[][] ingresos) {
        Random random = new Random();
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
            for (int producto = 0; producto < ingresos[vendedor].length; producto++) {
                ingresos[vendedor][producto] = random.nextDouble() * 1000; 
            }
        }
    }
}

