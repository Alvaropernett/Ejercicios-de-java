import java.util.Scanner;
public class Ejercicio160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el tiempo en segundos: ");
        int segundos = scanner.nextInt();

        
        int dias = segundos / (24 * 3600);
        segundos = segundos % (24 * 3600);
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;

        
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}

