import java.util.Scanner;
public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int cantidadTotalPersonas = 0;
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        int edadPersonaMasJoven = Integer.MAX_VALUE;

        
        System.out.print("Ingrese la cantidad de personas que asistieron a la fiesta: ");
        cantidadTotalPersonas = scanner.nextInt();

        for (int i = 1; i <= cantidadTotalPersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();

            
            if (edad < 18) {
                System.out.println("Lo siento, no se permiten menores de edad a la fiesta.");
                continue;
            }

            
            if (edad < edadPersonaMasJoven) {
                edadPersonaMasJoven = edad;
            }

            
            System.out.print("Ingrese el sexo de la persona (H para hombre, M para mujer): ");
            char sexo = scanner.next().charAt(0);

            
            if (sexo == 'H' || sexo == 'h') {
                cantidadHombres++;
                sumaEdadesHombres += edad;
            } else if (sexo == 'M' || sexo == 'm') {
                cantidadMujeres++;
                sumaEdadesMujeres += edad;
            } else {
                System.out.println("Sexo no válido. Ingrese 'H' para hombre o 'M' para mujer.");
                i--; 
            }
        }

        
        double promedioEdadesHombres = cantidadHombres > 0 ? (double) sumaEdadesHombres / cantidadHombres : 0;
        double promedioEdadesMujeres = cantidadMujeres > 0 ? (double) sumaEdadesMujeres / cantidadMujeres : 0;

        
        System.out.println("Información sobre la fiesta:");
        System.out.println("Cantidad total de personas: " + cantidadTotalPersonas);
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
        System.out.println("Promedio de edades de hombres: " + promedioEdadesHombres);
        System.out.println("Promedio de edades de mujeres: " + promedioEdadesMujeres);
        System.out.println("Edad de la persona más joven que asistió: " + edadPersonaMasJoven);
    }
}

