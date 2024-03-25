import java.util.Scanner;
public class ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaFactoriales=0, factorial=1, n, a=1;
        int c=0;

        System.out.print("Ingresa un numero: ");
        n = sc.nextInt();
        sc.close();

        int factoriales[]= new int[n];

        do {
            factorial = factorial * a;
            factoriales[c] = factorial;
            c++;
            a++;
        } while (c<n);

        for (int i = 0; i < factoriales.length; i++) {
            sumaFactoriales = sumaFactoriales +  factoriales[i];
        }

        for (int i = 0; i < factoriales.length; i++) {
            System.out.println(i+1+"! = "+factoriales[i]);
        }

        System.out.println("\nLa suma de los factoriales 1+2+3!+...+n! es de: "+ sumaFactoriales);
    }
}
