package co.edu.poli.actividad3.modelo;

public class Certificado {
	private String idCertificado;
	private String fecha;
	private String entidad;
	private Moneda moneda;
	
	public Certificado(String idCertificado, String fecha, String entidad, Moneda moneda) {
		super();
		this.idCertificado = idCertificado;
		this.fecha = fecha;
		this.entidad = entidad;
		this.moneda = moneda;
	}

	public String getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(String idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public String toString() {
		return "Certificado [idCertificado=" + idCertificado + ", fecha=" + fecha + ", entidad=" + entidad + ", moneda="
				+ moneda + "]";
	}
	
	
	

}
