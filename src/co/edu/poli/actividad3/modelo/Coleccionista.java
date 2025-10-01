package co.edu.poli.actividad3.modelo;

/**
 * Representa un coleccionista dentro del sistema de gestión de monedas.
 * Un coleccionista tiene un identificador único, un tipo (por ejemplo,
 * aficionado, profesional), un nivel de experiencia y un nombre.
 * 
 * Esta clase permite crear instancias de coleccionistas y acceder o modificar
 * sus atributos principales.
 * 
 * @author Juliana
 * @version 1.0
 */

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
