package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.EmployeeDao;
import com.coderbd.pojo.Employee;
import com.coderbd.pojo.EmployeeType;
import com.coderbd.pojo.Medical;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        EmployeeDao edi = new EmployeeDaoImpl();
        edi.createTable();
    }

    @Override
    public void createTable() {
        /*
      Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee,
         String address, String speciality, String educationalQualification,String mobileNumber,
           EmployeeType employeeType, Medical medical);
         */
        String sql = "create table IF NOT EXISTS employees(id int(11) auto_increment"
                + " primary key, fast_name varchar(50),last_name varchar(50), "
                + "joining_date date, age int(11), fee double, address varchar(50),"
                + " speciality varchar(50), educationnal_qualification varchar(50),"
                + " mobile_number varchar(15), employee_type varchar(50), "
                + "medical_id int(11), FOREIGN KEY (medical_id) REFERENCES medical(id))";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("Table Create Successfully !");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Employee employee) {
        Medical medical = new Medical();
        EmployeeType employeeType = new EmployeeType();
        /*
      Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee,
         String address, String speciality, String educationalQualification,String mobileNumber,
           EmployeeType employeeType, Medical medical);
         */
        String sql = "insert into employees(fast_name,last_name,joining_date,age,fee,"
                + "address,speciality,educationnal_qualification,mobile_number, employee_type, medical_id)"
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, employee.getFastName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setDate(3, (Date) employee.getJoiningDate());
            pstmt.setInt(4, employee.getAge());
            pstmt.setDouble(5, employee.getFee());
            pstmt.setString(6, employee.getAddress());
            pstmt.setString(7, employee.getSpeciality());
            pstmt.setString(8, employee.getEducationalQualification());
            pstmt.setString(9, employee.getMobileNumber());
             pstmt.setString(10, employee.getEmployeeType().getType());
            pstmt.setInt(11, employee.getMedical().getId());
          
            pstmt.executeUpdate();
            System.out.println("Insert success");
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Employee employee) {
        Medical medical = new Medical();
        EmployeeType employeeType = new EmployeeType();
        /*
      Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee,
         String address, String speciality, String educationalQualification,String mobileNumber,
           EmployeeType employeeType, Medical medical);
         */
        String sql = "update employees SET(fast_name=?,last_name=?,joining_date=?,age=?,fee=?,address=?,speciality=?,"
                + "educationnal_qualification=?,mobile_number=?,where id=?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, employee.getFastName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setDate(3, (Date) employee.getJoiningDate());
            pstmt.setInt(4, employee.getAge());
            pstmt.setDouble(5, employee.getFee());
            pstmt.setString(6, employee.getAddress());
            pstmt.setString(7, employee.getSpeciality());
            pstmt.setString(8, employee.getEducationalQualification());
            pstmt.setString(9, employee.getMobileNumber());
            // pstmt.setString(10, employee.EmployeeType(employeeType));
            //pstmt.setString(11, employee.Medical(medical));
            // pstmt.setInt(12, employee.getId());
            pstmt.executeUpdate();
            System.out.println("Update success");
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = new Employee();
        String sql = "select * from employees where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getInt(1));
                pstmt.setString(1, employee.getFastName());
                pstmt.setString(2, employee.getLastName());
                pstmt.setDate(3, (Date) employee.getJoiningDate());
                pstmt.setInt(4, employee.getAge());
                pstmt.setDouble(5, employee.getFee());
                pstmt.setString(6, employee.getAddress());
                pstmt.setString(7, employee.getSpeciality());
                pstmt.setString(8, employee.getEducationalQualification());
                pstmt.setString(9, employee.getMobileNumber());
                // pstmt.setString(10, employee.getEmployeeType().getType());
                // pstmt.setString(11, employee.getMedical().getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    @Override
     public Employee getEmployeeByEmployeeLastName(String lastName)  {
        Employee employee = new Employee();
        String sql = "select * from employees where lastName=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, lastName);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getInt(1));
                pstmt.setString(1, employee.getFastName());
                pstmt.setString(2, employee.getLastName());
                pstmt.setDate(3, (Date) employee.getJoiningDate());
                pstmt.setInt(4, employee.getAge());
                pstmt.setDouble(5, employee.getFee());
                pstmt.setString(6, employee.getAddress());
                pstmt.setString(7, employee.getSpeciality());
                pstmt.setString(8, employee.getEducationalQualification());
                pstmt.setString(9, employee.getMobileNumber());
                // pstmt.setString(10, employee.getEmployeeType().getType());
                // pstmt.setString(11, employee.getMedical().getName());
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    @Override
    public void delete(int id) {
        String sql = "delete employees where id = ?";
        try {
            if (id != 0) {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                System.out.println("Delete success");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Employee> getList() {
        Medical medical = new Medical();
        EmployeeType employeeType = new EmployeeType();
        List<Employee> list = new ArrayList<>();
        String sql = "select * from employees";
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
      Employee(int id, String fastName, String lastName, Date joiningDate, int age, double fee,
         String address, String speciality, String educationalQualification,String mobileNumber,
           EmployeeType employeeType, Medical medical);
                 */
                Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5),
                        rs.getDouble(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),new EmployeeType(rs.getString(11)), new Medical(rs.getInt(12)));
                list.add(employee);
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

        return list;
    }
    
    public List<Integer> getEmpID() {
        
        List<Integer> list = new ArrayList<>();
        String sql = "select * from employees";
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt(1));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

        return list;
    }

    
    
    

}
