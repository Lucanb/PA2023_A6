package com.example.DataBase_Accounts.DataFile.Controller.Authentification;

import com.example.DataBase_Accounts.DataFile.Auth.entities.User;
import com.example.DataBase_Accounts.DataFile.Service.Authentification.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*
   @GetMapping("")
   public String index()
   {
       return "index";
   }

 */

    //FUNCTIONEAZA!
//@GetMapping("/index2")
//public String getIndexx()
//{
//    return "index2";
//}
//
//@GetMapping("/_layout")
//public String getLayout()
//{
//    return "_layout";
//}


    @GetMapping("/register")
    public String getRegister(Model model){
        model.addAttribute("registerRequest",new User());
        return "register";
    }

    @GetMapping("/login")
    public String getLogin(Model mode){
        mode.addAttribute("loginRequest",new User());
        return "login";
    }

    @GetMapping("/descriptionForm")
    public String getDescriptionForm() {
        return "descriptionForm";
    }
    @GetMapping("/User_Page")
    public String getUser_Page()
    {
        return "User_Page";
    }

    @GetMapping("/Creditors")
    public String getCreditors_Page()
    {
        return "Creditors";
    }
    @GetMapping("/Debts")
    public String getDebts()
    {
        return "Debts";
    }

    @GetMapping("/Contact")
    public String getContact()
    {
        return "Contact";
    }

//    @GetMapping("/History")
//    public String getHistory()
//    {
//        return "History";
//    }

    @GetMapping("/error_page")
    public String getError_page(){
        return "error_page";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        User registeredUser = userService.registerUser(user.getUsername(), user.getFirstName(), user.getLastName(), user.getPassword(),
                user.getEmail(), user.getCnp(), user.getPhone(), user.getAddress());
        return registeredUser == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user,Model model){
        System.out.println(user);
        User authenticated = userService.authenticate(user.getUsername(),user.getPassword());
       if(authenticated != null){
           model.addAttribute("userLogin",authenticated.getUsername());
           return "redirect:/User_Page";
       }
       else
       {
          return "redirect:/error_page";
       }
    }

    @PostMapping("/descriptionForm")
    public  String saveMessage(@ModelAttribute User user,Model model) {
        System.out.println(user);
        User authenticated = userService.authenticate(user.getUsername(),user.getPassword());
        if(authenticated != null)
        {
           // User registeredUser = userService.registerUser(user.getUsername(), user.getFirstName(), user.getLastName(), user.getPassword(),
            //        user.getEmail(), user.getCnp(), user.getPhone(), user.getAddress());
            return "redirect:/User_Page";
        }
    else
        {
            return "redirect:/error_page";
        }
    }
}
