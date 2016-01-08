package av_ex13_cadastrolivro;

/**
 * Programa de cadastro de livro.
 * @author Leonardo Pereira Alves.
 * @version 11/05/2015
 */

public class Livro {
    
    private String isbn;
    private String titulo;
    private String autor;

    public Livro(){}
    
    public Livro(String isbn,String titulo,String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
