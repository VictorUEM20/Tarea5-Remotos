/**
 * 
 */
package Estancias;

/**
 * 
 */
public class Salón extends Estancia{
	int nTomasCorriente;
	boolean tieneTerraza;
	int superficieTerraza;
	
	
	public void setNTomasCorriente (int nTomasCorriente) {
		this.nTomasCorriente = nTomasCorriente;
	}
	
	public int getNTomasCorriente() {
		return nTomasCorriente;
	}
	
	public void setTerraza(String resp) {
		if (resp.toUpperCase().startsWith("S")) {
			tieneTerraza = true;
		} else if (resp.toUpperCase().startsWith("N")){
			tieneTerraza = false;
		} else {
			throw new ArithmeticException("Por favor, de una respuesta del tipo S/N o Si/No");
		}
	}
	
	public String escribirTerraza () {
		if (tieneTerraza) {
			return "Con terraza de " + this.superficieTerraza + " metros cuadrados.";
		}else {
			return "Sin terraza.";
		}
	}
	
	public void setSuperficieTerraza(int superficieTerraza) {
		this.superficieTerraza = superficieTerraza;
	}
	
	public String escribirSalón () {
		return "Salón "+ this.escribirEstancia() +this.escribirTerraza();
	}

}
