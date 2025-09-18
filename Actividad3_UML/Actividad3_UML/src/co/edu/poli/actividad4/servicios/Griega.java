package co.edu.poli.actividad4.servicios;
import co.edu.poli.actividad3.modelo.Antigua;
import co.edu.poli.actividad3.modelo.Pais;
import co.edu.poli.actividad3.modelo.Protector;

// Actividad 6: Clase que no se puede heredar
public final class Griega extends Antigua {

	// Actividad 6: Atributo que no se puede cambiar
	private final String region;

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

    public String getPeriodoHistorico() {
        return periodoHistorico;
    }

    public void setPeriodoHistorico(String periodoHistorico) {
        this.periodoHistorico = periodoHistorico;
    }

    // Actividad 6: Método que no se puede sobrescribir
    public final void mostrarMensajeFinal() {
        System.out.println("Este método no puede ser sobrescrito.");
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

