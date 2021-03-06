package com.company;

public class Book {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Book() {
        System.out.println("novo livro criado");
    }

    boolean temAutor() {
        boolean naoEhNull = this.autor != null;
        return naoEhNull;
    }

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }

        System.out.println("--");

    }

    public boolean aplicaDescontoDe(double porcentagem) {

        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;

    }

}
