package org.example.entity;

import jdk.internal.event.Event;

import javax.persistence.EntityManager;
import java.security.Signature;

public class EntityManagerFactory {
    public <T extends AbstractEntity> void persist(T entity) {
    }

    public EntityManager createEntityManager() {
        return null;
    }

    public Signature createNamedQuery(String s) {
        return null;
    }

    public void close() {
    }

    public Event getTransaction() {
        return null;
    }
}
