package org.example.repository;

import org.example.entity.Artists;
import org.example.entity.EntityManagerFactory;
import org.example.entity.Genres;

import java.util.ArrayList;
import java.util.List;


public class GenresRepository extends DataRepository<Genres,Integer> {
    private EntityManagerFactory entityManager;

    public List<Genres> findByName(String name) {
        return entityManager.createNamedQuery("Genres.findByName")
                .setParameter("name", name).getResultList();
        return new ArrayList<>();
    }
}
