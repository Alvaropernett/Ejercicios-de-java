import java.util.Scanner;
public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la fecha en el formato (día, mes, año):");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Año: ");
        int año = scanner.nextInt();

        
        String estacion = determinarEstacion(dia, mes);

        
        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " pertenece a la estación: " + estacion);
    }

    
    public static String determinarEstacion(int dia, int mes) {
        if ((mes == 3 && dia >= 20) || (mes == 4) || (mes == 5) || (mes == 6 && dia < 21)) {
            return "Primavera";
        } else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia < 23)) {
            return "Verano";
        } else if ((mes == 9 && dia >= 23) || (mes == 10) || (mes == 11) || (mes == 12 && dia < 21)) {
            return "Otoño";
        } else {
            return "Invierno";
        }
    }
}

