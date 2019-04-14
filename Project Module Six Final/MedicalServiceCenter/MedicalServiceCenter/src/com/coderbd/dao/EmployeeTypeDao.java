
package com.coderbd.dao;


import com.coderbd.pojo.EmployeeType;
import java.util.List;


public interface EmployeeTypeDao {
    void ceateTable();
    
    void save(EmployeeType et);
    
    void update(EmployeeType et);
    
    EmployeeType getEmployeeTypeById(int id);
    
    EmployeeType getEmployeeTypeByTypeName(String medicalName);
    
    void delete(int id);
    
    List<EmployeeType> getList();
}
