import java.util.Scanner;

public class ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area, perimetro, base, altura;

        System.out.println("Ingresa la base del rectangulo (Metros): ");
        base = sc.nextFloat();
        System.out.println("Ingresa la altura del rectangulo (Metros): ");
        altura = sc.nextFloat();
        sc.close();

        area = base * altura;
        perimetro = base*2 + altura*2;

        System.out.println("El area del rectangulo es "+area +" metros cuadrados");
        System.out.println("El perimetro del rectangulo es "+perimetro +" metros");
        
    }
}

