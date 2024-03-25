import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variableA,variableB, variableAuxiliar;



        System.out.print("Introduce el valor la variable A: ");
        variableA = sc.nextInt();

        System.out.print("Introduce el valor la variable B: ");
        variableB = sc.nextInt();
        sc.close();

        System.out.println("Los valores Iniciales de la variable A es: "+ variableA + " y el valor inicial de la variable B es : "+ variableB);

        variableAuxiliar = variableA;
        variableA = variableB;
        variableB = variableAuxiliar;

        System.out.println();
        System.out.println("Los valores de las variables intercambiadas son:\nA = " + variableA + " B = " + variableB);
    }
}