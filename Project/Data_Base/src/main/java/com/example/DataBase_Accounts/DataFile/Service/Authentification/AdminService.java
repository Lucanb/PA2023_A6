package com.example.DataBase_Accounts.DataFile.Service.Authentification;

import com.example.DataBase_Accounts.DataFile.DataUser.Admin;
import com.example.DataBase_Accounts.DataFile.Repository.Auth.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin registerUser(String username, String firstName, String lastName, String password,
                              String email, String cnp, String phone, String address) {
        ///De adaugat conditia:
        if (username == null || username.isEmpty() || password == null || password.isEmpty() || email == null ||
                email.isEmpty() || cnp == null || cnp.isEmpty() || phone == null || phone.isEmpty() ||
                address == null || address.isEmpty()) {
            System.out.println("Camere nu sunt completate");
            return null;
        }

        if (adminRepository.findByUsername(username).isPresent()) {
            System.out.println("Username deja existent");
            return null;
        }
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setFirstName(firstName);
        admin.setLastName(lastName);
        admin.setPassword(password);
        admin.setEmail(email);
        admin.setCnp(cnp);
        admin.setPhone(phone);
        admin.setAddress(address);
        //user.setRole(Role); aici vezi rolul:
        // user.setRole(Role.rolesPermissions.GUEST);
        System.out.println(admin);
        return adminRepository.save(admin);
    }

    public Admin authenticate(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
}
