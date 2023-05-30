package com.example.DataBase_Accounts.DataFile.Service.Authentification;

import com.example.DataBase_Accounts.DataFile.Auth.entities.User;
import com.example.DataBase_Accounts.DataFile.Repository.Auth.UserRepository;
import org.springframework.stereotype.Service;
//import com.example.DataBase_Accounts.DataFile.Auth.entities.Role;

@Service
public class UserService {

private final UserRepository userRepository;

public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        }

public User registerUser(String username, String firstName, String lastName, String password,
                         String email,String cnp, String phone, String address){
    ///De adaugat conditia:
    if(username == null || username.isEmpty() || password == null || password.isEmpty() || email == null ||
            email.isEmpty() || cnp == null || cnp.isEmpty() || phone == null || phone.isEmpty() ||
            address == null || address.isEmpty()){
        System.out.println("Camere nu sunt completate");
        return null;
    }

    if(userRepository.findByUsername(username).isPresent()){
        System.out.println("Username deja existent");
        return null;
    }
        User user = new User();
        user.setUsername(username);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setEmail(email);
        user.setCnp(cnp);
        user.setPhone(phone);
        user.setAddress(address);
        //user.setRole(Role); aici vezi rolul:
       // user.setRole(Role.rolesPermissions.GUEST);
        System.out.println(user);
        return userRepository.save(user);
   }
   public User authenticate(String username, String password){
        return userRepository.findByUsernameAndPassword(username, password).orElse(null);
   }
}
