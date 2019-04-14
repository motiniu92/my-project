package com.coderbd.pojo;

public class Medical {

    private int id;
    private String name;
    private String registrationNumber;
    private int establishmentDate;
    private String address;
    private int contactNumber;
    private String directorName;

    public Medical() {
    }

    public Medical(int id, String name, String registrationNumber, int establishmentDate, String address, int contactNumber, String directorName) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.establishmentDate = establishmentDate;
        this.address = address;
        this.contactNumber = contactNumber;
        this.directorName = directorName;
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

    public int getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(int establishmentDate) {
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

    @Override
    public String toString() {
        return "Medical{" + "id=" + id + ", name=" + name + ", registrationNumber=" + registrationNumber + ", establishmentDate=" + establishmentDate + ", address=" + address + ", contactNumber=" + contactNumber + ", directorName=" + directorName + '}';
    }
    
    
    

}
