package com.parishjain.RestaurantManageApplication.models;

public class Restaurant {

    private String restID;
    private String restName;
    private String restAddress;
    private String restContactNum;
    private String restSpeciality;
    private String restEmail;

    public String getRestID() {
        return restID;
    }

    public void setRestID(String restID) {
        this.restID = restID;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    public String getRestContactNum() {
        return restContactNum;
    }

    public void setRestContactNum(String restContactNum) {
        this.restContactNum = restContactNum;
    }

    public String getRestSpeciality() {
        return restSpeciality;
    }

    public void setRestSpeciality(String restSpeciality) {
        this.restSpeciality = restSpeciality;
    }

    public String getRestEmail() {
        return restEmail;
    }

    public void setRestEmail(String restEmail) {
        this.restEmail = restEmail;
    }

    public Restaurant(String restID, String restName, String restAddress, String restContactNum, String restSpeciality, String restEmail) {
        this.restID = restID;
        this.restName = restName;
        this.restAddress = restAddress;
        this.restContactNum = restContactNum;
        this.restSpeciality = restSpeciality;
        this.restEmail = restEmail;
    }
}
