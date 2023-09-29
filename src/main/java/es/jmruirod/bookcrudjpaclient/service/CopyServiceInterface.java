package es.jmruirod.bookcrudjpaclient.service;

import java.util.List;

import es.jmruirod.bookcrudjpaclient.model.Copy;

public interface CopyServiceInterface 
{
    public List<Copy> getAll();
    public Copy findById(int isbn);
    public List<Copy> create(Copy copy);
    public void update(Copy copy);
    public List<Copy> delete(int isbn);
}
