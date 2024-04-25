public class Ejercicio200 {
    public static void main(String[] args) {
        double capitalInicial = 1000; 
        double tasaInteresMensual = 0.015; 
        int numeroMeses = 2; 

        
        double montoFinal = calcularMontoFinal(capitalInicial, tasaInteresMensual, numeroMeses);

        
        System.out.println("El monto final después de " + numeroMeses + " meses es: $" + montoFinal);
    }

    public static double calcularMontoFinal(double capitalInicial, double tasaInteresMensual, int numeroMeses) {
        
        double montoFinal = capitalInicial * Math.pow(1 + tasaInteresMensual, numeroMeses);
        return montoFinal;
    }
}

