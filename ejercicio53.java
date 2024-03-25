import java.util.Scanner;

public class ejercicio53 {
 public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int area,lado;

    System.out.println("ingrese uno de los lados del cuadrado");
    
    lado = entrada.nextInt();
    
    area = lado * lado;
    
    System.out.println("el area del cuadrado es " + area + " cm2 ");
 }
    
}