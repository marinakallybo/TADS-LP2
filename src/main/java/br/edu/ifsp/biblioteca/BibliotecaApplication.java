package br.edu.ifsp.biblioteca;

import br.edu.ifsp.biblioteca.domain.Livro;

public class BibliotecaApplication {
    public static void main(String[] args) {

        Livro livro = new Livro(
                id:1L,
                isbn:" 9788508145607",
                titulo:"Dom Casmurro",
                anoPublicacao:2026
        );

        Livro livro = new Livro(
                id:2L,
                isbn:" 9788573264579",
                titulo:"Crime e Castigo",
                anoPublicacao:2026
        );

        Livro livro = new Livro(
                id:3L,
                isbn:" 9788573266467",
                titulo:"Dom Quixote",
                anoPublicacao:2026
        );

        SystemOutPrintln(livro);

    }
}
