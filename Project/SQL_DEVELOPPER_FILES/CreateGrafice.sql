

DROP TABLE GRAFICE;
CREATE TABLE Grafice (
    nrContract INT NOT NULL,
    dataRata DATE NOT NULL,
    valoareRata Number(10,2) NOT NULL,
    rataDobanda Number(10,2) NOT NULL,
    sold Number(10,2) NOT NULL,
    IND INT NOT NULL,
    CONSTRAINT grafice_fk FOREIGN KEY (nrContract) REFERENCES  CLIENTS(nrContract)
);