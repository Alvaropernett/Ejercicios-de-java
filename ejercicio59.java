import java.util.Scanner;

public class ejercicio59 {
    public static void main(String []abc){
        Scanner sc = new Scanner(System.in);
        int numIngresado; 

        do {
            System.out.println("Ingresa un numero del 1 al 10");
            numIngresado = sc.nextInt(); 
        } while (numIngresado <= 0 || numIngresado > 10);
        sc.close();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numIngresado+ " X "+ i + " = "+ (numIngresado*i));
        }
    }
}
