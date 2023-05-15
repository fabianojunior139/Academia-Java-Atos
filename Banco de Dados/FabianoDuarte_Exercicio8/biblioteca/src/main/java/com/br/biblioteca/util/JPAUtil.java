package com.br.biblioteca.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    //    EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");
    //    EntityManager em = emf.createEntityManager();
    //    ...
    //    em.getTransaction().begin();

    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("biblioteca");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

}
