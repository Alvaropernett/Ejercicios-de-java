public import java.util.Scanner;
public class Ejercicio105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Ingrese la cuarta nota:");
        double nota4 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3 + nota4) / 4.0;

        String calificacion;

        if (promedio > 14.5) {
            calificacion = "APROBADO";
        } else if (promedio > 10) {
            calificacion = "SUPLETORIO";
        } else {
            calificacion = "PERDIDO EL AÑO";
        }
        
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("Calificación: " + calificacion);

        scanner.close();
    }
} {
    
}
