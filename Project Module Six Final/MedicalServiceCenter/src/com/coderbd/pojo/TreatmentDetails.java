package com.coderbd.pojo;

import java.sql.Date;

public class TreatmentDetails {

    private int id;
    private int patientId;
    private Date date;
    private int doctorId;
    private Double fee;
    private int medicalId;
    private String DiseaseName;
    private String Medicine;//text
    private String pathologyTest;//text
    Patient patient;
    Employee employee;

    public TreatmentDetails() {
    }

    public TreatmentDetails(int id) {
        this.id = id;
    }

    public TreatmentDetails(int patientId, Date date, int doctorId, Double fee, int medicalId, String DiseaseName, String Medicine, String pathologyTest, Patient patient, Employee employee) {
        this.patientId = patientId;
        this.date = date;
        this.doctorId = doctorId;
        this.fee = fee;
        this.medicalId = medicalId;
        this.DiseaseName = DiseaseName;
        this.Medicine = Medicine;
        this.pathologyTest = pathologyTest;
        this.patient = patient;
        this.employee = employee;
    }

    public TreatmentDetails(int id, int patientId, Date date, int doctorId, Double fee, int medicalId, String DiseaseName, String Medicine, String pathologyTest){
        this.patientId = patientId;
        this.date = date;
        this.doctorId = doctorId;
        this.fee = fee;
        this.medicalId = medicalId;
        this.DiseaseName = DiseaseName;
        this.Medicine = Medicine;
        this.pathologyTest = pathologyTest;
        
    }

    public TreatmentDetails(int patientId, Date date, int doctorId, Double fee, int medicalId, String DiseaseName, String Medicine, String pathologyTest) {
        this.patientId = patientId;
        this.date = date;
        this.doctorId = doctorId;
        this.fee = fee;
        this.medicalId = medicalId;
        this.DiseaseName = DiseaseName;
        this.Medicine = Medicine;
        this.pathologyTest = pathologyTest;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }

    public String getDiseaseName() {
        return DiseaseName;
    }

    public void setDiseaseName(String DiseaseName) {
        this.DiseaseName = DiseaseName;
    }

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    public String getPathologyTest() {
        return pathologyTest;
    }

    public void setPathologyTest(String pathologyTest) {
        this.pathologyTest = pathologyTest;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
    
    

}
