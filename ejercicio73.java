import java.util.Scanner;
public class ejercicio73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo, descuento=0, sueldoNeto=0;

        do {
            System.out.println("ingresa el sueldo");
            sueldo = sc.nextInt();
        } while (sueldo <= 0);
        sc.close();

        if (sueldo <=1000) {
            descuento =sueldo *0.10;
            sueldoNeto = sueldo-descuento;
        } else if (sueldo>1000 && sueldo<=2000) {
            descuento =sueldo *0.05;
            sueldoNeto = sueldo-descuento;
        }else if (sueldo>2000) {
            descuento =sueldo *0.03;
            sueldoNeto = sueldo-descuento;
        }
        
        System.out.println("El descuento que se le realiza al sueldo de "+ sueldo + " es de "+descuento);
        System.out.println("El sueldo neto del trabajador es de "+sueldoNeto);
        


        
    }
}
