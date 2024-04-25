import java.util.Scanner;
public class Ejercicio128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un año (en formato de 4 dígitos): ");
        int year = scanner.nextInt();

        
        boolean esBisiesto = determinarBisiesto(year);

        
        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    
    public static boolean determinarBisiesto(int year) {
       
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

