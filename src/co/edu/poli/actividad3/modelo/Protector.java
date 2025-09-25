/**
 * Clase que representa un protector utilizado para resguardar una moneda.
 * Contiene información sobre el identificador del protector, el material del que está hecho
 * y el tipo de protector (por ejemplo, cápsula, sobre, caja, etc.).
 * 
 * @author Juliana
 * @version 1.0
 */
package co.edu.poli.actividad3.modelo;

public class Protector {
    private String idProtector; // Identificador único del protector
    private String material;    // Material del protector (plástico, vidrio, etc.)
    private String tipo;        // Tipo de protector

    /**
     * Constructor que inicializa los atributos del protector.
     * 
     * @param idProtector Identificador único del protector
     * @param material    Material del protector
     * @param tipo        Tipo de protector
     */
    public Protector(String idProtector, String material, String tipo) {
        super();
        this.idProtector = idProtector;
        this.material = material;
        this.tipo = tipo;
    }

    /** @return el identificador del protector */
    public String getIdProtector() {
        return idProtector;
    }

    /** @param idProtector el nuevo identificador del protector */
    public void setIdProtector(String idProtector) {
        this.idProtector = idProtector;
    }

    /** @return el material del protector */
    public String getMaterial() {
        return material;
    }

    /** @param material el nuevo material del protector */
    public void setMaterial(String material) {
        this.material = material;
    }

    /** @return el tipo de protector */
    public String getTipo() {
        return tipo;
    }

    /** @param tipo el nuevo tipo de protector */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación en cadena del protector.
     * 
     * @return una cadena con la información del protector
     */
    @Override
    public String toString() {
        return "Protector [idProtector=" + idProtector + ", material=" + material + ", tipo=" + tipo + "]";
    }
}
