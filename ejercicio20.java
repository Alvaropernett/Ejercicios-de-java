
    import java.util.Scanner;
    public class ejercicio20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double notas[] = new Double[5];
        Double sumaNotas, promedioNotas;

        System.out.println("Introduce 5 notas: ");
        System.out.print("- ");
        notas[0] = sc.nextDouble();
        System.out.print("- ");
        notas[1] = sc.nextDouble();        
        System.out.print("- "); 
        notas[2] = sc.nextDouble();
        System.out.print("- "); 
        notas[3] = sc.nextDouble();
        System.out.print("- "); 
        notas[4] = sc.nextDouble();
        sc.close();

        sumaNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        promedioNotas = sumaNotas / 5;

        System.out.println("La suma de las notas ingresadas es " + sumaNotas);
        System.out.println("El promedio de las notas ingresadas es " + promedioNotas);
        System.out.print("El doble de las notas ingresadas son las siguientes: ");
        for(int i = 0; i < 5; i++){
            if (i < 4) {
                System.out.print(notas[i]*2+", ");
            } else if (i==4) {
                System.out.print(notas[i]*2+".");
            }
        }
    }
}


