package com.example.DataBase_Accounts.DataFile.dataEntities;

import java.util.Date;



public class Clients {
    private Integer id; //id dar e un fel de foreign key al partenerilor;
    private Integer contractNumber;
    private String lastName;
    private String firstName;
    private Integer ratesNumber;
    private Double creditValue;

    private Date dataAcord;
    private Date dataScadenta;
    private Date dataPlata;
    private Date dataPenalisation;

    private Integer followDay;
    private Double sold;
    private Double restDobanda;
    private String creditType;
    private String address;
    private Integer contorParteners;

    //get
    private Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private Integer getContractNumber() {
        return contractNumber;
    }

    private void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getFirstName() {
        return firstName;

    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private Integer getRatesNumber() {
        return ratesNumber;
    }

    private void setRatesNumber(Integer ratesNumber) {
        this.ratesNumber = ratesNumber;
    }

    private Double getCreditValue() {
        return creditValue;
    }

    private void setCreditValue(Double creditValue) {
        this.creditValue = creditValue;
    }

    private Date getDataAcord() {
        return dataAcord;
    }

    private void setDataAcord(Date dataAcord) {
        this.dataAcord = dataAcord;
    }

    private Date getDataScadenta() {
        return dataScadenta;
    }

    private void setDataScadenta(Date dataScadenta) {
        this.dataScadenta = dataScadenta;
    }

    private Date getDataPlata() {
        return dataPlata;
    }

    private void setDataPlata(Date dataPlata) {
        this.dataPlata = dataPlata;
    }

    private Date getDataPenalisation() {
        return dataPenalisation;
    }

    private void setDataPenalisation(Date dataPenalisation) {
        this.dataPenalisation = dataPenalisation;
    }

    private Integer getFollowDay() {
        return followDay;
    }

    private void setFollowDay(Integer followDay) {
        this.followDay = followDay;
    }

    private Double getSold() {
        return sold;
    }

    private void setSold(Double sold) {
        this.sold = sold;
    }

    private Double getRestDobanda() {
        return restDobanda;
    }

    private void setRestDobanda(Double restDobanda) {
        this.restDobanda = restDobanda;
    }

    private String getCreditType() {
        return creditType;
    }

    private void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private Integer getContorParteners() {
        return contorParteners;
    }

    private void setContorParteners(Integer contorParteners) {
        this.contorParteners = contorParteners;
    }

    //constructor
    Clients(Integer id, Integer contractNumber, String lastName, String firstName, Integer ratesNumber, Double creditValue, Date dataAcord, Date dataScadenta, Date dataPlata, Date dataPenalisation, Integer followDay, Double
            sold, Double restDobanda, String creditType, String address, Integer contorParteners) {
        this.id = id;
        this.contractNumber = contractNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ratesNumber = ratesNumber;
        this.creditValue = creditValue;
        this.dataAcord = dataAcord;
        this.dataScadenta = dataScadenta;
        this.dataPlata = dataPlata;
        this.dataPenalisation = dataPenalisation;
        this.followDay = followDay;
        this.sold = sold;
        this.restDobanda = restDobanda;
        this.creditType = creditType;
        this.address = address;
        this.contorParteners = contorParteners;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", contractNumber=" + contractNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ratesNumber=" + ratesNumber +
                ", creditValue=" + creditValue +
                ", dataAcord=" + dataAcord +
                ", dataScadenta=" + dataScadenta +
                ", dataPlata=" + dataPlata +
                ", dataPenalisation=" + dataPenalisation +
                ", followDay=" + followDay +
                ", sold=" + sold +
                ", restDobanda=" + restDobanda +
                ", creditType='" + creditType + '\'' +
                ", address='" + address + '\'' +
                ", contorParteners=" + contorParteners +
                '}';
    }
}