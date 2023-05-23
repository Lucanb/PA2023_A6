package com.example.DataBase_Accounts.DataFile.dataEntities;

import java.util.Date;

public class Parteners {
    private int id;
    private String lastName;
    private String firstName;

    //   private String username;

    private Double donatedFond;
    private Double socialFond;

    private Date data;

    private String address;

    private String identificationCode; //dupa asta daca e juridica -> identific persoanele ce o alcatuiesc

    private String personType; // J-juridic ; F-fizic

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getDonatedFond() {
        return donatedFond;
    }

    public void setDonatedFond(Double donatedFond) {
        this.donatedFond = donatedFond;
    }

    public Double getSocialFond() {
        return socialFond;
    }

    public void setSocialFond(Double socialFond) {
        this.socialFond = socialFond;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;

    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    @Override
    public String toString() {
        return "Parteners{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", donatedFond=" + donatedFond +
                ", socialFond=" + socialFond +
                ", data=" + data +
                ", address='" + address + '\'' +
                ", identificationCode='" + identificationCode + '\'' +
                ", personType='" + personType + '\'' +
                '}';
    }
}
