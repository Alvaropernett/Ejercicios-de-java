import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area,radio;
        System.out.println("Ingrese el radio del circulo");
        radio = entrada.nextDouble();
        area = 3.1416 * ( radio * radio);
        System.out.println("el area del circulo es:"+area+"cm2");
}
}
