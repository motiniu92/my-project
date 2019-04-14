package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.PatientDao;
import com.coderbd.pojo.Medical;
import com.coderbd.pojo.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientDaoImpl implements PatientDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        PatientDao pdi = new PatientDaoImpl();
        pdi.createTable();
    }

    @Override
    public void createTable() {
        /*
         Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate,
        String mobile, double payingBills, Date releaseDate, Medical medical) 
         */
        String sql = "create table IF NOT EXISTS patient(id int(8) auto_increment primary key, name varchar(50),"
                + "age int(8), disease_type varchar(50), address varchar(50), admited_date date, mobile varchar(11),"
                + "paying_bils double, release_date date, medical_id int(11), FOREIGN KEY (medical_id) REFERENCES medical(id))";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("Patient table Created");
        } catch (Exception ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save(Patient p) {
        Medical medical = new Medical();
        String sql = "insert into patient(name,age,disease_type, address, admited_date, mobile,"
                + "paying_bils, release_date,medical_id) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
         Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate,
        String mobile, double payingBills, Date releaseDate, Medical medical)      
             */
            pstmt.setString(1, p.getName());
            pstmt.setInt(2, p.getAge());
            pstmt.setString(3, p.getDiseaseType());
            pstmt.setString(4, p.getAddress());
            pstmt.setDate(5, p.getAdmitedDate());
            pstmt.setString(6, p.getMobile());
            pstmt.setDouble(7, p.getPayingBills());
            pstmt.setDate(8, p.getReleaseDate());
            pstmt.setInt(9, p.getMedical().getId());
            pstmt.executeUpdate();
            // pstmt.setInt(9, p.getId());
            System.out.println("insert success");
        } catch (Exception ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Patient p) {
        Medical medical = new Medical();
        String sql = "updet patient SET(name=?,age=?,disease_type=?, address=?, admited_date=?, mobile=?,"
                + "paying_bils=?, release_date=?,where id=?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
         Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate,
        String mobile, double payingBills, Date releaseDate, Medical medical)      
             */
            pstmt.setString(1, p.getName());
            pstmt.setInt(2, p.getAge());
            pstmt.setString(3, p.getDiseaseType());
            pstmt.setString(4, p.getAddress());
            pstmt.setDate(5, p.getAdmitedDate());
            pstmt.setString(6, p.getMobile());
            pstmt.setDouble(7, p.getPayingBills());
            pstmt.setDate(8, p.getReleaseDate());
            pstmt.executeUpdate();
            // pstmt.setString(9, p.Medical(medical));
            //pstmt.setInt(9, p.getId());
            System.out.println("update success");
        } catch (Exception ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Patient getPatientById(int id) {
        Medical medical = new Medical();
        Patient patient = new Patient();
        String sql = "select * from patient where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
         Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate,
        String mobile, double payingBills, Date releaseDate, Medical medical)      
                 */

                patient.setId(rs.getInt(1));
                pstmt.setString(1, patient.getName());
                pstmt.setInt(2, patient.getAge());
                pstmt.setString(3, patient.getDiseaseType());
                pstmt.setString(4, patient.getAddress());
                pstmt.setDate(5, patient.getAdmitedDate());
                pstmt.setString(6, patient.getMobile());
                pstmt.setDouble(7, patient.getPayingBills());
                pstmt.setDate(8, patient.getReleaseDate());
                // pstmt.setString(9, patient.Medical(medical));
                // pstmt.setInt(9, patient.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patient;
    }

    @Override
    public Patient getPatientByPatientName(String Name) {
        Medical medical = new Medical();
        Patient patient = new Patient();
        String sql = "select * from patient where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
         Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate,
        String mobile, double payingBills, Date releaseDate, Medical medical)      
                 */
                patient.setId(rs.getInt(1));
                pstmt.setString(1, patient.getName());
                pstmt.setInt(2, patient.getAge());
                pstmt.setString(3, patient.getDiseaseType());
                pstmt.setString(4, patient.getAddress());
                pstmt.setDate(5, patient.getAdmitedDate());
                pstmt.setString(6, patient.getMobile());
                pstmt.setDouble(7, patient.getPayingBills());
                pstmt.setDate(8, patient.getReleaseDate());
                // pstmt.setString(9, patient.Medical(medical));
                //pstmt.setInt(9, patient.getId());

            }

        } catch (SQLException ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patient;
    }

    @Override
    public void delete(int id) {
        String sql = "delete patient where id = ?";
        try {
            if (id != 0) {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                System.out.println("Delete success");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Patient> getList() {
        Medical medical = new Medical();
        List<Patient> list = new ArrayList<>();
        String sql = "select * from patient";
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
         Patient(int id, String name, int age, String diseaseType, String address, Date admitedDate,
        String mobile, double payingBills, Date releaseDate, Medical medical)      
                 */
                Patient patient = new Patient(rs.getInt(1),
                        rs.getString(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getDate(6), rs.getString(7),
                        rs.getDouble(8), rs.getDate(9), new Medical(rs.getInt(10)));
                
                 list.add(patient);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

        return list;
    }

    
}
