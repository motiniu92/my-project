
package com.coderbd.dao;

import com.coderbd.pojo.Medical;
import java.util.List;


public interface MedicalDao {
    
    void ceateTable();
    
    void save(Medical medical);
    
    void update(Medical medical);
    
    Medical getMedicalById(int id);
    
    Medical getMedicalByMedicalName(String medicalName);
    
    void delete(int id);
    
    List<Medical> getMedicals();
    
}
