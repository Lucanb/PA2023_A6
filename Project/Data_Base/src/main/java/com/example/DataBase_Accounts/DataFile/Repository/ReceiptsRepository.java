package com.example.DataBase_Accounts.DataFile.Repository;

import com.example.DataBase_Accounts.DataFile.dataEntities.Receipts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptsRepository extends JpaRepository<Receipts,Long> {

}
