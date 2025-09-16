package co.edu.poli.actividad3.modelo;

public class Antigua extends Moneda {
    private String siglo;
    private String estadoConservacion;

    public Antigua(String serial, String material, String tamano, String valor, String tipo, String rareza, String epoca,
                   int anoCreacion, boolean esAutentica, Protector protector, Pais pais,
                   String siglo, String estadoConservacion) {
        super(serial, material, tamano, valor, tipo, rareza, epoca, anoCreacion, esAutentica, protector, pais);
        this.siglo = siglo;
        this.estadoConservacion = estadoConservacion;
    }

    public String getSiglo() {
        return siglo;
    }

    public void setSiglo(String siglo) {
        this.siglo = siglo;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    @Override
    protected String mostrarInformacion() {
        return "Moneda Antigua del siglo " + siglo + ", estado: " + estadoConservacion +
               ", serial: " + getSerial();
    }

    @Override
    protected String mostrarInformacion(String detalleExtra) {
        return mostrarInformacion() + ", Detalle adicional: " + detalleExtra;
    }
    
    

}
