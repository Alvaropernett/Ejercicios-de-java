import java.util.Scanner;
public class ejercicio35 {
public static void main(String[]args){

Scanner entrada = new Scanner(System.in);

double horas_trabajadas, tarifa, salario_normal, horas_extras, cantidad_horas_extras, total_horas_extras, salario_final, aumento_tarifa;

System.out.print(" Por favor ingrese la cantidad de horas trabajadas: ");
horas_trabajadas = entrada.nextDouble();

System.out.print(" Por favor ingrese la tarifa por horas trabajadas: ");
tarifa = entrada.nextDouble();

cantidad_horas_extras = horas_trabajadas - 40;

aumento_tarifa =(tarifa * 0.50);

horas_extras = aumento_tarifa + tarifa;

total_horas_extras = horas_extras * cantidad_horas_extras;

salario_normal = (horas_trabajadas-cantidad_horas_extras) * tarifa;

salario_final = salario_normal + total_horas_extras;

if(horas_trabajadas <= 40){
System.out.println("\n Su salario sin horas extras trabajadas es: " + salario_normal);
}if(horas_trabajadas > 40){
System.out.println("\n El salario inicial del docente sin contar las horas extras trabajadas todavia es de: " + salario_normal+ " pesos\n");
System.out.println(" Usted trabajo: " + cantidad_horas_extras + " horas extras y tiene un aumento en la tarifa del 50% para las horas extra.\n");
System.out.println(" el aumento en la tarifa para las horas extras es de: " + aumento_tarifa + " pesos\n");
System.out.println(" La tarifa con el aumento para las horas extras equivale a: " + horas_extras + " pesos\n" );
System.out.println(" Todas las horas extras trabajadas y aplicado el aumento en la tarifa equivalen a: " + total_horas_extras  + " pesos\n");
System.out.println(" El salario final del docente con el total de las horas extras y el salario inicial es de: " + salario_final+"\n");
}

}    
}
