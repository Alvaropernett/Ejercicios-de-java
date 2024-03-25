import java.util.Scanner;
public class ejercicio32 {
public static void main(String[]args){

Scanner entrada = new Scanner(System.in);

double base, altura, area_metros, area_centimetros, area_milimetros;

System.out.println(" Por favor ingrese la base en metros del rectangulo: ");
base = entrada.nextDouble();

System.out.println(" Por favor ingrese la altura en metros del rectangulo: ");
altura = entrada.nextDouble();


area_metros = base * altura;

area_centimetros = (area_metros * 10000);

area_milimetros = (area_centimetros * 100);

System.out.println(" Area del rectangulo: ");
System.out.println(" El area del rectangulo en metros es: " + area_metros + " M^2");
System.out.println(" El area del rectangulo en centimetros es: " + area_centimetros + " Cm^2");
System.out.println(" El area del rectangulo en milimetros es: " + area_milimetros + " mm^2");

}  
}
    
