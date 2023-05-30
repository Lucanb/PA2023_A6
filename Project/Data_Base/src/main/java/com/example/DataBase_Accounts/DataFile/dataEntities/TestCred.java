package com.example.DataBase_Accounts.DataFile.dataEntities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
@NoArgsConstructor
@Entity
@Table(name="TEST_RECOMAND_CREDIT",uniqueConstraints = {
        @UniqueConstraint(columnNames = "NRCONTRACT")
})
public class TestCred {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer NRCONTRACT;

    @Column(name = "TYPECREDIT")
    @BatchSize(size=50)
    private String TYPECREDIT;

    @Column(name = "CREDIT")
    private Integer CREDIT;

    @Override
    public String toString() {
        return "TestCred{" +
                "NRCONTRACT=" + NRCONTRACT +
                ", TYPECREDIT='" + TYPECREDIT + '\'' +
                ", CREDIT=" + CREDIT +
                '}';
    }
}
