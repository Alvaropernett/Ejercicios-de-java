import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,media;
        System.out.println("Ingrese el primer valor");
        a = entrada.nextDouble();
        System.out.println("Ingrese el segundo valor");
        b = entrada.nextDouble();
        System.out.println("Infgrese el tercer valor");
        c = entrada.nextDouble();
        media = (a*b*c)/3;
        System.out.println("la media es de :"+ a +" " + b +" "+ c + media);

    }
}
