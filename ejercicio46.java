import java.util.Scanner;

public class ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaMillas, distanciaMetros;
        
        System.out.println("Ingresa la distancia en Millas");
        distanciaMillas = sc.nextDouble();
        sc.close();

        distanciaMetros = distanciaMillas * 1852;
        System.out.println("La distancia ingresada  de "+ distanciaMillas +" millas Equivale a " + distanciaMetros +" Metros");
    }
}
