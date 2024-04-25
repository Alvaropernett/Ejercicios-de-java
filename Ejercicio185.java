import java.util.Scanner;
public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese los datos para generar la CURP:");
        System.out.print("Primer apellido: ");
        String primerApellido = scanner.next().toUpperCase();
        System.out.print("Segundo apellido: ");
        String segundoApellido = scanner.next().toUpperCase();
        System.out.print("Nombre(s): ");
        String nombre = scanner.next().toUpperCase();
        System.out.print("Fecha de nacimiento (en formato AAAA-MM-DD): ");
        String fecha = scanner.next();
        System.out.print("Sexo (F/M): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        System.out.print("Entidad de nacimiento (2 letras o NE para Nacido Extranjero): ");
        String entidad = scanner.next().toUpperCase();

        
        String curp = generarCURP(primerApellido, segundoApellido, nombre, fecha, sexo, entidad);

        
        System.out.println("CURP generada: " + curp);
    }

    public static String generarCURP(String primerApellido, String segundoApellido, String nombre, String fecha, char sexo, String entidad) {
        StringBuilder curp = new StringBuilder();

        
        curp.append(primerApellido.charAt(0));

        
        curp.append(nombre.charAt(0));

        
        String[] partesFecha = fecha.split("-");
        curp.append(partesFecha[2].substring(2));
        curp.append(partesFecha[1]);
        curp.append(partesFecha[0].substring(2));

        
        curp.append(sexo);

        
        curp.append(entidad);

       
        curp.append(obtenerConsonanteInterna(primerApellido));

        
        curp.append(obtenerConsonanteInterna(segundoApellido));

        
        curp.append(obtenerConsonanteInterna(nombre));

        
        curp.append(calcularDigitoVerificador(fecha));

        
        curp.append("XXX");

        return curp.toString();
    }

    public static char obtenerConsonanteInterna(String palabra) {
        
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!esVocal(letra)) {
                return letra;
            }
        }
        
        return 'X';
    }

    public static boolean esVocal(char letra) {
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }

    public static char calcularDigitoVerificador(String fecha) {
        
        String[] partesFecha = fecha.split("-");
        int anio = Integer.parseInt(partesFecha[0]);

        
        if (anio >= 2000) {
            
            return (char) ('A' + ((anio - 2000) % 26));
        } else {
            
            return Character.forDigit((anio % 100), 10);
        }
    }
}

