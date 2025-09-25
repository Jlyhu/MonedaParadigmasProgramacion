package co.edu.poli.actividad3.modelo;

public class Coleccionista {
	private String idColeccionista;
	private String tipo;
	private String experiencia;
	private String nombre;

	
	public Coleccionista(String idColeccionista, String tipo, String experiencia, String nombre) {
		super();
		this.idColeccionista = idColeccionista;
		this.tipo = tipo;
		this.experiencia = experiencia;
		this.nombre = nombre;

	}

	public String getIdColeccionista() {
		return idColeccionista;
	}

	public void setIdColeccionista(String idColeccionista) {
		this.idColeccionista = idColeccionista;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Coleccionista [idColeccionista=" + idColeccionista + ", tipo=" + tipo + ", experiencia=" + experiencia
				+ ", nombre=" + nombre + "]";
	}
		
}
