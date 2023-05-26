--take name of the Recipts class atributes
DROP TABLE Recipes;
CREATE TABLE Recipes(
    contractNumber INT NOT NULL,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    identificationCode VARCHAR(50),
    penal NUMBER(5,2),
    restDobanda NUMBER(5,2),
    dobanda NUMBER(5,2),
    rata NUMBER(5,2),
    total NUMBER(5,2),
    data DATE,
    soldInitial NUMBER(5,2),
    CC INT NOT NULL,
    cont INT NOT NULL,
    judgePrice NUMBER(5,2),
    SIT VARCHAR(50),
    object INT NOT NULL,
    docNumber INT NOT NULL,
    CONSTRAINT fk_Recipts1 FOREIGN KEY (contractNumber) REFERENCES CLIENTS(NRCONTRACT)
);