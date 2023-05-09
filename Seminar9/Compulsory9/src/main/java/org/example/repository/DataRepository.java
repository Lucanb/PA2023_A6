package org.example.repository;

import org.example.entity.AbstractEntity;

import org.example.entity.AbstractEntity;
import org.example.entity.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
public class DataRepository<T extends AbstractEntity, ID extends Serializable> {
private EntityManagerFactory entityManager;
public boolean persist(T entity) {
    try {
        entityManager.persist(entity);
        return true;
    } catch (Exception e) {
        return false;
    }
}
public void handleException(Exception e) {
    System.out.println("Exception: " + e);
}
//public List<T> findAll() {
//    List<T> entities = new ArrayList<>();
//    for (T entity : entityManager.createNamedQuery("findAll", T.class).getResultList()) {
//        entities.add(entity);
//    }
 //   return entities;
//}
public void close() {
    entityManager.close();
}
public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
    this.entityManager = entityManagerFactory;
}
public EntityManagerFactory getEntityManagerFactory() {
    return entityManager;
}
private void beingTransaction() {
    entityManager.getTransaction().begin();
}
private void commitTransaction() {
    entityManager.getTransaction().commit();
}
//private void rollbackTransaction() {
//    entityManager.getTransaction().rollback();
//}


}
