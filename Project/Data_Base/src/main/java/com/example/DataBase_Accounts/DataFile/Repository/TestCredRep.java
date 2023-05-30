package com.example.DataBase_Accounts.DataFile.Repository;

import com.example.DataBase_Accounts.DataFile.dataEntities.History;
import com.example.DataBase_Accounts.DataFile.dataEntities.TestCred;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TestCredRep  extends JpaRepository<TestCred,Long> {
    Optional<History> findByNRCONTRACT(Integer NRCONTRACT);
    // Optional<History> findByNameAndIDPARTENER(Integer ID);
    // Optional<History> findByID(UUID ID);

    Optional<History> findByTYPECREDIT(String TYPECREDIT);
    // Optional<History> findByIDPARTENER(UUID ID);
    //  Optional<History> findAllByID(UUID ID);
}
