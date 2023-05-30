package com.example.DataBase_Accounts.DataFile.DataUser;

import java.util.Date;

public class Client {
    private Integer codPartener;
    private Integer nrContract;
    private String firstName;
    private String lastName;
    private String nrRate;
    private String credit;
    private Date dataAcordata;
    private Date dataRata1;
    private Date dataPlata;
    private Date dataPen;
    private Date ziaUrmarire;
    private Double sold;
    private Double soldPenal;
    private Double dobRest;
    private Double toatalPenal;
    private Integer obiect;
    private String typeCredit;
    private Float Dpan;
    //setters and getters

    public Integer getCodPartener() {
        return codPartener;
    }

    public void setCodPartener(Integer codPartener) {
        this.codPartener = codPartener;
    }

    public Integer getNrContract() {
        return nrContract;
    }

    public void setNrContract(Integer nrContract) {
        this.nrContract = nrContract;
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
    public String getNrRate() {
        return nrRate;
    }

    public void setNrRate(String nrRate) {
        this.nrRate = nrRate;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Date getDataAcordata() {
        return dataAcordata;
    }

    public void setDataAcordata(Date dataAcordata) {
        this.dataAcordata = dataAcordata;
    }

    public Date getDataRata1() {
        return dataRata1;
    }

    public void setDataRata1(Date dataRata1) {
        this.dataRata1 = dataRata1;
    }

    public Date getDataPlata() {
        return dataPlata;
    }

    public void setDataPlata(Date dataPlata) {
        this.dataPlata = dataPlata;
    }

    public Date getDataPen() {
        return dataPen;
    }

    public void setDataPen(Date dataPen) {
        this.dataPen = dataPen;
    }

    public Date getZiaUrmarire() {
        return ziaUrmarire;
    }

    public void setZiaUrmarire(Date ziaUrmarire) {
        this.ziaUrmarire = ziaUrmarire;
    }

    public Double getSold() {
        return sold;
    }

    public void setSold(Double sold) {
        this.sold = sold;
    }

    public Double getSoldPenal() {
        return soldPenal;
    }

    public void setSoldPenal(Double soldPenal) {
        this.soldPenal = soldPenal;
    }

    public Double getDobRest() {
        return dobRest;
    }

    public void setDobRest(Double dobRest) {
        this.dobRest = dobRest;
    }

    public Double getToatalPenal() {
        return toatalPenal;
    }

    public void setToatalPenal(Double toatalPenal) {
        this.toatalPenal = toatalPenal;
    }

    public Integer getObiect() {
        return obiect;
    }

    public void setObiect(Integer obiect) {
        this.obiect = obiect;
    }

    public String getTypeCredit() {
        return typeCredit;
    }

    public void setTypeCredit(String typeCredit) {
        this.typeCredit = typeCredit;
    }

    public Float getDpan() {
        return Dpan;
    }

    public void setDpan(Float Dpan) {
        this.Dpan = Dpan;
    }

    //Constructor
    public Client(Integer codPartener, Integer nrContract, String firstName, String lastName, String CNP, String nrRate, String credit, Date dataAcordata, Date dataRata1, Date dataPlata, Date dataPen) {
        this.codPartener = codPartener;
        this.nrContract = nrContract;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nrRate = nrRate;
        this.credit = credit;
        this.dataAcordata = dataAcordata;
        this.dataRata1 = dataRata1;
        this.dataPlata = dataPlata;
        this.dataPen = dataPen;
        this.ziaUrmarire = ziaUrmarire;
        this.sold = sold;
        this.soldPenal = soldPenal;
        this.dobRest = dobRest;
        this.toatalPenal = toatalPenal;
        this.obiect = obiect;
        this.typeCredit = typeCredit;
        this.Dpan = Dpan;
    }
}