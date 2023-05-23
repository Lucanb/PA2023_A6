package com.example.DataBase_Accounts.DataFile.Auth.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Calendar;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name = "password_reset_token")
public class PassWordReset {
    private static final int timeExpiration = 10;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String token;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    private Date expiryDate;

    public PassWordReset(User user,String token) {
        this.user = user;
        this.token = token;
        this.expiryDate = calculateExpiryDate(timeExpiration);
    }

    private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }

}
