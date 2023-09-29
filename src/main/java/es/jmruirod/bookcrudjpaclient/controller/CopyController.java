package es.jmruirod.bookcrudjpaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.bookcrudjpaclient.model.Copy;
import es.jmruirod.bookcrudjpaclient.service.CopyServiceInterface;

@RestController
public class CopyController 
{
    @Autowired
    private CopyServiceInterface service;

    @PostMapping(value = "copy/{isbn}/{title}/{genre}")
    public List<Copy> create(@PathVariable("isbn") int isbn, @PathVariable("title") String title, @PathVariable("genre") String genre)
    {
        Copy copy = new Copy(isbn, title, genre);
        return this.service.create(copy);
    } 
}
