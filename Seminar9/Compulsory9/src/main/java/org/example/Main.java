package org.example;

import org.example.entity.Artists;
import  org.example.entity.EntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main{
    public static void main(String[] args) {
        EntityManagerFactory emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ExamplePU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Artists artist = new Artists("Beatles");
        em.persist(artist);

        Artists a = (Artists) em.createQuery(
                        "select e from Artists e where e.name='Beatles'")
                .getSingleResult();
        a.setName("The Beatles");
        em.getTransaction().commit();
        em.close();
    }
}