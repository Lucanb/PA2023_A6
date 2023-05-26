DROP TABLE Clients;
CREATE TABLE Clients
(
    codPartener  INT NOT NULL,
    nrContract   INT NOT NULL,
    firstName    VARCHAR(50),
    lastName     VARCHAR(50),
    nrRate       VARCHAR(50),
    credit       VARCHAR(50),
    dataAcordata DATE,
    dataRata1    DATE,
    dataPlata    DATE,
    dataPen      DATE,
    ziaUrmarire  DATE,
    sold         NUMBER(5,2),
    soldPenal    NUMBER(5,2),
    dobRest      NUMBER(5,2),
    toatalPenal  NUMBER(5,2),
    obiect       INT,
    typeCredit   VARCHAR(50),
    Dpan         FLOAT,
    CONSTRAINT fk_Clients FOREIGN KEY (codPartener) REFERENCES Parteners(PartenerID),
    CONSTRAINT pk_Clients PRIMARY KEY (nrContract)
);

-- Path: SQL_DEVELOPPER_FILES\CreateRecipts.sql