import java.util.Scanner;

public class ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntero;
        double numeroReal;

        System.out.println("Ingresa un número real y devuelvera un número entero con el\r\n" + //
                        "valor:-1 si el número es negativo, 1 si el número es positivo o 0 si es cero.");
        numeroReal = sc.nextDouble();
        sc.close();

        numeroEntero = calcularEntero(numeroReal);
        System.out.println("\nEl numero entero devuelto es : "+ numeroEntero );


    }

    public static int calcularEntero(Double numReal){

        int numeroResult;
        if (numReal <0) {
            numeroResult = -1;
        } else if (numReal > 0) {
            numeroResult = 1;
        } else {
            numeroResult = 0;
        }

        return numeroResult;

    }
}
