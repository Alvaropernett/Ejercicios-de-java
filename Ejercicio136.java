import java.time.LocalTime;
public class Ejercicio136 {
    public static void main(String[] args) {
        
        while (true) {
            
            LocalTime horaActual = LocalTime.now();

            
            int horas = horaActual.getHour();
            int minutos = horaActual.getMinute();
            int segundos = horaActual.getSecond();

            
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}

