import java.util.Scanner;

public class ejercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0, y, resultado=0;
        int z=1;

        do {
            System.out.println("Ingresa los valores de X (Base) y Y (Exponente)");
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
        } while (x < 0|| y < 0);
        sc.close();
    
        if (y==2) {
            resultado= x*x;
        } else {
            resultado= x*x;
            do {
                resultado= resultado * x;
                z++;
            } while (z<=(y-2));
        }
        

        System.out.println(resultado);
    }
}
