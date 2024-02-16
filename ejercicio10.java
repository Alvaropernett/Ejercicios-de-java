import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base,altura,area;
        System.out.println("Digite la base del triangulo");
        base = entrada.nextInt();
        System.out.println("Digite la altura");
        altura = entrada.nextInt();
        area = (base * altura )/2;
        System.out.println("El area del triangulo es:"+" "+area);        
    }
}
