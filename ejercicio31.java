
import java.util.Scanner;
public class ejercicio31 {
public static void main(String[]args){

Scanner entrada = new Scanner(System.in);

double base_milimetros, altura_milimetros, area_milimetros, area_centimetros, area_metros;

System.out.println(" Por favor ingrese la base en milimetros del triangulo: ");
base_milimetros = entrada.nextDouble();

System.out.println(" Por favor ingrese la altura en milimetros del triangulo: ");
altura_milimetros = entrada.nextDouble();

area_milimetros = (base_milimetros*altura_milimetros)/2;


area_centimetros = ((base_milimetros*altura_milimetros)/2) * 0.1;

area_metros = ((base_milimetros*altura_milimetros)/2) * 0.001;

System.out.println(" EL area del triangulo es:");
System.out.println(" El area del triangulo en milimetros es: " + area_milimetros + " mm^2");
System.out.println(" El area del triangulo en centimetros es: " + area_centimetros + " cm^2");
System.out.println(" El area del triangulo en metros es: " + area_metros + " metros^2 ");
 
}
}
