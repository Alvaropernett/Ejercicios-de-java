import java.util.Scanner;
public class Ejercicio110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la temperatura del día:");
        double temperatura = scanner.nextDouble();

        
        String comentario;

        if (temperatura >= 0 && temperatura <= 10) {
            comentario = "Mucho Frío";
        } else if (temperatura >= 11 && temperatura <= 18) {
            comentario = "Frío";
        } else if (temperatura >= 19 && temperatura <= 25) {
            comentario = "Templado";
        } else if (temperatura >= 26 && temperatura <= 40) {
            comentario = "Calor";
        } else {
            comentario = "Temperatura fuera de rango";
        }

        
        System.out.println("Comentario sobre la temperatura del día: " + comentario);

        
        scanner.close();
    }
}

