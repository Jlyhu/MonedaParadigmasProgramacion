package co.edu.poli.actividad4.servicios;
import co.edu.poli.actividad3.modelo.Antigua;
import co.edu.poli.actividad3.modelo.Pais;
import co.edu.poli.actividad3.modelo.Protector;


public class Griega extends Antigua {
    private String region;
    private String periodoHistorico;

    public Griega(String serial, String material, String tamano, String valor, String tipo, String rareza, String epoca,
                  int anoCreacion, boolean esAutentica, Protector protector, Pais pais,
                  String siglo, String estadoConservacion,
                  String region, String periodoHistorico) {
        super(serial, material, tamano, valor, tipo, rareza, epoca, anoCreacion, esAutentica, protector, pais,
              siglo, estadoConservacion);
        this.region = region;
        this.periodoHistorico = periodoHistorico;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPeriodoHistorico() {
        return periodoHistorico;
    }

    public void setPeriodoHistorico(String periodoHistorico) {
        this.periodoHistorico = periodoHistorico;
    }

    @Override
    protected String mostrarInformacion() {
        return "Moneda Griega de la región " + region + ", periodo histórico: " + periodoHistorico +
               ", siglo: " + getSiglo() + ", estado: " + getEstadoConservacion();
    }

    @Override
    protected String mostrarInformacion(String detalleExtra) {
        return mostrarInformacion() + ", Detalle adicional: " + detalleExtra;
    }
}

