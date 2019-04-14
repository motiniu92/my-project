package com.coderbd.pojo;

import java.sql.Date;

public class Patient {

    private int id;
    private String name;
    private int age;
    private String diseaseType;
    private String address;
    private Date admitedDate;
    private String mobile;
    private double payingBills;
    private Date releaseDate;    
    Medical medical;

    public Patient() {
    }

    public Patient(int id) {
        this.id = id;
    }

    public Patient(String name, int age, String diseaseType, String address, Date admitedDate, String mobile, double payingBills, Date releaseDate, Medical medical) {
        this.name = name;
        this.age = age;
        this.diseaseType = diseaseType;
        this.address = address;
        this.admitedDate = admitedDate;
        this.mobile = mobile;
        this.payingBills = payingBills;
        this.releaseDate = releaseDate;
        this.medical = medical;
    }

    public Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate, String mobile, double payingBills, Date releaseDate, Medical medical) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseaseType = diseaseType;
        this.address = address;
        this.admitedDate = admitedDate;
        this.mobile = mobile;
        this.payingBills = payingBills;
        this.releaseDate = releaseDate;
        this.medical = medical;
    }

    public Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate, String mobile, double payingBills, Date releaseDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseaseType = diseaseType;
        this.address = address;
        this.admitedDate = admitedDate;
        this.mobile = mobile;
        this.payingBills = payingBills;
        this.releaseDate = releaseDate;
    }

    public Patient(String patient) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAdmitedDate() {
        return admitedDate;
    }

    public void setAdmitedDate(Date admitedDate) {
        this.admitedDate = admitedDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getPayingBills() {
        return payingBills;
    }

    public void setPayingBills(double payingBills) {
        this.payingBills = payingBills;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

  
    

}
