/**
 * 
 */
package Estancias;

/**
 * 
 */
public class hall extends Estancia {
	private boolean puertaBlindada;
	
	public void getPuertaBlindada(String resp) {
		if (resp.toUpperCase().startsWith("S")) {
			puertaBlindada = true;
			
		} else if (resp.toUpperCase().startsWith("N")) {
			puertaBlindada = false;
			
		} else {
			throw new ArithmeticException("Por favor, de una respuesta del tipo (S/N) o (Sí/No)");
		}
	}
	
	public String estaLaPuertaBlindada() {
		if (puertaBlindada) {
			return " Puerta Blindada";
		}else {
			return " Puerta No Blindada";
		}
	}
	
	
}
