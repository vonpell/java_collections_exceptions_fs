package classes;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable {
    // implementei o Serializable, mas não utilizei InputStream e OutputStream
    private String titulo;
    private String autor;
    private String isbn;

    public Livro() {
    }

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", autor: " + autor + ", ISBN : " + isbn + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, isbn);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        return Objects.equals(titulo, other.titulo) &&
                Objects.equals(autor, other.autor) &&
                Objects.equals(isbn, other.isbn);
    }

}
