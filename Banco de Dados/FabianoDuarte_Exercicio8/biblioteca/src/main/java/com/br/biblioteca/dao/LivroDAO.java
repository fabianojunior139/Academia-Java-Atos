package com.br.biblioteca.dao;

import com.br.biblioteca.model.Livro;
import javax.persistence.EntityManager;
import java.util.List;

public class LivroDAO {

    private EntityManager em;

    public LivroDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Livro livro) {
        this.em.persist(livro);
    }

    public void atualizar(Livro livro) {
        this.em.merge(livro);
    }

    public void remover(Livro livro) {
        livro = em.merge(livro);
        this.em.remove(livro);
    }

    public Livro buscarPorId(Long id) {
        return em.find(Livro.class, id);
    }

    public List<Livro> buscarTodos() {
        String jpql = "SELECT l FROM Livro l";
        return em.createQuery(jpql, Livro.class).getResultList();
    }

}
