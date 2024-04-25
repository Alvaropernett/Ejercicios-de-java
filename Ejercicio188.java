import java.util.Scanner;

public class Ejercicio188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese una dirección de correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        
        if (validarCorreoElectronico(correoElectronico)) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
    }

    
    public static boolean validarCorreoElectronico(String correoElectronico) {
        
        if (correoElectronico.contains("@") && correoElectronico.contains(".")) {
            
            if (correoElectronico.indexOf("@") > 0 && correoElectronico.indexOf("@") < correoElectronico.length() - 1) {
                
                if (correoElectronico.lastIndexOf(".") > correoElectronico.indexOf("@")) {
                    return true;
                }
            }
        }
        return false;
    }
}

