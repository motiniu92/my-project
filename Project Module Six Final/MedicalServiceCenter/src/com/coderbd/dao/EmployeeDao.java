
package com.coderbd.dao;

import com.coderbd.pojo.Employee;
import com.coderbd.pojo.EmployeeType;
import java.util.List;


public interface EmployeeDao {
    
    void createTable();
    
    void save (Employee employee);
    
    void update (Employee employee);
    
    Employee getEmployeeById(int id);
    
    Employee getEmployeeByEmployeeLastName(String lastName);
    
    void delete (int id);
    
    List<Employee> getList();
    
}
