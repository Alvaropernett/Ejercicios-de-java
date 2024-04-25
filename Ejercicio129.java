import java.util.Scanner;
public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();
        System.out.print("Ingrese el año (en formato de 4 dígitos): ");
        int año = scanner.nextInt();

        
        int numDias = obtenerDiasPorMes(numeroMes, año);

        
        System.out.println("El mes " + numeroMes + " del año " + año + " tiene " + numDias + " días.");
    }

    
    public static int obtenerDiasPorMes(int numeroMes, int año) {
        switch (numeroMes) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                return 31;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                return 30;
            case 2: 
                return esBisiesto(año) ? 29 : 28; 
            default:
                return -1; 
        }
    }

    
    public static boolean esBisiesto(int año) {
        
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}

