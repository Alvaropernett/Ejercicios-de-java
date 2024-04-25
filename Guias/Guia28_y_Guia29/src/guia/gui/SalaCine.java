/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia.gui;

/**
 *
 * @author Usuario
 */
public class SalaCine {
    int Aforo;
    int Ocupadas;
	String Pelicula;
	double Entrada;
    SalaCine central;
    SalaCine salaVO;
    public SalaCine(){
        salaVO = new SalaCine();
        central = new SalaCine();
        Aforo = 100;
		Ocupadas = 0;
		Pelicula = "";
		Entrada = 5.0;
        salaVO.setAforo(50);
        salaVO.setPelicula("Metropolis");
        salaVO.setEntrada(3);
        String peli;
        peli = central.getPelicula();
        double ingresos;
        ingresos = central.getIngresos();
    }
    //Metodos set
    public void setAforo(int afo) {
		Aforo = afo;
    }
    public void setOcupadas(int ocu) {
		Ocupadas = ocu;
    }
    public void setPelicula(String peli) {
		Pelicula = peli;
    }
    public void setEntrada(double entra) {
		Entrada = entra;
    }
    public void setLibres(int lib) {
		int ocu;
		ocu = Aforo - lib;
		Ocupadas = ocu;
    }
    //Metodos get
    public int getAforo(){
        return Aforo;
    }
    public int getOcupadas() {
	    return Ocupadas;
    }
    public String getPelicula() {
	    return Pelicula;
    }
    public double getEntrada() {
	    return Entrada;
    }
    public int getLibres() {
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }
    public double getPorcentaje() {
        double por;
        por = (double) Ocupadas / (double) Aforo * 100.0;
        return por;
    }
    public double getIngresos() {
        double ingre;
        ingre = Ocupadas * Entrada;
        return ingre;
    }
    //Metodos de orden y otros metodos
    public void Vaciar() {
        Ocupadas = 0;
        Pelicula = "";
    }
    public void entraUno() {
        Ocupadas++;
    }
    
}
