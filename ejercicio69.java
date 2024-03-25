public class ejercicio69 {
    public static void main(String[] args) {
        int sumaValoresdeVeinte=0;

        for (int i = 1; i < 10; i++) {
            sumaValoresdeVeinte = sumaValoresdeVeinte + 20+i;
            System.out.print(20+i + "+ ");
        }

        System.out.println("\nSuma de valores es igual: "+sumaValoresdeVeinte);
    }
}