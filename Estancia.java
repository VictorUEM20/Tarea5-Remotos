/**
 * 
 */
package Estancias;

/**
 * 
 */
public class Estancia {
	private String nombre;
	private int metrosCuadrados;
	private int nPuertas;
	private int nVentanas;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	
	public void setMetrosCuadrados( int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	
	public int getNPuertas () {
		return nPuertas;
	}
	
	public void setNPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	public int getNVentanas () {
		return nVentanas;
	}
	
	public void setNVentanas (int nVentanas) {
		this.nVentanas = nVentanas;
	}
}
