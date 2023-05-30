package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name="HISTORY",uniqueConstraints = {
        @UniqueConstraint(columnNames = "PARTENERID")
})

public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ID;

    @BatchSize(size=200)
    @Column(name="NAME")
    private String name;


    @Column(name = "PRICE")
    private Float price;

    @Column(name = "PARTENERID")
    private Integer IDPARTENER;

    @Column(name = "DATA")
    private Date data;
}
