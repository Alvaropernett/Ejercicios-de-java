import java.util.Scanner;
public class ejercicio34 {
public static void main(String[]args){

Scanner entrada = new Scanner(System.in);

double monto, resto10, resto20, descunto10, descuento20;

System.out.println(" Por compras mayores a 1000 pesos tendra un descuento del 10 % ");
System.out.println(" Por compras mayores a 500 y menores que 1000 pesos tendra un descuento del 20 % \n");
System.out.println(" Por favor ingrese el monto de la compra:");
monto = entrada.nextDouble();

descunto10 = monto * 0.10;
descuento20 = monto * 0.20;
resto10 = monto - (monto * 0.10);
resto20 = monto - (monto * 0.20);

if(monto > 1000){
System.out.println(" El monto inicial de la compra es: " + monto + "\n tiene un descuento del 10 % que es: " + descunto10 + " pesos el valor a pagar aplicado el descuento es: " + resto10 + " pesos");
}if (monto > 500 && monto <= 1000){
System.out.println(" El monto inicial de la compra es: " + monto + "\n tiene un descuento del 20 % que es: " + descuento20 + " pesos el valor a pagar aplicado el descuento es: " + resto20 + " pesos");
}if(monto <= 500){
System.out.println(" El valor final a pagar es: " + monto + " pesos");
}

}
}