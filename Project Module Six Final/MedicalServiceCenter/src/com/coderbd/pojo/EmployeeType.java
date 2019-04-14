package com.coderbd.pojo;

public class EmployeeType {

    private int id;
    private String type;
//    private String doctor;
//    private String supervisor;
//    private String receptionist;
//    private String pathologist;
//    private String Compounder;
//    private String Nurse;
//    private String cleaner;

    public EmployeeType() {
    }

    public EmployeeType(int id) {
        this.id = id;
    }

    public EmployeeType(String type) {
        this.type = type;
    }

    public EmployeeType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EmployeeType{" + "id=" + id + ", type=" + type + '}';
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
