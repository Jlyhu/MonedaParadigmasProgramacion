package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad3.modelo.Moneda;

/**
 * Interfaz que define las operaciones CRUD para objetos de tipo Moneda.
 */
public interface OperacionCRUD {
    String create(Moneda objeto);
    Moneda[] read();
    Moneda readId(String id);
    String update(String id, Moneda objeto);
    Moneda delete(String id);
}