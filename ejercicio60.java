import java.util.Scanner;

public class ejercicio60 {
    public static void main(String []abc){
        Scanner sc = new Scanner(System.in);
        int numIngresado, contadorValores=0;

        do {
            System.out.print("Ingreso de numeros: ");
            numIngresado = sc.nextInt();
            if (numIngresado>0) {
                contadorValores++;
            }
        } while (numIngresado != 0);
        sc.close();

        System.out.println("El numero de valores mayores que 0 son "+ contadorValores);
        

    }

}
