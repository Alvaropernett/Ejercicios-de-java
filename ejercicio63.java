import java.util.Scanner;
public class ejercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIngresado;
        int sumaValores=0;
        
        do {
            System.out.println("Ingresa numeros: ");
            numIngresado = sc.nextInt();
            if (numIngresado>0) {
                sumaValores= sumaValores + numIngresado;
            }
        } while (!(numIngresado>20 && numIngresado<30) && numIngresado != 0);
        sc.close();

        System.out.println("La suma de los valores mayores a 0 ingresados son "+sumaValores);
    }
}
