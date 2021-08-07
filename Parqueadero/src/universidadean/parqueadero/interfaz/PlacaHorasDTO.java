package universidadean.parqueadero.interfaz;

import java.io.Serializable;

public class PlacaHorasDTO implements Serializable{
	
	/**
	 * Tatiana.Garcia
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	private String Placa;
	private Integer NumHrs;
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public Integer getNumHrs() {
		return NumHrs;
	}
	public void setNumHrs(Integer numHrs) {
		NumHrs = numHrs;
	}
	
}
