
package com.coderbd.dao;

import com.coderbd.pojo.EmployeeType;
import java.util.List;


public interface EmployeeTypeDao {
    //crude operation
    void createTable();
    void save (EmployeeType et);
    void update(EmployeeType et);
    void delete (EmployeeType et);
    
    //Validation
    EmployeeType getEmployeeTypeById(int id);
    EmployeeType getEmployeeTypeByTypeName(String typeName);
    
    //Collect data from the database
    List<EmployeeType> getList();
    
    
}
