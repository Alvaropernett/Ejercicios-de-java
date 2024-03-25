import java.util.Scanner;
public class ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double frutaConsumidaKgAnual = 8;
        double frutaConsumidaGr;
        double manzanasComsumidas;
        int edad;

        System.out.println("Ingrese la edad ");
        edad = sc.nextInt();
        sc.close();

        frutaConsumidaGr = (frutaConsumidaKgAnual * edad)*1000;

        manzanasComsumidas = frutaConsumidaGr / 4;

        System.out.println("La persona ha consumido "+ frutaConsumidaGr + 
        " Gramos de fruta durante sus "+ edad + " años de edad");
        System.out.println("La persona ha consumido "+ manzanasComsumidas + 
        " manzanas durante sus "+ edad + " años de edad");


    }
}
