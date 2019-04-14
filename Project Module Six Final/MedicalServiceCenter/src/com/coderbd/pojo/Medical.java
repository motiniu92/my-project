package com.coderbd.pojo;

import java.util.Date;

public class Medical {

    private int id;
    private String name;
    private String registrationNumber;
    private Date establishmentDate;
    private String address;
    private int contactNumber;
    private String directorName;
   private EmployeeType employeeType;
    public Medical() {
    }

    public Medical(int id) {
        this.id = id;
    }

    public Medical(String name, String registrationNumber, Date establishmentDate, String address, int contactNumber, String directorName) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.establishmentDate = establishmentDate;
        this.address = address;
        this.contactNumber = contactNumber;
        this.directorName = directorName;
    }

    public Medical(int id, String name, String registrationNumber, Date establishmentDate, String address, int contactNumber, String directorName) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.establishmentDate = establishmentDate;
        this.address = address;
        this.contactNumber = contactNumber;
        this.directorName = directorName;
    }

    public Medical(String medical) {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

}
