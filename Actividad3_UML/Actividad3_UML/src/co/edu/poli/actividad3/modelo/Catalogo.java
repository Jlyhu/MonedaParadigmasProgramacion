package co.edu.poli.actividad3.modelo;

import java.util.Arrays;

public class Catalogo {
	private String idCatalogo;
	private String fecha;
	private double precio;
	private String tipo;
	private Moneda[] moneda;
	
	

	public Catalogo(String idCatalogo, String fecha, double precio, String tipo, Moneda[] moneda) {
		super();
		this.idCatalogo = idCatalogo;
		this.fecha = fecha;
		this.precio = precio;
		this.tipo = tipo;
		this.moneda = moneda;
	}


	
	public String getIdCatalogo() {
		return idCatalogo;
	}



	public void setIdCatalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
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


	
	@Override
	public String toString() {
		return "Catalogo [idCatalogo=" + idCatalogo + ", fecha=" + fecha + ", precio=" + precio + ", tipo=" + tipo
				+ ", moneda=" + Arrays.toString(moneda) + "]";
	}



	public void documentarMonedas() {
	    if (moneda != null) {
	        for (Moneda m : moneda) {
	            System.out.println(m.mostrarInformacion());
	        }
	    } else {
	        System.out.println("No hay monedas en el catálogo.");
	    }
	}



}
