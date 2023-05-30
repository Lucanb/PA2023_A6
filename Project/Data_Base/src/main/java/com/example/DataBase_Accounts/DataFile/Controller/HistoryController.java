package com.example.DataBase_Accounts.DataFile.Controller;


import com.example.DataBase_Accounts.DataFile.Service.HistoryService;
import com.example.DataBase_Accounts.DataFile.dataEntities.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/History")
    public String getInterface()
    {
       // return "index2";
        return "History";
    }
   /* @GetMapping("/History")
    public String getHistory(Model model) {
      //  List<History> histories = historyService.getAll();
      //  model.addAttribute("histories",histories);
        return "History";
    }
    */
    @GetMapping("/graphics")
    public String getChart()
    {
        return "graphics";
    }
}
