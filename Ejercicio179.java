import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese las calificaciones:");
        System.out.print("Matemáticas: ");
        double matematicas = scanner.nextDouble();

        System.out.print("Inglés: ");
        double ingles = scanner.nextDouble();

        System.out.print("Español: ");
        double espanol = scanner.nextDouble();

        
        double promedio = (matematicas + ingles + espanol) / 3;

        
        int materiasAprobadas = 0;
        int materiasReprobadas = 0;

        if (matematicas >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }

        if (ingles >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }

        if (espanol >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }

        
        String materiaMenorCalificacion = "Matemáticas";
        double menorCalificacion = matematicas;

        if (ingles < menorCalificacion) {
            materiaMenorCalificacion = "Inglés";
            menorCalificacion = ingles;
        }

        if (espanol < menorCalificacion) {
            materiaMenorCalificacion = "Español";
        }

       
        System.out.println("\nResultados:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Total de materias aprobadas: " + materiasAprobadas);
        System.out.println("Total de materias reprobadas: " + materiasReprobadas);
        System.out.println("Materia con menor calificación: " + materiaMenorCalificacion + " (" + menorCalificacion + ")");
    }
}

