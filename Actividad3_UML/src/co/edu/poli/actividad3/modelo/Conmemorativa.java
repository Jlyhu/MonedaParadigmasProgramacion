package co.edu.poli.actividad3.modelo;

public class Conmemorativa extends Moneda {
    private boolean esEdicionLimitada;
    private String evento;

    public Conmemorativa(String serial, String material, String tamano, String valor, String tipo, String rareza, String epoca,
                         int anoCreacion, boolean esAutentica, Protector protector, Pais pais,
                         boolean esEdicionLimitada, String evento) {
        super(serial, material, tamano, valor, tipo, rareza, epoca, anoCreacion, esAutentica, protector, pais);
        this.esEdicionLimitada = esEdicionLimitada;
        this.evento = evento;
    }

    public boolean isEsEdicionLimitada() {
        return esEdicionLimitada;
    }

    public void setEsEdicionLimitada(boolean esEdicionLimitada) {
        this.esEdicionLimitada = esEdicionLimitada;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    protected String mostrarInformacion() {
        return "Moneda Conmemorativa del evento: " + evento +
               ", edición limitada: " + (esEdicionLimitada ? "Sí" : "No") +
               ", serial: " + getSerial();
    }

    @Override
    protected String mostrarInformacion(String detalleExtra) {
        return mostrarInformacion() + ", Detalle adicional: " + detalleExtra;
    }
    
    
}
