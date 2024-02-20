import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("DIgita tu edad:");
        edad = entrada.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
   }
}