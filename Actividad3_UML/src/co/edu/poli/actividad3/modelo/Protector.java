package co.edu.poli.actividad3.modelo;

public class Protector {
	private String idProtector;
	private String material;
	private String tipo;
	
	public Protector(String idProtector, String material, String tipo) {
		super();
		this.idProtector = idProtector;
		this.material = material;
		this.tipo = tipo;
	}

	public String getIdProtector() {
		return idProtector;
	}

	public void setIdProtector(String idProtector) {
		this.idProtector = idProtector;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Protector [idProtector=" + idProtector + ", material=" + material + ", tipo=" + tipo + "]";
	}
	
}


