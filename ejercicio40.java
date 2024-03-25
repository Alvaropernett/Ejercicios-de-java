import java.util.Scanner;
public class ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilosdeoro, PrporOnzadeOro, valOroenPesos=0;

        System.out.println("Digite el numero de kilos de oro");
        kilosdeoro= sc.nextDouble();
        System.out.println("Digite el precio por onza de oro");
        PrporOnzadeOro= sc.nextDouble();
        sc.close();

        double onzadeoro= (kilosdeoro * 1000) / 28.3495;

        valOroenPesos= onzadeoro * PrporOnzadeOro;

        System.out.println("El precio en pesos de los kilos de oro ingresados es de: $"+ String.format("%,.2f%n",valOroenPesos));

    }
    
}