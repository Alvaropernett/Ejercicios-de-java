import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio176 {
    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();

        
        LocalDate fechaSiguiente = fechaActual.plusDays(1);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaSiguienteFormateada = fechaSiguiente.format(formatter);

        
        System.out.println("La fecha del día siguiente es: " + fechaSiguienteFormateada);
    }
}

