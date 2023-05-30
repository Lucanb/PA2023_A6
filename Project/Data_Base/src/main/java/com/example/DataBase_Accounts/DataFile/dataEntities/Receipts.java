package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name="RECIPES",uniqueConstraints = {
        @UniqueConstraint(columnNames = "CONTRACTNUMBER"),
        @UniqueConstraint(columnNames = "ID")
})
public class Receipts {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer ID;

    @Column(name="CONTRACTNUMBER")
    private Integer contractNumber;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "IDENTIFICATIONCODE")
    private String identificationCode;

    @Column(name = "PENAl")
    private Double penal;

    @Column(name="RESTDOBANDA")
    private Double restDobanda;

    @Column(name = "DOBANDA")
    private Double Dobanda;

    @Column(name = "RATA")
    private Double Rata;

    @Column(name="TOTAL")
    private Double Total;

    @Column(name = "DATA")
    private Date date;

    @Column(name="SOLDINITIAL")
    private Double soldInit;

    @Column(name="CC")
    private Integer CC;

    @Column(name="CONT")
    private Integer cont;

    @Column(name="JUDGEPRICE")
    private Double judgePrice;

    @Column(name="SIT")
    private String SIT;

    @Column(name="OBJECT")
    private Integer object;

    @Column(name="DOCNUMBER")
    private Integer docNumber;

}
