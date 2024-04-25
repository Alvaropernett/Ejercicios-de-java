import java.util.Scanner;
public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        do {
            System.out.println("Ingrese la edad (entre 1 y 100 años):");
            edad = scanner.nextInt();

            
            if (edad < 1 || edad > 100) {
                System.out.println("Error: La edad debe estar entre 1 y 100 años.");
            }
        } while (edad < 1 || edad > 100); 

        
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }

        
        scanner.close();
    }
}

