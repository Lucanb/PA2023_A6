package com.example.DataBase_Accounts.DataFile.Repository.Auth;

import com.example.DataBase_Accounts.DataFile.DataUser.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin> findByUsernameAndPassword(String username, String password);
    Optional<Admin> findByUsername(String username);
}
