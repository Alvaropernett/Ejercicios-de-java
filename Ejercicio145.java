import java.util.Scanner;
public class Ejercicio145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la longitud de los tres lados del triángulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        
        if (esTriangulo(lado1, lado2, lado3)) {
            
            String tipo = tipoTriangulo(lado1, lado2, lado3);
            System.out.println("Los lados forman un triángulo " + tipo + ".");
        } else {
            
            System.out.println("Los lados no forman un triángulo.");
        }
    }

    
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1);
    }

    
    public static String tipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}

