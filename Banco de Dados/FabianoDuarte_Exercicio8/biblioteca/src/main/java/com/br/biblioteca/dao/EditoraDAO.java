package com.br.biblioteca.dao;

import com.br.biblioteca.model.Editora;
import javax.persistence.EntityManager;

public class EditoraDAO {

    private EntityManager em;

    public EditoraDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar (Editora editora) {
        this.em.persist(editora);
    }

}
