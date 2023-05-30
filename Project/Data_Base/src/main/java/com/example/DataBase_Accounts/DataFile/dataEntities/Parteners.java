package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name="PARTENERS",uniqueConstraints = {
        @UniqueConstraint(columnNames = "PARTENERID")
})
public class Parteners {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer PARTENERID;

    @Column(name="Name")
    private String Name;

   @Column(name = "FONDMUTUAL")
    private Float donatedFond;

    @Column(name = "FONDSOCIAL")
    private Double socialFond;

    @Column(name = "DATA")
    private Date data;

    @Column(name="ADDRESS")
    private String address;

   @Column(name = "IDENT")
    private String identificationCode; //dupa asta daca e juridica -> identific persoanele ce o alcatuiesc

    @Column(name = "PERSTYPE")
    private String personType; // J-juridic ; F-fizic

    @Column(name="CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name="EMAIL")
    private String email;


    @Column(name = "PHONE")
    private String phone;

}
