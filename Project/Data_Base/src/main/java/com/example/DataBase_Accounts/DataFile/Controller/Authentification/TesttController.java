package com.example.DataBase_Accounts.DataFile.Controller.Authentification;


import com.example.DataBase_Accounts.DataFile.Service.HistoryService;
import com.example.DataBase_Accounts.DataFile.Service.TesttService;
import com.example.DataBase_Accounts.DataFile.dataEntities.History;
import com.example.DataBase_Accounts.DataFile.dataEntities.TestCred;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
@Controller
public class TesttController {
    @Autowired
    private TesttService testtService;
//    @GetMapping("/History")
//    public String getHistory(Model model) {
//          List<TestCred> testts = testtService.getAll();
//          model.addAttribute("tests",testts);
//        return "History";
//    }
    @GetMapping("/testt")
    @ResponseBody
    public List<TestCred> getHistory(){
            return  testtService.getAll();
     }
}
