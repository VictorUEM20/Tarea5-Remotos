/**
 * 
 */
package Estancias;

/**
 * 
 */
public class Habitacion extends Estancia {
	
	private boolean Acceso;
	private int puertasArmario;
	
	public void setAccesoaDucha ( String AccesoaDucha) {
		if (AccesoaDucha.toUpperCase().startsWith("Si")) {
			Acceso = true;
		} else if (AccesoaDucha.toUpperCase().startsWith("No")) {
			Acceso = false;
		} else {
			throw new ArithmeticException ("Por favor, de una respuesta del tipo Si/No");
		}

	}

	public String tieneAccesoaDucha () {
	 if (Acceso) {
		 return "Tiene Acceso";
	 }else {
		 return "No tiene Acceso";
	 }
	}
	//esto es el metodo para el numero de puertas
	
	public void setPuertasArmario(int puertas) {
        if (puertas >= 0) {
            this.puertasArmario = puertas;
        } else {
            throw new ArithmeticException("El número de puertas no puede ser negativo");
        }
    }

    public int getPuertasArmario() {
        return this.puertasArmario;
    }
	
}



