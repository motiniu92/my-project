
package com.coderbd.dao;

import com.coderbd.pojo.Patient;
import java.util.List;


public interface PatientDao {
    
   void createTable();
    
    void save (Patient p);
    
    void update (Patient p);
    
    Patient getPatientById(int id);
    
    Patient getPatientByPatientName(String Name);
    
    void delete (int id);
    
    List<Patient> getList();
    
}
