package es.jmruirod.bookcrudjpaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.bookcrudjpaclient.model.Copy;
import es.jmruirod.bookcrudjpaclient.service.CopyServiceInterface;

/**
 * Controlador que gestiona las solicitudes relacionadas con las copias de libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@RestController
public class CopyController 
{
    @Autowired
    private CopyServiceInterface service;

    /**
     * Crea una nueva copia de libro y la agrega utilizando los parámetros proporcionados.
     * 
     * @param isbn   El ISBN de la copia de libro.
     * @param title  El título de la copia de libro.
     * @param genre  El género de la copia de libro.
     * @return Lista de copias de libros actualizada en formato JSON.
     * @apiNote POST localhost:PUERTO/copy/1/prueba/genero
     */
    @PostMapping(value = "copy/{isbn}/{title}/{genre}")
    public List<Copy> create(@PathVariable("isbn") int isbn, @PathVariable("title") String title, @PathVariable("genre") String genre)
    {
        Copy copy = new Copy(isbn, title, genre);
        return this.service.create(copy);
    } 
}
