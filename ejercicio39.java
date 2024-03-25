import java.util.Scanner;
public class ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anioNac, anioActual, diasVividos, edad ;
        String nombre;
        double diaDormidos;

        System.out.print("Ingresa el año actual: ");
        anioActual = sc.nextInt();
        System.out.print("Ingresa el año de nacimiento: ");
        anioNac = sc.nextInt();
        System.out.print("Ingrese el nombre: ");
        nombre = sc.next();
        sc.close();

        edad = anioActual - anioNac;
        diasVividos = edad * 365;
        diaDormidos = diasVividos * 0.34;

        System.out.println(nombre + " ha dormido a lo largo de su vida aproximadamente "+ diaDormidos +" dias");
    }
}
