public class ejercicio44 {
    public static void main(String[] args) {
        double numeroPI = 3.1416;
        double potencias [] = new double[9];
        double raicesCuadradas [] = new double[9];
        
        for (int i = 0; i < potencias.length; i++) {
            potencias[i] = calcularPotencias(numeroPI, i+2);
            raicesCuadradas[i] = Math.sqrt(potencias[i]); 
        }

        for (int j = 0 ; j < potencias.length; j++) {
            System.out.println("La potencia "+ (j+2) + " Del numero PI; "+ numeroPI + " es "+potencias[j]+ " y su respectiva raiz es: "+ raicesCuadradas[j]);
        }
    }

    public static double calcularPotencias(double numero, double exponente ){
        return Math.pow(numero, exponente);
    }
}
