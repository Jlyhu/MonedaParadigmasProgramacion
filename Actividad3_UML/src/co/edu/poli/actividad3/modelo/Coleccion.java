package co.edu.poli.actividad3.modelo;

import java.util.Arrays;

public class Coleccion {
	private String idColeccion;
	private String acceso;
	private String tipo;
	private Moneda[] moneda;
	private Coleccionista coleccionista;
	
	public Coleccion(String idColeccion, String acceso, String tipo, Moneda[] moneda, Coleccionista coleccionista) {
		super();
		this.idColeccion = idColeccion;
		this.acceso = acceso;
		this.tipo = tipo;
		this.moneda = moneda;
		this.coleccionista = coleccionista;
	}

	public String getIdColeccion() {
		return idColeccion;
	}

	public void setIdColeccion(String idColeccion) {
		this.idColeccion = idColeccion;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Moneda[] getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda[] moneda) {
		this.moneda = moneda;
	}

	public void setColeccionista(Coleccionista coleccionista) {
		this.coleccionista = coleccionista;
	}

	@Override
	public String toString() {
		return "Coleccion [idColeccion=" + idColeccion + ", acceso=" + acceso + ", tipo=" + tipo + ", moneda="
				+ Arrays.toString(moneda) + ", coleccionista=" + coleccionista + "]";
	}

	
	public String buscarMoneda(String idMoneda) {
	    for (Moneda m : moneda) {
	        if (m.getSerial().equals(idMoneda)) {
	            return m.mostrarInformacion();
	        }
	    }
	    return "Moneda no encontrada.";
	}

	
	
}
