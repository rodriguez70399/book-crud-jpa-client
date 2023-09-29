package es.jmruirod.bookcrudjpaclient.model;

import java.util.Objects;

/**
 * Esta clase representa una copia de un libro.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class Copy 
{
    private int isbn;
    private String title;
    private String genre;
    
    /**
     * Constructor por defecto de la clase Copy.
     */
    public Copy() 
    {

    }

    /**
     * Constructor de la clase Copy.
     * 
     * @param isbn   El ISBN de la copia.
     * @param title  El título de la copia.
     * @param genre  El género de la copia.
     */
    public Copy(int isbn, String title, String genre)
    {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
    }

    /**
     * Obtiene el ISBN de la copia.
     * 
     * @return El ISBN de la copia.
     */
    public int getIsbn() 
    {
        return isbn;
    }

    /**
     * Establece el ISBN de la copia.
     * 
     * @param isbn El ISBN de la copia.
     */
    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
    }

    /**
     * Obtiene el título de la copia.
     * 
     * @return El título de la copia.
     */
    public String getTitle() 
    {
        return title;
    }

    /**
     * Establece el título de la copia.
     * 
     * @param title El título de la copia.
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }

    /**
     * Obtiene el género de la copia.
     * 
     * @return El género de la copia.
     */
    public String getGenre() 
    {
        return genre;
    }

    /**
     * Establece el género de la copia.
     * 
     * @param genre El género de la copia.
     */
    public void setGenre(String genre) 
    {
        this.genre = genre;
    }

    /**
     * Sobrescribe el método toString para representar el objeto Copy como una cadena.
     */
    @Override
    public String toString() 
    {
        return "Copy [isbn=" + isbn + ", title=" + title + ", genre=" + genre + "]";
    }

    /**
     * Calcula el hash code del objeto Copy basado en el ISBN.
     */
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(isbn);
    }

    /**
     * Compara dos objetos Copy para determinar si son iguales.
     * Dos copias son iguales si tienen el mismo ISBN, título y género.
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Copy other = (Copy) obj;

        if (isbn != other.isbn)
            return false;

        if (title == null) 
        {
            if (other.title != null)
                return false;
        } 
        else if (!title.equals(other.title))
            return false;

        if (genre == null) 
        {
            if (other.genre != null)
                return false;
        }
        else if (!genre.equals(other.genre))
            return false;

        return true;
    }
}
