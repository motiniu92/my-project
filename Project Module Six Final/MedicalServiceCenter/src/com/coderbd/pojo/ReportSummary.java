package com.coderbd.pojo;

public class ReportSummary {

    private int id;
    private int totalPatient;
    private double doctorFee;
    private double employeeSalary;
    private double totalIncome;
    private double totalSpend;
    private int employeeQty;
    Patient patient;

    public ReportSummary() {
    }
    
   public ReportSummary(int id) {
        this.id = id;
   }

    public ReportSummary(int totalPatient, double doctorFee, double employeeSalary, double totalIncome, double totalSpend, int employeeQty) {
        this.totalPatient = totalPatient;
        this.doctorFee = doctorFee;
        this.employeeSalary = employeeSalary;
        this.totalIncome = totalIncome;
        this.totalSpend = totalSpend;
        this.employeeQty = employeeQty;
       
    }

    public ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, double totalSpend, int employeeQty) {
        this.id = id;
        this.totalPatient = totalPatient;
        this.doctorFee = doctorFee;
        this.employeeSalary = employeeSalary;
        this.totalIncome = totalIncome;
        this.totalSpend = totalSpend;
        this.employeeQty = employeeQty;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPatient() {
        return totalPatient;
    }

    public void setTotalPatient(int totalPatient) {
        this.totalPatient = totalPatient;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalSpend() {
        return totalSpend;
    }

    public void setTotalSpend(double totalSpend) {
        this.totalSpend = totalSpend;
    }

    public int getEmployeeQty() {
        return employeeQty;
    }

    public void setEmployeeQty(int employeeQty) {
        this.employeeQty = employeeQty;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String Patient(Patient patient) {
        return null;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
   

}
