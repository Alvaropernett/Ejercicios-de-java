import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio197 {
    public static void main(String[] args) {
        String nombreArchivo = "estado_cuenta.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

