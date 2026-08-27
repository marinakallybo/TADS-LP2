package br.edu.ifsp.biblioteca.domain;

public class Usuario {

    private Long id;
    private String nome;
    private String email;

    public Long getId() {
        return id;
    }
    //construtor
    public Usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
