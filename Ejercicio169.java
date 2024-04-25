import java.util.Scanner;
import java.time.LocalDate;

public class Ejercicio169 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int añoActual = LocalDate.now().getYear();

        
        System.out.print("Ingrese su año de nacimiento (entre 1922 y " + añoActual + "): ");
        int añoNacimiento = scanner.nextInt();

        
        int edad = añoActual - añoNacimiento;

        
        String etapa = "";
        if (edad >= 1 && edad <= 12) {
            etapa = "niñez (1-12 años)";
        } else if (edad >= 13 && edad <= 18) {
            etapa = "adolescencia (13-18 años)";
        } else if (edad >= 19 && edad <= 30) {
            etapa = "juventud (19-30 años)";
        } else if (edad >= 31 && edad <= 60) {
            etapa = "adultez (31-60 años)";
        } else if (edad > 60 && edad <= 100) {
            etapa = "vejez (mayor de 60 años)";
        } else {
            etapa = "No es una edad válida (entre 1 y 100 años).";
        }

        
        System.out.println("Según su año de nacimiento, usted está en la etapa de " + etapa);
    }
}

