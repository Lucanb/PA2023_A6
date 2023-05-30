package com.example.DataBase_Accounts.DataFile.Service;

import com.example.DataBase_Accounts.DataFile.Repository.Auth.UserRepository;
import com.example.DataBase_Accounts.DataFile.Repository.RequestRepository;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    RequestService(RequestRepository requestRepository)
    {
        this.requestRepository=requestRepository;
    }
    public String ShowRequest(String UserName)
    {
        return requestRepository.findByUsername(UserName);
    }
}
