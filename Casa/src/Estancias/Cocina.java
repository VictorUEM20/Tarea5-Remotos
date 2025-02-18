/**
 * 
 */
package Estancias;

/**
 * 
 */
public class Cocina extends Estancia {
	boolean tieneTendedero;
	int superficieTendedero = 0;
	
		public void setTendedero(String resp) {
			if (resp.toUpperCase().startsWith("S")) {
				tieneTendedero = true;
			} else if (resp.toUpperCase().startsWith("N")){
				tieneTendedero = false;
			} else {
				throw new ArithmeticException("Por favor, de una respuesta del tipo S/N o Si/No");
			}
		}
		
		public void setSuperficieTendedero(int superficieTendedero) {
			this.superficieTendedero = superficieTendedero;
			this.setMetrosCuadrados(this.getMetrosCuadrados() + this.superficieTendedero);
		}
		
		public String escribirTendedero() {
			if (tieneTendedero) {
				return "Tiene un tendedero de "+ this.superficieTendedero + " metros cuadrados.";
			}else {
				return "No tiene tendedero";
			}
		}
		
		public String escribirCocina () {
			return "Cocina: "+ this.escribirEstancia() +this.escribirTendedero();
		}
}
