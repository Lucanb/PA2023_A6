package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Requests",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "USERNAME"),
                @UniqueConstraint(columnNames = "ID"),
        })
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ID;

    @Column(name = "NAME")
    private String name;

    @Column(name="FIRSTNAME")
    private String firstname;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "MESSAGE")
    private String message;
}
