import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldoingresado, montoPorHExtra, sueldoBasico, descuento, totalGanado;

        System.out.println("Ingrese el sueldo basico del empleado");
        sueldoingresado = sc.nextDouble();
        System.out.println("Ingrese el monto ganado por horas extra: ");
        montoPorHExtra = sc.nextDouble();
        sc.close();


        sueldoBasico = sueldoingresado + montoPorHExtra;
        descuento = (sueldoBasico * 20)/100;
        totalGanado = sueldoBasico - descuento;

        System.out.println("##########################");
        System.out.println("Sueldo Basico: $"+ sueldoBasico);
        System.out.println("Total descuento (20%) : $"+descuento);
        System.out.println("Total Ganado: $"+ totalGanado);
        System.out.println("##########################");


    }
}
