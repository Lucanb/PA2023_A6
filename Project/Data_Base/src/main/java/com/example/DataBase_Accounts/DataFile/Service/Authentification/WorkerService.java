package com.example.DataBase_Accounts.DataFile.Service.Authentification;

import com.example.DataBase_Accounts.DataFile.DataUser.Worker;
import com.example.DataBase_Accounts.DataFile.Repository.Auth.WorkerRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
    private final WorkerRepository workerRepository;
    WorkerService(WorkerRepository workerRepository){
        this.workerRepository = workerRepository;
    }
    public Worker registerUser(String username, String firstName, String lastName, String password,
                               String email, String cnp, String phone, String address){
        ///De adaugat conditia:
        if(username == null || username.isEmpty() || password == null || password.isEmpty() || email == null ||
                email.isEmpty() || cnp == null || cnp.isEmpty() || phone == null || phone.isEmpty() ||
                address == null || address.isEmpty()){
            System.out.println("Camere nu sunt completate");
            return null;
        }

        if(workerRepository.findByUsername(username).isPresent()){
            System.out.println("Username deja existent");
            return null;
        }
        Worker worker = new Worker();
        worker.setUsername(username);
        worker.setFirstName(firstName);
        worker.setLastName(lastName);
        worker.setPassword(password);
        worker.setEmail(email);
        worker.setCnp(cnp);
        worker.setPhone(phone);
        worker.setAddress(address);
        //user.setRole(Role); aici vezi rolul:
        // user.setRole(Role.rolesPermissions.GUEST);
        System.out.println(worker);
        return workerRepository.save(worker);
    }
    public Worker authenticate(String username, String password){
        return workerRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
}
