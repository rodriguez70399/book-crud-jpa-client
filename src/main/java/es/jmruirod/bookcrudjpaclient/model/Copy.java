package es.jmruirod.bookcrudjpaclient.model;

import java.util.Objects;

public class Copy 
{
    private int isbn;
    private String title;
    private String genre;
    
    public Copy() 
    {

    }

    public Copy(int isbn, String title, String genre)
    {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
    }

    public int getIsbn() 
    {
        return isbn;
    }

    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getGenre() 
    {
        return genre;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }

    @Override
    public String toString() 
    {
        return "Copy [isbn=" + isbn + ", title=" + title + ", genre=" + genre + "]";
    }

    @Override
    public int hashCode() 
    {
        return Objects.hashCode(isbn);
    }

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
