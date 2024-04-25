public class Ejercicio115 {
    public static void main(String[] args) {
        
        int sumaPares = 0;

        
        for (int i = 1; i <= 1000; i++) {
            
            if (i % 2 == 0) {
                
                sumaPares += i;
            }
        }

        
        System.out.println("La suma de los números pares entre 1 y 1000 es: " + sumaPares);
    }
}

