package com.example.DataBase_Accounts.DataFile.DataUser;
import com.example.DataBase_Accounts.DataFile.Auth.entities.User;
import com.example.DataBase_Accounts.DataFile.DataUser.Admin;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@NoArgsConstructor
@Entity
@Table(name = "admins")
@PrimaryKeyJoinColumn(name = "id")
@OnDelete(action = OnDeleteAction.CASCADE)
public class Admin extends User {

  public Admin(String username, String firstName, String lastName, String password, String email, String phone, String address, String cnp, boolean deleted) {
    super(username, firstName, lastName, password, email, phone, address, cnp, deleted);
  }
}
