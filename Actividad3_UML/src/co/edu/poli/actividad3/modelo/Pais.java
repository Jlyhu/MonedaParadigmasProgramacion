package co.edu.poli.actividad3.modelo;

public class Pais {
	private String idPais;
	private String nombre;
	
	public Pais(String idPais, String nombre) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
	}

	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pais [idPais=" + idPais + ", nombre=" + nombre + "]";
	}
	
	
}
