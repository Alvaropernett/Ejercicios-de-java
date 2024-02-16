import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int area,base,altura;

        System.out.println("ingrese la base del rectangulo:");
        base = entrada.nextInt();
        System.out.println("ingres la altura del rectangulo:");
        altura = entrada.nextInt();
        area = base *altura;
    System.out.println("el area del rectangulo es:" +base+" "+altura + area);

}
}