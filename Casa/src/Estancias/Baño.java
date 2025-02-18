/**
 * 
 */
package Estancias;

/**
 * 
 */
public class Baño extends Estancia {
	private boolean bañera;
	// True si tiene bañera; false si tiene ducha.
	
	public void setBañeraODucha (String bañeraODucha) {
				if (bañeraODucha.toUpperCase().startsWith("B")) {
					bañera = true;
				} else if (bañeraODucha.toUpperCase().startsWith("D")){
					bañera = false;
				} else {
					throw new ArithmeticException("Por favor, de una respuesta del tipo B/D");
				}
	}
}
