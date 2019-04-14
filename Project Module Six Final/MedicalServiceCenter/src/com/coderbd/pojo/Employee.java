package com.coderbd.pojo;

import java.sql.Date;

public class Employee {

    

    private int id;
    private String fastName;
    private String lastName;
    private Date joiningDate;
    private int age;
    private double fee;
    private String address;
    private String speciality;
    private String educationalQualification;
    private String mobileNumber;
    EmployeeType employeeType;
    Medical medical;

    public Employee() {
    }

    public Employee(String fastName, String lastName, Date joiningDate, int age, double fee, String address, String speciality, String educationalQualification, String mobileNumber, EmployeeType employeeType, Medical medical) {
        this.fastName = fastName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        this.age = age;
        this.fee = fee;
        this.address = address;
        this.speciality = speciality;
        this.educationalQualification = educationalQualification;
        this.mobileNumber = mobileNumber;
        this.employeeType = employeeType;
        this.medical = medical;
    }

    public Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee, String address, String speciality, String educationalQualification, String mobileNumber) {
        this.id = id;
        this.fastName = fastName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        this.age = age;
        this.fee = fee;
        this.address = address;
        this.speciality = speciality;
        this.educationalQualification = educationalQualification;
        this.mobileNumber = mobileNumber;
    }

    public Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee, String address, String speciality, String educationalQualification, String mobileNumber, EmployeeType employeeType, Medical medical) {
        this.id = id;
        this.fastName = fastName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        this.age = age;
        this.fee = fee;
        this.address = address;
        this.speciality = speciality;
        this.educationalQualification = educationalQualification;
        this.mobileNumber = mobileNumber;
        this.employeeType = employeeType;
        this.medical = medical;
    }

    public Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee, String address, String speciality, String educationalQualification, String mobileNumber, EmployeeType employeeType) {
        this.id = id;
        this.fastName = fastName;
        this.lastName = lastName;
        this.joiningDate = joiningDate;
        this.age = age;
        this.fee = fee;
        this.address = address;
        this.speciality = speciality;
        this.educationalQualification = educationalQualification;
        this.mobileNumber = mobileNumber;
        this.employeeType = employeeType;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String employee) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFastName() {
        return fastName;
    }

    public void setFastName(String fastName) {
        this.fastName = fastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speiality) {
        this.speciality = speiality;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

    public String getName() {
        return null;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 


}
