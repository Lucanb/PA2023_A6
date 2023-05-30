//package com.example.DataBase_Accounts.DataFile.Controller;


import com.example.DataBase_Accounts.DataFile.Auth.entities.User;
import com.example.DataBase_Accounts.DataFile.Service.Authentification.UserService;
import com.example.DataBase_Accounts.DataFile.Service.RequestService;
import com.example.DataBase_Accounts.DataFile.dataEntities.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/*
@Controller
public class RequestController {
    private final RequestService requestService;

    RequestController(RequestService requestService)
    {
        this.requestService=requestService;
    }

    @GetMapping("/descriptionForm")
    public String getDescriptionForm() {
        return "descriptionForm";
    }

    @PostMapping("/descriptionForm")
    public void saveMessage(@ModelAttribute Request request, Model model) {
        System.out.println(request);
        String authenticated = requestService.ShowRequest(request.getUsername());
        if(authenticated != null)
        {
            System.out.println(authenticated);
        }
        else
        {
            System.out.println("failure");
        }
    }
}

 */