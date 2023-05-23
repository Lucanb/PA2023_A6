package com.example.DataBase_Accounts.DataFile.dataEntities;

import java.util.Date;

public class Receipts {
    private Integer contractNumber;
    private String firstName;
    private String lastName;
    private String identificationCode;
    private Double penal;
    private Double restDobanda;
    private Double Dobanda;
    private Double Rata;
    private Double Total;
    private Date date;
    private Double soldInit;
    private Integer CC;
    private Integer cont;
    private Double judgePrice;
    private String SIT;
    private Integer object;
    private Integer docNumber;

    //get+setters
    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public Double getPenal() {
        return penal;
    }

    public void setPenal(Double penal) {
        this.penal = penal;
    }

    public Double getRestDobanda() {
        return restDobanda;
    }

    public void setRestDobanda(Double restDobanda) {
        this.restDobanda = restDobanda;
    }

    public Double getDobanda() {
        return Dobanda;
    }

    public void setDobanda(Double Dobanda) {
        this.Dobanda = Dobanda;
    }

    public Double getRata() {
        return Rata;
    }

    public void setRata(Double Rata) {
        this.Rata = Rata;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getSoldInit() {
        return soldInit;
    }

    public void setSoldInit(Double soldInit) {
        this.soldInit = soldInit;
    }

    public Integer getCC() {
        return CC;
    }

    public void setCC(Integer CC) {
        this.CC = CC;
    }

    public Integer getCont() {
        return cont;
    }

    public void setCont(Integer cont) {
        this.cont = cont;
    }

    public Double getJudgePrice() {
        return judgePrice;
    }

    public void setJudgePrice(Double judgePrice) {
        this.judgePrice = judgePrice;
    }

    public String getSIT() {
        return SIT;
    }

    public void setSIT(String SIT) {
        this.SIT = SIT;
    }

    public Integer getObject() {
        return object;
    }

    public void setObject(Integer object) {
        this.object = object;
    }

    public Integer getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(Integer docNumber) {
        this.docNumber = docNumber;
    }

    //Constructor
    public Receipts(Integer contractNumber, String firstName, String lastName, String identificationCode, Double penal, Double restDobanda, Double Dobanda, Double Rata, Double Total, Date date, Double soldInit, Integer CC, Integer cont
            , Double judgePrice, String SIT, Integer object, Integer docNumber) {
        this.contractNumber = contractNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationCode = identificationCode;
        this.penal = penal;
        this.restDobanda = restDobanda;
        this.Dobanda = Dobanda;
        this.Rata = Rata;
        this.Total = Total;
        this.date = date;
        this.soldInit = soldInit;
        this.CC = CC;
        this.cont = cont;
        this.judgePrice = judgePrice;
        this.SIT = SIT;
        this.object = object;
        this.docNumber = docNumber;
    }

    @Override
    public String toString() {
        return "Receipts{" +
                "contractNumber=" + contractNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationCode='" + identificationCode + '\'' +
                ", penal=" + penal +
                ", restDobanda=" + restDobanda +
                ", Dobanda=" + Dobanda +
                ", Rata=" + Rata +
                ", Total=" + Total +
                ", date=" + date +
                ", soldInit=" + soldInit +
                ", CC=" + CC +
                ", cont=" + cont +
                ", judgePrice=" + judgePrice +
                ", SIT='" + SIT + '\'' +
                ", object=" + object +
                ", docNumber=" + docNumber +
                '}';
    }
}
