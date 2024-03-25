import java.util.Scanner;
public class ejercicio77 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double capital, interesMensual, interesAnual, cuotaMensual, numAnios, numTotalPagos, totalAPagar;

        System.out.println("Ingresa el capital de la hipoteca");
        System.out.print("- ");
        capital = sc.nextDouble();

        System.out.println("Ingresa la tasa de interes Anual en porcentaje %");
        System.out.print("- ");
        interesAnual = sc.nextDouble();

        System.out.println("Ingresa el numero de años de la hipoteca");
        System.out.print("- ");
        numAnios = sc.nextDouble();
        sc.close();

        interesMensual = interesAnual / 100 / 12;
        numTotalPagos = numAnios * 12;

        cuotaMensual = calcularCuotaMensual(capital, interesMensual, numTotalPagos);
        totalAPagar = cuotaMensual * numTotalPagos;

        System.out.println();
        System.out.println("La cuota mensual de la hipoteca seria aproximadamente de "+String.format("%.2f", cuotaMensual));
        System.out.println("El total a pagar de la hipoteca es de aproximadamente de "+String.format("%.2f", totalAPagar));


    }

    public static double calcularCuotaMensual(double capital, double interesMensual, double numTotalPagos){
        double denominador;
        double numerador;
        numerador = interesMensual * capital;
        denominador = 1 - Math.pow((1+interesMensual), -numTotalPagos);
        return numerador/denominador;    
    }
}
