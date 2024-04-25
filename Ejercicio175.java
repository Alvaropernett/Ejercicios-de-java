import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio175 {
    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();

        
        LocalDate fechaAnterior = fechaActual.minusDays(1);

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaAnteriorFormateada = fechaAnterior.format(formatter);

        
        System.out.println("La fecha del día anterior es: " + fechaAnteriorFormateada);
    }
}

