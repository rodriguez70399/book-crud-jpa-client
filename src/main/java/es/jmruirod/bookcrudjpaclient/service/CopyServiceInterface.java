package es.jmruirod.bookcrudjpaclient.service;

import java.util.List;

import es.jmruirod.bookcrudjpaclient.model.Copy;

/**
 * Interfaz que define los métodos de servicio para la gestión de copias de libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface CopyServiceInterface 
{
    /**
     * Obtiene una lista de todas las copias de libros.
     * 
     * @return Lista de copias de libros.
     */
    public List<Copy> getAll();

    /**
     * Encuentra una copia de libro por su ISBN.
     * 
     * @param isbn El ISBN de la copia de libro a buscar.
     * @return La copia de libro encontrada o null si no se encuentra.
     */
    public Copy findById(int isbn);

    /**
     * Crea una nueva copia de libro y la agrega.
     * 
     * @param copy La copia de libro a crear y agregar.
     * @return Lista de copias de libros actualizada.
     */
    public List<Copy> create(Copy copy);

    /**
     * Actualiza la información de una copia de libro existente.
     * 
     * @param copy La copia de libro con la información actualizada.
     */
    public void update(Copy copy);

    /**
     * Elimina una copia de libro por su ISBN.
     * 
     * @param isbn El ISBN de la copia de libro a eliminar.
     * @return Lista de copias de libros actualizada.
     */
    public List<Copy> delete(int isbn);
}
