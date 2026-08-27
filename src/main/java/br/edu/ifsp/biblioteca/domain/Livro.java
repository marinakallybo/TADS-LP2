package br.edu.ifsp.biblioteca.domain;

public class Livro {

    private Long id;
    private String isbn;
    private String titulo;
    private int anopublicacao;

    //construtor
    public Livro(Long id, String isbn, String titulo, int anopublicacao) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anopublicacao = anopublicacao;
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    //setters definem valores like to set a tone
    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnopublicacao(int anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anopublicacao=" + anopublicacao +
                '}';
    }
}
