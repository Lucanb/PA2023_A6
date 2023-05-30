package com.example.DataBase_Accounts.DataFile.Repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface FunctionsRepository {
    @Procedure(name="ASOCIATI_INSERT")
    String asocInsert(@Param("NNAME1") String Name1, @Param("NNAME2") String Name2, @Param("IDD1") Integer ID1, @Param("IDD2") Integer ID2);

    @Procedure(name="EXPORT_DATA_TO_CSV")
    String ExportMyData(@Param("FILENAME")String fileName);

    @Procedure(name = "RELATED_ELEMENTS")
    String realtedElements(@Param("NUMBEREL")Integer num,@Param("IDD") Integer id);

    @Procedure(name="RECOMMEND_CREDIT")
    String recommendCredit(@Param("USER_ID")Integer ID);
}
