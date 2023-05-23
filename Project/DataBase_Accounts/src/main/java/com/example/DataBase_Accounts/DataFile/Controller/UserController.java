package com.example.DataBase_Accounts.DataFile.Controller;

import com.example.DataBase_Accounts.DataFile.Auth.entities.User;
import com.example.DataBase_Accounts.DataFile.Service.UserService;
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

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        User registeredUser = userService.registerUser(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getAddress()
                , user.getEmail(), user.getCnp(), user.getPhone());
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

}
