import java.util.Scanner;

public class ejercicio75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int añoIngr;
        
        do {
            System.out.println("Ingresa un año");
            añoIngr = sc.nextInt();
        } while (añoIngr < 400);
        sc.close();

        if (añoIngr % 4 == 0 && añoIngr % 100 !=0) {
            System.out.println("El año de "+ añoIngr + " es bisiesto");
        } else if (añoIngr % 4 == 0 && añoIngr % 100 == 0 && añoIngr % 400 ==0) {
            System.out.println("El año de "+ añoIngr + " es bisiesto");
        } else {
            System.out.println("El año de "+ añoIngr + " no es bisiesto");
        }
    }
}
