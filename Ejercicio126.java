import java.util.Scanner;
public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la fecha en formato 'AAAA MM DD': ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                          "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String nombreMes = meses[month];

        System.out.println(day + " " + nombreMes + " de " + year);
    }
}

