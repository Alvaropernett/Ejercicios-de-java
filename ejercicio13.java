import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Digite el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("Digite el tercer numero");
        num3 = entrada.nextInt();
        int ultimodigito1 = num1 % 10;
        int ultimodigito2 = num2 % 10;
        int ultimodigito3 = num3 % 10;
    System.out.println("el ultimo digito del primer numero es:"+ultimodigito1);
        System.out.println("el ultimo digito del segundo numero es:"+ultimodigito2);
        System.out.println("el ultimo digito del tercer umero es:"+ultimodigito3);
    }
}
