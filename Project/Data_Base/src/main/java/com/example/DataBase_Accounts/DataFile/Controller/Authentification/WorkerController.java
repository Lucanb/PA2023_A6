package com.example.DataBase_Accounts.DataFile.Controller.Authentification;


import com.example.DataBase_Accounts.DataFile.DataUser.Worker;
import com.example.DataBase_Accounts.DataFile.Service.Authentification.WorkerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkerController {
    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    /*
   @GetMapping("")
   public String index()
   {
       return "index";
   }

 */

//    @GetMapping("/registerWorker")
//    public String getRegister(){
//        return "registerWorker";
//    }

    @GetMapping("/registerWorker")
    public String getRegister(Model model){
        model.addAttribute("registerRequest",new Worker());
        return "registerWorker";
    }

    @GetMapping("/loginWorker")
    public String getLogin(Model mode){
        mode.addAttribute("loginRequest",new Worker());
        return "loginWorker";
    }

    @PostMapping("/registerWorker")
    public String register(@ModelAttribute Worker worker) {
        System.out.println(worker);
        Worker registeredUser = workerService.registerUser(worker.getUsername(), worker.getFirstName(), worker.getLastName(), worker.getPassword(),
                worker.getEmail(), worker.getCnp(), worker.getPhone(), worker.getAddress());
        return registeredUser == null ? "error_page" : "redirect:/loginWorker";
    }

    @PostMapping("/loginWorker")
    public String login(@ModelAttribute Worker worker, Model model){
        System.out.println(worker);
        Worker authenticated = workerService.authenticate(worker.getUsername(),worker.getPassword());
        if(authenticated != null){
            model.addAttribute("userLogin",authenticated.getUsername());
            return "redirect:/WorkerPage";
        }
        else
        {
            return "redirect:/error_page";
        }
    }

    @GetMapping("/WorkerPage")
    public String getWorker_Page()
    {
        return "/WorkerPage";
    }
}
