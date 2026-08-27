package br.edu.ifsp.biblioteca.domain;

public class Exemplar {

    private Long id;
    private String codigo;
    private Livro livro;
    private EStatusExemplar status;

    //construtor
    public Exemplar(Long id, String codigo, Livro livro, EStatusExemplar status) {
        this.id = id;
        this.codigo = codigo;
        this.livro = livro;
        this.status = status;
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Livro getLivro() {
        return livro;
    }

    public EStatusExemplar getStatus() {
        return status;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setStatus(EStatusExemplar status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", livro=" + livro +
                ", status=" + status +
                '}';
    }
}
