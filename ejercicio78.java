import java.util.Scanner;

public class ejercicio78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monto, descuento;

        System.out.println("Ingrese el monto para calcular su descuento: ");
        monto = sc.nextDouble();
        sc.close();

        if (monto > 10000 ) {
            descuento = monto * 0.20;
            System.out.println("El descuento del 20% del monto de "+monto + " es de "+ descuento);
        } else if (monto < 10000){
            descuento = monto * 0.10;
            System.out.println("El descuento del 10% del monto de "+monto + " es de "+ descuento);
        } else {
            descuento = 0;
            System.out.println("El descuento del del monto de "+monto + " es de "+ descuento);
        }

        
    }
}
