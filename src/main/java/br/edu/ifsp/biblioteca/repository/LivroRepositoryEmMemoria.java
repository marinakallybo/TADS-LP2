package br.edu.ifsp.biblioteca.repository;

import br.edu.ifsp.biblioteca.domain.Livro;

import java.util.*;

public class LivroRepositoryEmMemoria implements ILivroRepository {

    private final Map<Long, Livro> livros = new HashMap<>();
    private Long sequenciaId = 0L;

    @Override
    public Livro salvar(Livro livro) {

        if (livro.getId() == null) {

            //pre incremento
            this.sequenciaId = this.sequenciaId + 1;
            livro.setId(++this.sequenciaId);
        }

        this.livros.put(livro.getId(), livro);

        return livro;
    }

    @Override
    public List<Livro> listarTodos() {

        List<Livro> todosOsLivros = new ArrayList<>();

        for (Livro livro : this.livros.values()) {
            todosOsLivros.add(livro);
        }

        return todosOsLivros;
    }

    @Override
    public Optional<Livro> buscarPorId(Long id) {
        return Optional.ofNullable(this.livros.get(id));
/*
        Livro l = this.livros.get(id);

            if(l == null){
            return Optional.empty();

           }
           return Optional.of(l);*/
    }

    @Override
    public Optional<Livro> buscarPorIsbn(String isbn) {

        List<Livro> colecaoLivros = new ArrayList<>(this.livros.values());

        // for each

//        for (Livro livro : colecaoLivros ) {
//
//            if (livro.getIsbn().equalsIgnoreCase(isbn)) {
//                return Optional.of(livro);
//            }
//        }

//        // while
//        int indice = 0;
//
//        while(indice < colecaoLivros.size()) {
//            Livro livro = colecaoLivros.get(indice);
//
//            if (livro.getIsbn().equalsIgnoreCase(isbn)) {
//                return Optional.of(livro);
//            }
//
//            indice++;
//        }


        for (int i = 0; i < colecaoLivros.size(); i++ ) {

            Livro livro = colecaoLivros.get(i);
            String livroIsbn = livro.getIsbn();

            if (livroIsbn.equalsIgnoreCase(isbn)) {
                return Optional.of(livro);

            }
        }

        return Optional.empty();
    }

    @Override
    public List<Livro> buscarPorTitulo(String titulo) {

        List<Livro> livrosEncontrados = new ArrayList<>();

        List<Livro> colecaoLivros = new ArrayList<>(this.livros.values());

        for (int i = 0; i < colecaoLivros.size(); i++ ) {

            Livro livro = colecaoLivros.get(i).;
            String title = livro.getTitulo().toLowerCase();

            if (title.contains(titulo.toLowerCase())) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }
}


//        String title = "Linguagem de Programação";
//
//        title.contains("Programação"); // retorna True se for vdd

