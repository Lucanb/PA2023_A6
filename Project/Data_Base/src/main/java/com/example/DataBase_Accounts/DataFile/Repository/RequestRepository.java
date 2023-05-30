package com.example.DataBase_Accounts.DataFile.Repository;

import com.example.DataBase_Accounts.DataFile.dataEntities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RequestRepository extends JpaRepository<Request,Long> {
    Optional<Request> findByID(Integer ID);
    String findByUsername(String username);
}
