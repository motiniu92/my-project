
package com.coderbd.dao;

import com.coderbd.pojo.Medical;
import java.util.List;


public interface MedicalDao {
    
    //Crude operation
    void ceateTable();
    void save(Medical medical);
    void update(Medical medical);
    void delete(Medical medical);
    
     //Validation
    Medical getMedicalById(int id);
    Medical getMedicalByMedicalName(String medicalName);
    
    ///collect data from the database 
    List<Medical> getList();
    
}
