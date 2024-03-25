import java.util.Scanner;

public class ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double porcentajeDescontado, precioCompra, precioPagado, cantComprada;

        System.out.print("Ingresa la cantidad de la compra:");
        cantComprada = sc.nextDouble();
        System.out.print("Ingresa el precio (Valor) de la compra: ");
        precioCompra = sc.nextDouble();
        System.out.print("Ingresa el Precio Pagado por la compra");
        precioPagado = sc.nextDouble();
        sc.close();

        porcentajeDescontado = ((precioCompra-precioPagado)/precioCompra)*100; 
    
        double precioCompraxUnidad = precioCompra / cantComprada;
        double precioPagadoxUnidad = precioPagado / cantComprada;
        System.out.println("El precio de compra por unidad es: "+ precioCompraxUnidad);
        System.out.println("EL precio pagado por unidad es: "+ precioPagadoxUnidad);
        System.out.println("EL porcentaje descontado es de "+ String.format("%.2f", porcentajeDescontado)+"%");
    }
}
