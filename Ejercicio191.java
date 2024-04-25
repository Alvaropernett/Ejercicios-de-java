import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio191 {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

