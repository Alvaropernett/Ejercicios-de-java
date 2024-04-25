public class Ejercicio116 {
    public static void main(String[] args) {
        
        int sumaPares = 0;
        
        int productoNones = 1;

        
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        
        for (int j = 1; j <= 50; j++) {
            if (j % 2 != 0) {
                productoNones *= j;
            }
        }

        
        System.out.println("La suma de los números pares entre 1 y 1000 es: " + sumaPares);
        System.out.println("El producto de los números impares entre 1 y 50 es: " + productoNones);
    }
}

