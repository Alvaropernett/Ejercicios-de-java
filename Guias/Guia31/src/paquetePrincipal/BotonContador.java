
package paquetePrincipal;

import javax.swing.JButton;

/**
 *
 * @author alvar
 */
public class BotonContador extends JButton {
    
int pulsaciones;

public BotonContador(){
pulsaciones = 0;
}

public void setPulsaciones(int p){
pulsaciones = p;
}

public int getPulsaciones(){
return pulsaciones;
}

public void incrementa(){
pulsaciones++;
}

public void decrementa(){
pulsaciones--;
}

public void reiniciar(){
pulsaciones = 0;
}

public void aumenta(int c){
pulsaciones = pulsaciones + c;
}

public void disminuye(int c){
pulsaciones = pulsaciones - c;
}


    
    
}
