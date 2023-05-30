package com.example.DataBase_Accounts.DataFile.Controller.Authentification;


import com.example.DataBase_Accounts.DataFile.DataUser.Admin;
import com.example.DataBase_Accounts.DataFile.Service.Authentification.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
  private final AdminService adminService;
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    /*
   @GetMapping("")
   public String index()
   {
       return "index";
   }

 */

    @GetMapping("/registerAdmin")
    public String getRegister(org.springframework.ui.Model model){
        model.addAttribute("registerRequest",new Admin());
        return "registerAdmin";
    }

    @GetMapping("/loginAdmin")
    public String getLogin(org.springframework.ui.Model mode){
        mode.addAttribute("loginRequest",new Admin());
        return "loginAdmin";
    }

    @PostMapping("/registerAdmin")
    public String register(@ModelAttribute Admin admin) {
        System.out.println(admin);
        Admin registeredUser = adminService.registerUser(admin.getUsername(), admin.getFirstName(), admin.getLastName(), admin.getPassword(),
                admin.getEmail(), admin.getCnp(), admin.getPhone(), admin.getAddress());
        return registeredUser == null ? "error_page" : "redirect:/loginAdmin";
    }

    @PostMapping("/loginAdmin")
    public String login(@ModelAttribute Admin admin, Model model){
        System.out.println(admin);
        Admin authenticated = adminService.authenticate(admin.getUsername(),admin.getPassword());
        if(authenticated != null){
            model.addAttribute("userLogin",authenticated.getUsername());
            return "redirect:/Admin_Page";
        }
        else
        {
            return "redirect:/error_page";
        }
    }

    @GetMapping("/AdminPage")
    public String getUser_Page()
    {
        return "AdminPage";
    }
}
