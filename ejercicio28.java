import java.util.Scanner;
public class ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;

        System.out.println("Ingresa un numero");
        for (numero=sc.nextInt(); numero >= 0; numero--) { 
            sc.close();
            if(numero > 0){
                System.out.print(numero+ ", ");
            } else {
                System.out.println(numero+ ".");
            }
        }
       
    }
}
