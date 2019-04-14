package com.coderbd.pojo;

public class DoctorFeeSummary {

    private int id;
    private String doctorName;
    private int doctorId;
    private double totalFee;
    private double paidFee;
    private double dueFee;
    Employee employee;

    public DoctorFeeSummary() {
    }

    public DoctorFeeSummary(String doctorName, int doctorId, double totalFee, double paidFee, double dueFee) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.totalFee = totalFee;
        this.paidFee = paidFee;
        this.dueFee = dueFee;
    }

    public DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, double paidFee, double dueFee) {
        this.id = id;
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.totalFee = totalFee;
        this.paidFee = paidFee;
        this.dueFee = dueFee;
    }

    public DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, double paidFee, double dueFee, Employee employee) {
        this.id = id;
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.totalFee = totalFee;
        this.paidFee = paidFee;
        this.dueFee = dueFee;
        this.employee = employee;
    }

    public DoctorFeeSummary(String doctorName, int doctorId, double totalFee, double paidFee, double dueFee, Employee employee) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.totalFee = totalFee;
        this.paidFee = paidFee;
        this.dueFee = dueFee;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public double getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(double paidFee) {
        this.paidFee = paidFee;
    }

    public double getDueFee() {
        return dueFee;
    }

    public void setDueFee(double dueFee) {
        this.dueFee = dueFee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

   
}
