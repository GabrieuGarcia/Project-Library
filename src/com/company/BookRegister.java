package com.company;

public class BookRegister {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Book book = new Book();
        book.nome ="Java 8 Prático";
        book.descricao ="Novos recursos da linguagem";
        book.valor =59.90;
        book.isbn ="978-85-66250-46-6";

        book.mostrarDetalhes();

        Book book1 = new Book();
        book1.nome ="Java 8 Prático";
        book1.descricao ="Novos recursos da linguagem";
        book1.valor =59.90;
        book1.isbn ="978-85-66250-46-6";

        book.mostrarDetalhes();


    }

}
