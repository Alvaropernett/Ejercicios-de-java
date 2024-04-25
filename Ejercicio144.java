public class Ejercicio144 {
    public static void main(String[] args) {
        int sumaPares = 0;
        long multiplicacionImpares = 1; 

        
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                
                sumaPares += i;
            } else {
                
                multiplicacionImpares *= i;
            }
        }

        
        System.out.println("La suma de los números pares del 1 al 100 es: " + sumaPares);
        System.out.println("La multiplicación de los números impares del 1 al 100 es: " + multiplicacionImpares);
    }
}

