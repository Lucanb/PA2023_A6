package com.example.DataBase_Accounts.DataFile.Service;


import com.example.DataBase_Accounts.DataFile.Repository.HistoryRepository;
import com.example.DataBase_Accounts.DataFile.dataEntities.History;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryService {
    private final HistoryRepository historyRepository;

    public HistoryService(HistoryRepository historyRepository)
    {
        this.historyRepository=historyRepository;
    }

    public List<History> getAll()
    {
        //return historyRepository.findByName("Ion");
        return historyRepository.findAll();
    }
}