import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, genero;

        System.out.println("Ingresa tu genero (Hombre/Mujer):");
        genero = sc.nextLine();
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        sc.close();

        if (genero.equalsIgnoreCase("hombre")){
            System.out.println("Bienvenido "+ nombre);
        } else if (genero.equalsIgnoreCase("mujer")) {
            System.out.println("Bienvenida "+ nombre);
        } else {
            System.out.println("Hola Indeciso");
        }

    }
}
