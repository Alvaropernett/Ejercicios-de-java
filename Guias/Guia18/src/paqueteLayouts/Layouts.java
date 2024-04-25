
package paqueteLayouts;

import paqueteLayouts.vista.ventanaLayouts;

/**
 *
 * @author isac pacheco
 */
public class Layouts {
    
public static void main(String[]args){
    
ventanaLayouts ventana = new ventanaLayouts();

ventana.setLocationRelativeTo(null);
ventana.setVisible(true);


//conclusion

//El diseño de la ventana viene definido por los Layoyts, o distribuciones.

//Diseño Libre-
//Esta distribución viene activada por defecto en el NetBeans,define una distribución de 
//componentes en la que se respetan las distancias entre ellos cuando la ventana cambia de tamaño.


//Absaluielaxout- 
//En esta distribucion el programador puede colocar cada elemento en la posición que desee de la ventana. 
//Los distintos elementos mantienen su posición aunque la ventana cambie de tamaño, lo que puede hacer que si la 
//ventana se reduce de tamaño algunos elementos no se vean.


//flowLayout.- 
// En esta distribución los elementos se colocan uno detrás de otro. Los elementos 
//intentarán estar dentro de la ventana aunque esta se reduzca de tamaño.

//GridLayout- 
//Esta distribución coloca a los elementos en filas y columnas Los elementos siempre 
//estarán dentro de la ventana aunque esta se reduzca de tamaño.

//BarderLayaut- 
//Esta distribución coloca a los elementos en zonas. Los elementos siempre estarán 
//dentro de la ventana aunque esta se reduzca de tamaño.



}
    
}
