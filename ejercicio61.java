import java.util.Scanner;
public class ejercicio61 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIngresado;
        int n=10;
        double [] numerosMayores0 = new double[n];
        int c=0, contadorValores=0;
        double sumadeLosCuadrados=0;

        do {
            System.out.print("Ingreso de numeros: ");
            numIngresado = sc.nextInt();
            if (numIngresado>0) {
                numerosMayores0[c] = Math.pow(numIngresado, 2);
                sumadeLosCuadrados = sumadeLosCuadrados + numerosMayores0[c++];
                contadorValores++;
            }  
        } while (contadorValores<10);
        sc.close();

        System.out.println("La suma de los cuadrados de los 10 enteros mayores que 0 leidos son: "+ sumadeLosCuadrados);
    }
}
