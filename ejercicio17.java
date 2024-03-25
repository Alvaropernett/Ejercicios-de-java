import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Ingrese dos numero: ");
        System.out.print("- ");
        numero1 = sc.nextInt();
        System.out.print("- ");
        numero2 = sc.nextInt();  
        sc.close();
        
        if (numero1 > numero2) {
            System.out.println("El numero "+ numero1 + " es mayor que el numero "+ numero2);
        }
        else if (numero2 > numero1) {
            System.out.println("El numero "+ numero2 + " es mayor que el numero "+ numero1);
        }
        else {
            System.out.println("Los numero son iguales");
        }
    }
}
