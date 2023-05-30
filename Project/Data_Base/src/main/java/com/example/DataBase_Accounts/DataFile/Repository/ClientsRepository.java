package com.example.DataBase_Accounts.DataFile.Repository;

import com.example.DataBase_Accounts.DataFile.dataEntities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients,Long> {
}
