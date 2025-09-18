package co.edu.poli.actividad3.modelo;

public class Moneda {
	private String serial;
    private String material;
    private String tamano;
    private String valor;
    private String tipo;
    private String rareza;
    private String epoca;
    private int anoCreacion;
    private boolean esAutentica;
    private Protector protector;
    private Pais pais;
    
	public Moneda(String serial, String material, String tamano, String valor, String tipo, String rareza, String epoca,
			int anoCreacion, boolean esAutentica, Protector protector, Pais pais) {
		super();
		this.serial = serial;
		this.material = material;
		this.tamano = tamano;
		this.valor = valor;
		this.tipo = tipo;
		this.rareza = rareza;
		this.epoca = epoca;
		this.anoCreacion = anoCreacion;
		this.esAutentica = esAutentica;
		this.protector = protector;
		this.pais = pais;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRareza() {
		return rareza;
	}

	public void setRareza(String rareza) {
		this.rareza = rareza;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public int getAnoCreacion() {
		return anoCreacion;
	}

	public void setAnoCreacion(int anoCreacion) {
		this.anoCreacion = anoCreacion;
	}

	public boolean isEsAutentica() {
		return esAutentica;
	}

	public void setEsAutentica(boolean esAutentica) {
		this.esAutentica = esAutentica;
	}

	public Protector getProtector() {
		return protector;
	}

	public void setProtector(Protector protector) {
		this.protector = protector;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Moneda [serial=" + serial + ", material=" + material + ", tamano=" + tamano + ", valor=" + valor
				+ ", tipo=" + tipo + ", rareza=" + rareza + ", epoca=" + epoca + ", anoCreacion=" + anoCreacion
				+ ", esAutentica=" + esAutentica + ", protector=" + protector + ", pais=" + pais + "]";
	}
    
	protected String mostrarInformacion() {
	    return "Información básica de la moneda.";
	}
	
	protected String mostrarInformacion(String detalleExtra) {
	    return "Información con detalle: " + detalleExtra;
	}
	
	public String obtenerInformacion() {
        return mostrarInformacion();
    }

    public String obtenerInformacion(String detalleExtra) {
        return mostrarInformacion(detalleExtra);
    }

 
	public int calcularEdadActual() {
	    int anoActual = java.time.Year.now().getValue();
	    return anoActual - this.anoCreacion;
	}
	

}
