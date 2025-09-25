package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad3.modelo.Moneda;

/**
 * Implementación de las operaciones CRUD sobre un arreglo de tipo Moneda.
 * <p>
 * Utiliza un arreglo estático que se expande dinámicamente para permitir
 * almacenamiento infinito de objetos Moneda.
 * </p>
 * 
 * @author Juliana
 * @version 1.0
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {

    /**
     * Arreglo de monedas que actúa como almacenamiento en memoria.
     */
    private Moneda[] monedas;

    /**
     * Capacidad inicial del arreglo.
     */
    private int capacidadInicial = 10;

    /**
     * Constructor que inicializa el arreglo con la capacidad inicial.
     */
    public ImplementacionOperacionCRUD() {
        monedas = new Moneda[capacidadInicial];
    }

    /**
     * Inserta una moneda en el primer espacio disponible del arreglo.
     * Si el arreglo está lleno, se expande automáticamente.
     *
     * @param objeto Moneda a insertar
     * @return Mensaje indicando la posición donde fue agregada
     */
    @Override
    public String create(Moneda objeto) {
        for (int i = 0; i < monedas.length; i++) {
            if (monedas[i] == null) {
                monedas[i] = objeto;
                return "Moneda agregada en posición " + i;
            }
        }
        // Expandir arreglo si está lleno
        Moneda[] nuevoArreglo = new Moneda[monedas.length + capacidadInicial];
        System.arraycopy(monedas, 0, nuevoArreglo, 0, monedas.length);
        nuevoArreglo[monedas.length] = objeto;
        monedas = nuevoArreglo;
        return "Moneda agregada en nueva posición " + monedas.length;
    }

    /**
     * Devuelve el arreglo completo de monedas.
     *
     * @return Arreglo de monedas
     */
    @Override
    public Moneda[] read() {
        return monedas;
    }

    /**
     * Busca una moneda por su serial.
     *
     * @param id Serial de la moneda
     * @return Moneda encontrada o null si no existe
     */
    @Override
    public Moneda readId(String id) {
        for (Moneda m : monedas) {
            if (m != null && m.getSerial().equals(id)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Actualiza una moneda existente por su serial.
     *
     * @param id Serial de la moneda a actualizar
     * @param objeto Nueva moneda con los datos actualizados
     * @return Mensaje indicando el resultado de la operación
     */
    @Override
    public String update(String id, Moneda objeto) {
        for (int i = 0; i < monedas.length; i++) {
            if (monedas[i] != null && monedas[i].getSerial().equals(id)) {
                monedas[i] = objeto;
                return "Moneda actualizada en posición " + i;
            }
        }
        return "Moneda con serial " + id + " no encontrada.";
    }

    /**
     * Elimina una moneda por su serial.
     *
     * @param id Serial de la moneda a eliminar
     * @return Moneda eliminada o null si no se encontró
     */
    @Override
    public Moneda delete(String id) {
        for (int i = 0; i < monedas.length; i++) {
            if (monedas[i] != null && monedas[i].getSerial().equals(id)) {
                Moneda eliminada = monedas[i];
                monedas[i] = null;
                return eliminada;
            }
        }
        return null;
    }
}