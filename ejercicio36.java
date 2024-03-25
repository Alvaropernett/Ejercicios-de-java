import java.util.Scanner;
public class ejercicio36 {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

int tarifa = 1500;
int cantidad_minutos = 0, cantidad_horas = 0; 
int valor_minutos = 0, valor_horas = 0;
String fraccion;

System.out.println("Por favor ingrese el tipo de fracción de tiempo ya sea (minutos || horas): ");
fraccion = entrada.nextLine();

if (fraccion.equals("minutos")) {
System.out.println("Por favor ingrese la cantidad de minutos:");
cantidad_minutos = entrada.nextInt();

} else {
System.out.println("Por favor ingrese la cantidad de horas:");
cantidad_horas = entrada.nextInt();
}

valor_minutos = (int) ((double) cantidad_minutos / 60 * tarifa);
valor_horas = cantidad_horas * tarifa;

if (fraccion.equals("minutos")) {
System.out.println("La cantidad de minutos transcurridos es: " + cantidad_minutos + " y el valor a pagar es: " + valor_minutos + " pesos");

} else {
System.out.println("La cantidad de horas transcurridas es: " + cantidad_horas + " y el valor a pagar es: " + valor_horas + " pesos");
}
}
}
