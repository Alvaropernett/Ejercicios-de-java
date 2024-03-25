import java.util.Scanner;
public class ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempMedia;
        double sumTemp=0;
        double temperaturas[] = new double[6];
        double tempMayor = temperaturas[0];
        double tempMenor=0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingresa la temperatura (C°) numero "+ (i+1) + " del dia. Hora: "+ (i*4));
            temperaturas[i] = sc.nextDouble();
            sumTemp = sumTemp + temperaturas[i];
            
            if (temperaturas[i] > tempMayor) {
                tempMayor = temperaturas[i];
            }

            tempMenor= temperaturas[0];
            if (temperaturas[i] < tempMenor) {
                tempMenor = temperaturas[i];
            }
        }
        sc.close();

        tempMedia = sumTemp / 6;

        System.out.println("La temperatura media en el dia es de "+tempMedia+ " C°");
        System.out.println("La temperatura mas alta es "+ tempMayor+ " C°");
        System.out.println("La temperatura mas baja es "+ tempMenor + " C°");

    }
}
