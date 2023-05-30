package com.example.DataBase_Accounts.DataFile.Repository;

import com.example.DataBase_Accounts.DataFile.dataEntities.History;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface HistoryRepository extends JpaRepository<History,Long> {
    Optional<History> findByID(Integer Id);
   // Optional<History> findByNameAndIDPARTENER(Integer ID);
   // Optional<History> findByID(UUID ID);

    Optional<History> findByIDPARTENER(Integer ID);
    // Optional<History> findByIDPARTENER(UUID ID);
  //  Optional<History> findAllByID(UUID ID);
}
