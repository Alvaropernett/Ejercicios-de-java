import java.util.Scanner;
public class Ejercicio178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();

        
        double costoTotal = 0;
        if (duracionLlamada <= 3) {
            costoTotal = 3.00;
        } else if (duracionLlamada <= 7) {
            costoTotal = 3.00 + (duracionLlamada - 3) * 1.5;
        } else {
            costoTotal = 3.00 + 4 * 1.5 + (duracionLlamada - 7) * 3.0;
        }

       
        System.out.println("El costo de la llamada es: $" + costoTotal);
    }
}

