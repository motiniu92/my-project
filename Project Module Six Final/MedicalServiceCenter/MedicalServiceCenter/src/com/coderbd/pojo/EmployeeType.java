
package com.coderbd.pojo;


public class EmployeeType {
    private int id;
    private String emptype;
//    private String doctor;
//    private String supervisor;
//    private String recepints;
//    private String pathologyExaminer;
//    private String doctorsCompounder;
//    private String Nurse;
//    private String cleaner;

    public EmployeeType() {
    }

    public EmployeeType(int id, String emptype) {
        this.id = id;
        this.emptype = emptype;
    }

    public EmployeeType(int id) {
        this.id = id;
    }

    public EmployeeType(String emptype) {
        this.emptype = emptype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }

   
 
}
