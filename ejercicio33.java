import java.util.Scanner;
public class ejercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int contadorMayor700 = 0;
        double sumaSalarios = 0;
        int totalMujeres = 0;
        int totalEmpleados = 0;
        double promedioSalarios, porcentaje_mujeres, porcentaje_hombres, salario;
        
        System.out.print("Ingrese el número de empleados: ");
        int empleados = entrada.nextInt();
        
        for (int i = 0; i < empleados; i++) {
            System.out.print("Ingrese el sexo del empleado (M para masculino, F para femenino): ");
            char sexo = entrada.next().charAt(0);

            System.out.print("Ingrese el salario del empleado: ");
            salario = entrada.nextDouble();
            
            if (salario > 700) {
                contadorMayor700++;
            }
            sumaSalarios += salario;
            
            if (sexo == 'F' || sexo == 'f') {
                totalMujeres++;
            }
            totalEmpleados++;
        }
        promedioSalarios = sumaSalarios / totalEmpleados;
        porcentaje_mujeres = ((double)totalMujeres / totalEmpleados) * 100;
        porcentaje_hombres = 100 - porcentaje_mujeres;

        System.out.println("La suma de los salarios de todos los empleados es: " + sumaSalarios);
        System.out.println("Cantidad de personas que ganan más de 700 al mes: " + contadorMayor700 + " empleados");
        System.out.println("Promedio de salarios: " + promedioSalarios);
        System.out.println("Porcentaje de mujeres que trabajan en la empresa: " + porcentaje_mujeres + "%");
        System.out.println("Porcentaje de varones que trabajan en la empresa: " + porcentaje_hombres + "%");
        
    }
}
