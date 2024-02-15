import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        double d1,d2,area;
        System.out.println("Ingrese la primera diagonal");
        d1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda diagonal");
        d2 = entrada.nextDouble();
        area = (d1*d2)/2;
        System.out.println("El area del rombo es:"+area);
    }
    
}
