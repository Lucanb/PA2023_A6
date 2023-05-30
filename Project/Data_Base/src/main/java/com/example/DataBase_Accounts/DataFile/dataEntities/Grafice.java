package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name="GRAFICE",uniqueConstraints = {
        @UniqueConstraint(columnNames = "NRCONTRACT"),
        @UniqueConstraint(columnNames = "ID")
})
public class Grafice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ID;

    @Column(name = "NRCONTRACT")
    private Integer nrContract;

    @Column(name = "DATARATA")
    private Date dataRata;

    @Column(name = "VALOARERATA")
    private Double valoareRata;

    @Column(name = "RATADOBANDA")
    private Double rataDobanda;

    @Column(name = "SOLD")
    private Double sold;

    @Column(name="IND")
    private Integer IND;
}
