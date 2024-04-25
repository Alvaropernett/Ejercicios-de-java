import java.util.Scanner;
public class Ejercicio182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero menor o igual a 1000: ");
        int numero = scanner.nextInt();

        
        if (numero < 1 || numero > 1000) {
            System.out.println("El número debe ser mayor que 0 y menor o igual a 1000.");
            return;
        }

        
        String numeroRomano = convertirANumeroRomano(numero);

        
        System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
    }

    public static String convertirANumeroRomano(int numero) {
        
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        
        StringBuilder numeroRomano = new StringBuilder();
        int indice = 0;
        while (numero > 0) {
            
            while (numero >= valores[indice]) {
                numero -= valores[indice];
                numeroRomano.append(simbolos[indice]);
            }
            indice++;
        }
        return numeroRomano.toString();
    }
}

