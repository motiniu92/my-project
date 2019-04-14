package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.MedicalDao;
import com.coderbd.pojo.EmployeeType;
import com.coderbd.pojo.Medical;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicalDaoImpl implements MedicalDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        MedicalDao mdi = new MedicalDaoImpl();
        mdi.ceateTable();
    }

    @Override
    public void ceateTable() {
        String sql = "create table IF NOT EXISTS medical(id int(11) auto_increment primary key, medical_name varchar(50),"
                + " registration_number varchar(30), establishment_date date, address varchar(30),"
                + " contact_number varchar(15), director_name varchar(50), emp_type_id int(11),"
                + " FOREIGN KEY (emp_type_id) REFERENCES EmployeeType(id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Create Successfully !");
        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Medical medical) {
        EmployeeType employeeType = new EmployeeType();
        //make query
        String sql = "insert into medical(medical_name,registration_number,establishment_date,address,"
                + "contact_number,director_name) values(?,?,?,?,?,?)";
        try {
            if (medical.getName() != null) {
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, medical.getName());
                pstm.setString(2, medical.getRegistrationNumber());
                pstm.setDate(3, (Date) medical.getEstablishmentDate());
                pstm.setString(4, medical.getAddress());
                pstm.setInt(5, medical.getContactNumber());
                pstm.setString(6, medical.getDirectorName());
                
               // pstm.setInt(6, medical.getEmployeeType().getId());
                //pstmt.setInt(11, employee.getMedical().getId());
                // pstm.setInt(7, medical.getId());
                pstm.executeUpdate();
                System.out.println("Insert success !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     String sql = "insert into EmployeeType(emp_name) values(?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, et.getType());
            pstm.executeUpdate();
            System.out.println("Insert success!");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     */
    @Override
    public void update(Medical medical) {
        //make query

        String sql = "update medical set medical_name = ? where id = ?";
        try {
            if (medical.getId() != 0) {
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, medical.getName());
                pstm.setString(2, medical.getRegistrationNumber());
                pstm.setDate(3, (Date) medical.getEstablishmentDate());
                pstm.setString(4, medical.getAddress());
                pstm.setInt(5, medical.getContactNumber());
                pstm.setString(6, medical.getDirectorName());
                pstm.executeUpdate();
                System.out.println(" update success !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Medical medical) {

        //make query
        String sql = "delete medical set medical_name = ? where id = ?";
        try {
            if (medical.getId() != 0) {
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, medical.getName());
                pstm.setString(2, medical.getRegistrationNumber());
                pstm.setDate(3, (Date) medical.getEstablishmentDate());
                pstm.setString(4, medical.getAddress());
                pstm.setInt(5, medical.getContactNumber());
                pstm.setString(6, medical.getDirectorName());
                pstm.executeUpdate();
                System.out.println("delete success !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Medical getMedicalById(int id) {
        Medical medical = null;
        String sql = "select id, medical_name from medical where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                medical = new Medical();
                medical.setId(rs.getInt(1));
                medical.setName(rs.getString(2));

            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medical;
    }

    @Override
    public Medical getMedicalByMedicalName(String medicalName) {

        Medical medical = new Medical();
        String sql = "select * from medical where medical_name=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, medicalName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                medical.setId(rs.getInt(1));
                medical.setName(rs.getString(2));
                medical.setRegistrationNumber(rs.getString(3));
                medical.setEstablishmentDate(rs.getDate(4));
                medical.setAddress(rs.getString(5));
                medical.setContactNumber(rs.getInt(6));
                medical.setDirectorName(rs.getString(7));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medical;
    }

    @Override
    public List<Medical> getList() {

        List<Medical> list = new ArrayList<>();
        String sql = "select * from medical";
        try {

            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                
                Medical medical = new Medical(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7));//, new EmployeeType(rs.getInt(8));

                 /*
                
                Medical medical =new Medical(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5),
                        rs.getInt(6), rs.getString(7), new EmployeeType(rs.getInt(8)));
                */
                
                list.add(medical);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
