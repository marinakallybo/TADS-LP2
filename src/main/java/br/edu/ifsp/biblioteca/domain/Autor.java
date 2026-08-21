package br.edu.ifsp.biblioteca.domain;

public class Autor {

    private Long id;
    private String nome;

    public Autor(String nome){
        this.nome = nome;
    }
    public Long getID(){
        return this.id;
    }

    public void setID(Long id){
        this.id = id;
    }
    @Override
    public String toString(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
