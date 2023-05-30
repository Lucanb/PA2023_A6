package com.example.DataBase_Accounts.DataFile.Repository.Auth;

import com.example.DataBase_Accounts.DataFile.DataUser.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    Optional<Worker> findByUsernameAndPassword(String username, String password);

    Optional<Worker> findByUsername(String username);
}