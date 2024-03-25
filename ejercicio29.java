import java.util.Scanner;
public class ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero, numeroAlCubo=0;

        System.out.println("Ingresa un numero para calcular el cubo de dicho numero");
        numero = sc.nextFloat();
        sc.close();

        numeroAlCubo = calcularCubo(numero);

        System.out.println("El numero ingresado "+ numero + " elevado al cubo es igual a "+ numeroAlCubo);
    }

    public static float calcularCubo(float numero){
        float numeroAlCubo = (float) Math.pow(numero, 3);
        return numeroAlCubo;
    }
}
