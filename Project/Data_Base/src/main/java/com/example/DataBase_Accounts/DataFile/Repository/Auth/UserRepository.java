package com.example.DataBase_Accounts.DataFile.Repository.Auth;

import com.example.DataBase_Accounts.DataFile.Auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByUsernameAndPassword(String username, String password);
   Optional<User> findByUsername(String username);
}