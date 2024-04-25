import java.util.Scanner;
public class Ejercicio147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] calificaciones = new int[5][3]; 

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextInt();
            }
        }

        
        int aprobadosTodos = 0;
        for (int i = 0; i < 5; i++) {
            if (aproboTodos(calificaciones[i])) {
                aprobadosTodos++;
            }
        }

        
        int aprobadosAlMenosUno = 0;
        for (int i = 0; i < 5; i++) {
            if (aproboAlMenosUno(calificaciones[i])) {
                aprobadosAlMenosUno++;
            }
        }

        
        int aprobadosUltimo = 0;
        for (int i = 0; i < 5; i++) {
            if (aproboUltimo(calificaciones[i])) {
                aprobadosUltimo++;
            }
        }

        
        System.out.println("a) Alumnos que aprobaron todos los exámenes: " + aprobadosTodos);
        System.out.println("b) Alumnos que aprobaron al menos un examen: " + aprobadosAlMenosUno);
        System.out.println("c) Alumnos que aprobaron únicamente el último examen: " + aprobadosUltimo);
    }

    
    public static boolean aproboTodos(int[] calificaciones) {
        for (int calificacion : calificaciones) {
            if (calificacion < 6) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean aproboAlMenosUno(int[] calificaciones) {
        for (int calificacion : calificaciones) {
            if (calificacion >= 6) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean aproboUltimo(int[] calificaciones) {
        return calificaciones[0] < 6 && calificaciones[1] < 6 && calificaciones[2] >= 6;
    }
}

