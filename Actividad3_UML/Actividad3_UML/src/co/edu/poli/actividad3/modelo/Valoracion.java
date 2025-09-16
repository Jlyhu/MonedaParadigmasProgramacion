package co.edu.poli.actividad3.modelo;

public class Valoracion {
	private String idValoracion;
	private String tipo;
	private String presicion;
	private Moneda moneda;
	
	public Valoracion(String idValoracion, String tipo, String presicion, Moneda moneda) {
		super();
		this.idValoracion = idValoracion;
		this.tipo = tipo;
		this.presicion = presicion;
		this.moneda = moneda;
	}

	public String getIdValoracion() {
		return idValoracion;
	}

	public void setIdValoracion(String idValoracion) {
		this.idValoracion = idValoracion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPresicion() {
		return presicion;
	}

	public void setPresicion(String presicion) {
		this.presicion = presicion;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public String toString() {
		return "Valoracion [idValoracion=" + idValoracion + ", tipo=" + tipo + ", presicion=" + presicion + ", moneda="
				+ moneda + "]";
	}
	
	
}
