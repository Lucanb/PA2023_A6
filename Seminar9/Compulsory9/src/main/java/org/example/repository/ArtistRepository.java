package org.example.repository;

import org.example.PersistenceUnitManager;
import org.example.entity.Artists;
import org.example.entity.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

public class ArtistRepository extends DataRepository<Artists,Integer>{
    private final EntityManagerFactory entityManager;
    public ArtistRepository(EntityManagerFactory emf){
        entityManager = (EntityManagerFactory) PersistenceUnitManager.getInstance().getEntityManagerFactory().createEntityManager();
    }

    public List<Artists> findByName(String name) {
        return entityManager.createNamedQuery("Album.findByName")
               .setParameter("name", name)
                .getResultList();
        return new ArrayList<>();
    }
}
