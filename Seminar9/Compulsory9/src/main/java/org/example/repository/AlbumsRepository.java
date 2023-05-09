package org.example.repository;

import org.example.entity.Albums;
import org.example.entity.Artists;
import org.example.entity.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;

public class AlbumsRepository extends DataRepository<Albums, Integer> {
    private EntityManagerFactory entityManager;

    public List<Albums> findByArtist(Artists artist) {
        return entityManager.createNamedQuery("Album.findByArtist")
                .setParameter("artist", artist)
                .getResultList();
        return new ArrayList<>();
    }

    public List<Albums> findByName(Integer id) {
        return entityManager.createNamedQuery("Album.findByName")
                .setParameter("id", id)
                .getResultList();
        return new ArrayList<>();
    }

    public List<Albums> findByReleaseYear(Integer releaseYear) {
        return entityManager.createNamedQuery("Album.findByReleaseYear")
                .setParameter("releaseYear", releaseYear)
                .getResultList();
        return new ArrayList<>();
    }

}
