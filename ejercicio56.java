import java.util.Scanner;

public class ejercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempoExpEnSeg, horas, minutos, segundos; 
        String tiempoHrMinSeg;

        System.out.println("Ingresa un tiempo espresados en segundos");
        tiempoExpEnSeg = sc.nextInt();
        sc.close();

        segundos = tiempoExpEnSeg % 60;
        minutos = tiempoExpEnSeg / 60;
        horas = minutos / 60;
        minutos = minutos % 60;
        

        tiempoHrMinSeg = horas +" Horas, "+ minutos + " Minutos y "+segundos+" Segundos";

        System.out.println("\nEL tiempo ingresado en segundos equivale a:");
        System.out.println(tiempoHrMinSeg);


    }
}
