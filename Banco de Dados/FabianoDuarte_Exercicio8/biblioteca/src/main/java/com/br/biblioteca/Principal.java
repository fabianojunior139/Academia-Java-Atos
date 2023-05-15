package com.br.biblioteca;

import com.br.biblioteca.dao.*;
import com.br.biblioteca.model.*;
import com.br.biblioteca.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //Criando instância da EntityManager para poder começar as transações no banco de dados
        EntityManager em = JPAUtil.getEntityManager();

        //Criando as instâncias das classes DAO
        LivroDAO livroDAO = new LivroDAO(em);
        EditoraDAO editoraDAO = new EditoraDAO(em);
        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        //Criando as instâncias de categoria
        Categoria categoria1 = new Categoria("Ação");
        Categoria categoria2 = new Categoria("Comédia");

        //Criando as instâncias de editora
        Editora editora1 = new Editora("Aleph");
        Editora editora2 = new Editora("Rocco");

        Livro harryPotter = new Livro("Harry Potter", 1999, 123456789, categoria1, editora1);
        Livro piorQueTaNaoFica = new Livro("Pior que tá não fica", 2015, 15198487, categoria2, editora2);
        Livro oEspadachimDeCarvao = new Livro("O Espadachim de carvão", 2010, 15198487, categoria1, editora2);

        em.getTransaction().begin();

//        //Persistindo as instâncias de categoria criadas anteriormente
//        categoriaDAO.cadastrar(categoria1);
//        categoriaDAO.cadastrar(categoria2);
//
//        //Persistindo as instâncias de editora criadas anteriormente
//        editoraDAO.cadastrar(editora1);
//        editoraDAO.cadastrar(editora2);
//
//        //Persistindo as instâncias de livros criadas anteriormente
//        livroDAO.cadastrar(harryPotter);
//        livroDAO.cadastrar(piorQueTaNaoFica);
//        livroDAO.cadastrar(oEspadachimDeCarvao);

//        //Buscando todos os livros cadastrados
//        List<Livro> todosLivros = livroDAO.buscarTodos();
//        todosLivros.forEach(l -> {
//            System.out.println("\n" + l.getId());
//            System.out.println(l.getISBN());
//            System.out.println(l.getTitulo());
//            System.out.println(l.getAno());
//            System.out.println(l.getCategoria());
//            System.out.println(l.getEditora());
//        });

//        //Atualizando um livro
//        Livro atualizaLivro = em.find(Livro.class, 1l);
//        System.out.println("Livro: " + atualizaLivro);
//        atualizaLivro.setTitulo("testando");
//        livroDAO.atualizar(atualizaLivro);

//        //Buscando livro por ID
//        Livro livro = livroDAO.buscarPorId(1l);
//        System.out.println(livro.getId());
//        System.out.println(livro.getISBN());
//        System.out.println(livro.getTitulo());
//        System.out.println(livro.getAno());

//        //Removendo livro
//        livroDAO.remover(livro);

        em.getTransaction().commit();
        em.close();
    }
}
