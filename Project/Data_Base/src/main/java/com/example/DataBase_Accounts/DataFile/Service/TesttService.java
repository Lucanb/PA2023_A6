package com.example.DataBase_Accounts.DataFile.Service;

import com.example.DataBase_Accounts.DataFile.Repository.HistoryRepository;
import com.example.DataBase_Accounts.DataFile.Repository.TestCredRep;
import com.example.DataBase_Accounts.DataFile.dataEntities.History;
import com.example.DataBase_Accounts.DataFile.dataEntities.TestCred;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesttService {
    private final TestCredRep testCredRep;

    public TesttService(TestCredRep testCredRep)
    {
        this.testCredRep=testCredRep;
    }

    public List<TestCred> getAll()
    {
        //return historyRepository.findByName("Ion");
        return testCredRep.findAll();
    }
}
