import java.util.*;

public class ejercicio23 {
    //Juego Rojo-amarillo-verde
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int digito1, digito2, digito3;
        int contadorIntentos=0;
        boolean juegoTerminado=false;
        ArrayList<String> intentos = new ArrayList<>();
        String colorPos1="ROJO    ", colorPos2="ROJO    ", colorPos3="ROJO    ";
        int digitoAleatorio1;
        int digitoAleatorio2;
        int digitoAleatorio3;

        do {
            digitoAleatorio1 = aleatorio.nextInt(10);
            digitoAleatorio2 = aleatorio.nextInt(10);
            digitoAleatorio3 = aleatorio.nextInt(10);
            if (digitoAleatorio1 != digitoAleatorio2 && digitoAleatorio1 != digitoAleatorio3 && digitoAleatorio2 != digitoAleatorio3) {
                break;
            }
        } while (true);
        

        do {
            
            System.out.println("\nProporciona por favor tres digitos para cada posicion (1,2,3)");
            do {
                System.out.println("Posicion 1:  ");
                digito1=sc.nextInt();
            } while (digito1 < 0 || digito1 >= 10);
            
            do {
                System.out.println("Posicion 2:");
                digito2=sc.nextInt();
            } while (digito2 < 0 || digito2 >= 10);
            
            do {
                System.out.println("Posicion 3:");
                digito3=sc.nextInt(); 
            } while (digito3 < 0 || digito3 >= 10);
            

            
            if (digito1==digitoAleatorio1) {
                colorPos1="VERDE   ";
            } else if (digito1 == digitoAleatorio2 || digito1 == digitoAleatorio3) {
                colorPos1 = "AMARILLO";
            } else {
                colorPos1 = "ROJO    ";
            }

            if (digito2==digitoAleatorio2) {
                colorPos2="VERDE   ";
            } else if (digito2 == digitoAleatorio1 || digito2 == digitoAleatorio3) {
                colorPos2 = "AMARILLO";
            } else {
                colorPos2 = "ROJO   ";
            }

            if (digito3==digitoAleatorio3) {
                colorPos3="VERDE   ";
            } else if (digito3 == digitoAleatorio2 || digito3 == digitoAleatorio1) {
                colorPos3 = "AMARILLO";
            } else {
                colorPos3 = "ROJO    ";
            }

            if (colorPos1=="VERDE   " && colorPos2 =="VERDE   " && colorPos3 =="VERDE   ") {
                juegoTerminado=true;
            } else {
                juegoTerminado= false;
            }
            limpiarPantalla();
            contadorIntentos++;
            intentos.add(digito1 + "     " + digito2 + "     " + digito3 + "    |   " + colorPos1 + "                   " +colorPos2 + "                   " +colorPos3);
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Intento          |   Pista ");
            System.out.printf("%-20s %-25s %-25s %-25s","Hecho            |", "Posicion 1.     ", "Posicion 2.    ", "Posicion 3.");
            System.out.println("\n------------------------------------------------------------------------------------");
            for (int i = 0; i < intentos.size(); i++) {
                System.out.println(intentos.get(i));
            }
            System.out.println("------------------------------------------------------------------------------------"); 
            System.out.println("INTENTOS: "+ contadorIntentos);
        } while (juegoTerminado==false);
        sc.close();

        if (juegoTerminado==true) {
            System.out.println("\nFelicitaciones has terminado el juego en "+ contadorIntentos + " intentos");
        }
        
    }

    public static void limpiarPantalla(){
        try{
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

