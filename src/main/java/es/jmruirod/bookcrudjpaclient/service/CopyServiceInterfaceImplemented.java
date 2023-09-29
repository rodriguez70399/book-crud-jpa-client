package es.jmruirod.bookcrudjpaclient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.jmruirod.bookcrudjpaclient.model.Copy;

@Service
public class CopyServiceInterfaceImplemented implements CopyServiceInterface
{
    @Autowired
    private RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Copy> getAll() 
    {
        return Arrays.asList(template.getForObject(url + "books", Copy[].class));
    }

    @Override
    public Copy findById(int isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Copy> create(Copy copy) 
    {
        template.postForLocation(url + "book", copy);
        return this.getAll();
    }

    @Override
    public void update(Copy copy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<Copy> delete(int isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
