
package Modelo.Clases;

public class Libro {
    private int isbn;
    private String titulo;
    private int año;
    
    //Constructores
    public Libro(){
    }

    public Libro(int isbn, String titulo, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
    }
    
    //getters

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }
    
    //setters

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //toString
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", año=" + año + '}';
    }
    
}
