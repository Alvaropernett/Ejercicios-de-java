import java.util.Scanner;

public class ejercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIngresado, sumDigitos;
        System.out.print("Ingresa un numero cualquiera: ");
        numIngresado = sc.nextInt();
        sc.close();

        sumDigitos = calcularSumaDigitos(numIngresado);
        System.out.println("La suma de los digitos es igual a "+sumDigitos);
        
    }

    public static int calcularSumaDigitos(int num){
        String numero;
        int numDigitos;
        int sumadelosdigitos=0;
        numero = String.valueOf(num);
        char [] digitos = numero.toCharArray();
        numDigitos = (int)(Math. log10(num)+1);
        int digits[] = new int[numDigitos];
        

        for (int i = 0; i < digitos.length; i++) {
            digits[i] = Character.getNumericValue(digitos[i]);
        }

        for (int i = 0; i < digits.length; i++) {
            sumadelosdigitos = sumadelosdigitos + digits[i];
        }

        return sumadelosdigitos;
    }
}
