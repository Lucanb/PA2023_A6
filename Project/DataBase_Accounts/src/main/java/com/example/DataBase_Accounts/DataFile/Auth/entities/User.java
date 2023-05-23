package com.example.DataBase_Accounts.DataFile.Auth.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.Objects;
import java.util.UUID;
@Data
@NoArgsConstructor
@Entity
@Table(name = "users",
uniqueConstraints = {
        @UniqueConstraint(columnNames = "EMAIL"),
        @UniqueConstraint(columnNames = "CNP"),
})

@Inheritance(strategy = InheritanceType.JOINED)
@Where(clause = "deleted=false")
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE id = ?")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    @BatchSize(size = 100)
    @Column(name="ADDRESS")
    private String address;

    @NotBlank
    @Size(max = 100)
    @Column(name="CNP")
    private String cnp;

    @JsonIgnore
    @Column(name="deleted")
    private boolean deleted;

    @NotBlank
    @Size(max = 100)
    // @Email
    @Column(name="EMAIL")
    private String email;

    @NotBlank
    @Column(name="FIRST_NAME")
    private String firstName;

    @JsonIgnore
    @Column(name="IS_ACTIVE")
    boolean isActive;

    @NotBlank
    @Column(name="LAST_NAME")
    private String lastName;

    @NotBlank
    @Size(max = 100)
    @JsonIgnore
    @Column(name="PASSWORD")
    private String password;

    @NotBlank
    @Size(max = 100)
    @Column(name="PHONE")
    private String phone;

    @NotBlank
    @Column(name="USERNAME", unique = true)
    private String username;


   // @OneToOne(targetEntity = Role.class, fetch = FetchType.EAGER)
  //  @JoinColumn(nullable = false, name = "role_id")
  //  private Role.rolesPermissions role;
    public User(String username, String firstName, String lastName, String password, String email,String cnp, String phone, String address
            , boolean isActive){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isActive = isActive;
        this.cnp = cnp;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return deleted == user.deleted && isActive == user.isActive && Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(password, user.password) && Objects.equals(cnp, user.cnp) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone) && Objects.equals(address, user.address); //&& Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, password, cnp, email, phone, address,  deleted, isActive);//,role,);
    }
}
