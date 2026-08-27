package br.edu.ifsp.biblioteca.domain;

public class Autor {

    private Long id;
    private String nome;

    public Autor(String nome){
        this.nome = nome;
    }
    //getters "pegam" valores, like to get
    public Long getId(){
        return this.id;
    }

    //setters definem valores like to set a tone
    public void setId(Long id){
        this.id = id;
    }

    //to String, make values be "showable"
    @Override
    public String toString(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
