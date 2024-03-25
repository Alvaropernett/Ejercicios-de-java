
    import java.util.Scanner;

    public class ejercicio30 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double kilometro,convertir;
        System.out.print("Ingrese la distancia en kilómetro: ");
        kilometro = entrada.nextDouble();
        
        convertir = kilometro * 1000;
        
        System.out.println(convertir + " metros ");
    }
 }
  
