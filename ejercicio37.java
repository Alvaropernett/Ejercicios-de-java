import java.util.Scanner;
public class ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double tarifaEstacionamiento= 15;
        double horasEstacionadas, minEstacionados,  pago;

        System.out.println("Ingresa el numero de horas y minutos estacionado el vehiculo");
        System.out.print("Hora: ");
        horasEstacionadas= sc.nextInt();
        do {
            System.out.print("Minutos: ");
            minEstacionados = sc.nextDouble();
            
        } while (minEstacionados >= 60);
        sc.close();

        if (minEstacionados <= 10) {
            pago = horasEstacionadas * tarifaEstacionamiento;
            System.out.println("\nHoras cobradas: "+horasEstacionadas);
            System.out.println("El total de pago por el estacionamiento de "
            + horasEstacionadas + " horas " + "y "+ minEstacionados +" minutos es de: $"+pago);
        } else {
            horasEstacionadas = horasEstacionadas + 1;
            System.out.println("\nHoras cobradas: "+horasEstacionadas);
            pago = horasEstacionadas*tarifaEstacionamiento;
            System.out.println("El total de pago por el estacionamiento de "
            + horasEstacionadas + " horas es de: $"+pago);
        }
    }
}