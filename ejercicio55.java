import java.util.Scanner;

public class ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIng; 

        System.out.println("Ingresa un numero para calcular si es primo (1) o no (0)");
        numIng = sc.nextInt();
        sc.close();

        int numResult = devolverEntero(numIng);

        System.out.println("\n"+numResult);
    }

    public static int devolverEntero(int num){
        int numResult;
        if (num % 2 != 0){
            numResult = 1;
        } else{
            numResult = 0;
        }
        return numResult;
    }
}
