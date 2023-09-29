package es.jmruirod.bookcrudjpaclient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.jmruirod.bookcrudjpaclient.model.Copy;

/**
 * Implementación de la interfaz {@link CopyServiceInterface} que proporciona servicios para la gestión de copias de libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class CopyServiceInterfaceImplemented implements CopyServiceInterface
{
    @Autowired
    private RestTemplate template;

    private String url = "http://localhost:8080/";

    /**
     * Obtiene una lista de todas las copias de libros.
     * 
     * @return Lista de copias de libros.
     */
    @Override
    public List<Copy> getAll() 
    {
        return Arrays.asList(template.getForObject(url + "books", Copy[].class));
    }

    /**
     * Encuentra una copia de libro por su ISBN.
     * 
     * @param isbn El ISBN de la copia de libro a buscar.
     * @return La copia de libro encontrada o null si no se encuentra.
     */
    @Override
    public Copy findById(int isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    /**
     * Crea una nueva copia de libro y la agrega.
     * 
     * @param copy La copia de libro a crear y agregar.
     * @return Lista de copias de libros actualizada.
     */
    @Override
    public List<Copy> create(Copy copy) 
    {
        template.postForLocation(url + "book", copy);
        return this.getAll();
    }

    /**
     * Actualiza la información de una copia de libro existente.
     * 
     * @param copy La copia de libro con la información actualizada.
     */
    @Override
    public void update(Copy copy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    /**
     * Elimina una copia de libro por su ISBN.
     * 
     * @param isbn El ISBN de la copia de libro a eliminar.
     * @return Lista de copias de libros actualizada.
     */
    @Override
    public List<Copy> delete(int isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
