import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroIngresado, parteDecimal;
        int parteEntera;

        System.out.println("Ingrese un numero decimal");
        numeroIngresado = sc.nextDouble();
        sc.close();
        
        parteEntera = (int) numeroIngresado;
        parteDecimal = numeroIngresado - parteEntera;

        System.out.println("La parte entera del numero es: "+ parteEntera);
        System.out.println("La parte decimal del numero es: "+ parteDecimal);


    }
}
