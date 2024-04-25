import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el periodo en formato MM AAAA (por ejemplo, 10 2021): ");
        String entrada = scanner.nextLine();

        
        String[] partes = entrada.split(" ");
        int mes = Integer.parseInt(partes[0]);
        int año = Integer.parseInt(partes[1]);

        
        if (mes < 1 || mes > 12 || año < 0) {
            System.out.println("Entrada no válida. Por favor, ingrese un mes válido (1-12) y un año válido (mayor o igual a 0).");
            return;
        }

        
        LocalDate fecha = LocalDate.of(año, mes, 1);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy");
        System.out.println("Meses anteriores al periodo ingresado:");
        for (int i = 0; i < 12; i++) {
            fecha = fecha.minusMonths(1); // Restar un mes
            System.out.println(formatter.format(fecha));
        }
    }
}

