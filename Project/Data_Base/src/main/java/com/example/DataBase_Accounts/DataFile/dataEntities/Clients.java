package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name="Clients",uniqueConstraints = {
        @UniqueConstraint(columnNames = "NRCONTRACT"),
        @UniqueConstraint(columnNames = "CODPARTENER")
})
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "NRCONTRACT")
    private Integer contractNumber;

    @Column(name="CODPARTENER")
    private Integer CODPARTENER;

    @BatchSize(size=50)
    @Column(name="NAME")
    private String Name;

    @BatchSize(size=50)
    @Column(name="NRRATE")
    private Integer ratesNumber;

   @Column(name = "CREDIT")
    private Float creditValue;

   @Column(name = "DATAACORDATA")
    private Date dataAcord;


    private Date dataScadenta;

    @Column(name="dataPlata")
    private Date dataPlata;

    @Column(name="ZIAURMARIRE")
    private Date followDay;

    @Column(name="SOLD")
    private Double sold;

    @Column(name="DOBREST")
    private Double restDobanda;

    @Column(name="DPAN")
    private Float DPAN;

    @Column(name="TYPECREDIT")
    private String creditType;


    @Column(name="TELEFON")
    private String Telefon;


    @Column(name = "CNP")
    private String CNP;

    @Column(name = "CUI")
    private String CUI;

    @Column(name="Obiect")
    private Integer Obiect;

}