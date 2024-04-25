
package paquetePrincipal;

/**
 *
 * @author alvar
 */
public class salaCine {
    
int aforo;
int ocupadas;
String pelicula;
double entrada;
    
public salaCine(){
    
aforo = 100;
ocupadas = 0;
pelicula = "";
entrada = 5;
}

public void setaforo(int afo){
aforo = afo;
}

public void setocupadas(int ocu){
ocupadas = ocu;
}

public void setpelicula(String peli){
pelicula = peli;
}

public void setentrada(double entra){
entrada = entra;
}

public void setlibres(int lib){
int ocu;
ocu = aforo - lib;
ocupadas = ocu;
}

public int getocupadas(){
return ocupadas;
}

public String getpelicula(){
return pelicula;
}

public double getentrada(){
return entrada;
}

public int getlibres(){
int lib;
lib = aforo - ocupadas;    
return lib;
}

public double getporcentaje(){
double por;
por = (double) ocupadas / (double) aforo * 100;
return por;
}

public double getingresos(){
double ingre;
ingre = ocupadas * entrada;
return ingre;
}

public void vaciar(){
ocupadas = 0;
pelicula = "";
}

public void entraUno(){
ocupadas++;
}










    
    
}
