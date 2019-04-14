package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.TreatmentDetailsDao;
import com.coderbd.pojo.Employee;
import com.coderbd.pojo.Patient;
import com.coderbd.pojo.TreatmentDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreatmentDetailsDaoImpl implements TreatmentDetailsDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        TreatmentDetailsDao edi = new TreatmentDetailsDaoImpl();
        edi.createTable();
    }

    @Override
    public void createTable() {
        /*
        TreatmentDetails(int id, int patientId, int date, int doctorId, double fee, int medicalId,
        String DiseaseName, String Medicine//text, String pathologyTest//text, Patient patient, Employee employee) 
         */
        String sql = "create table IF NOT EXISTS treatmentDetails(id int(8) auto_increment primary key, patient_id int(11),"
                + "date date, doctor_id int(10), fee double, medical_id int(10), disease_name varchar(50),medicine text,"
                + " pathologist text, employees_id int(11),FOREIGN KEY (employees_id) REFERENCES employees(id))";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("TreatmentDetails table Created ");
        } catch (Exception ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(TreatmentDetails td) {
        Patient patient = new Patient();
        Employee employee = new Employee();
        String sql = "insert into treatmentDetails(patient_id,date,doctor_id, fee, medical_id, disease_name,"
                + "medicine, pathologist) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
        TreatmentDetails(int id, int patientId, date date, int doctorId, double fee, int medicalId,
        String DiseaseName, String Medicine//text, String pathologyTest//text, Patient patient, Employee employee) 
             */
            pstmt.setInt(1, td.getPatientId());
            pstmt.setDate(2, td.getDate());
            pstmt.setInt(3, td.getDoctorId());
            pstmt.setDouble(4, td.getFee());
            pstmt.setInt(5, td.getMedicalId());
            pstmt.setString(6, td.getDiseaseName());
            pstmt.setString(7, td.getMedicine());
            pstmt.setString(8, td.getPathologyTest());
            pstmt.executeUpdate();
            // pstmt.setString(9, td.Patient(patient));
            //  pstmt.setString(10, td.Employee(employee));
            //  pstmt.setInt(11, td.getId());
            System.out.println("insert success");
        } catch (Exception ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(TreatmentDetails td) {
        Patient patient = new Patient();
        Employee employee = new Employee();
        String sql = "updet treatmentDetails SET(patient_id=?,date=?,doctor_id=?, fee=?, medical_id=?,"
                + "disease_name=?,medicine=?, pathologist=?,where id=?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
        TreatmentDetails(int id, int patientId, date date, int doctorId, double fee, int medicalId,
        String DiseaseName, String Medicine//text, String pathologyTest//text, Patient patient, Employee employee) 
             */
            pstmt.setInt(1, td.getPatientId());
            pstmt.setDate(2, td.getDate());
            pstmt.setInt(3, td.getDoctorId());
            pstmt.setDouble(4, td.getFee());
            pstmt.setInt(5, td.getMedicalId());
            pstmt.setString(6, td.getDiseaseName());
            pstmt.setString(7, td.getMedicine());
            pstmt.setString(8, td.getPathologyTest());
            pstmt.executeUpdate();
            // pstmt.setString(9, td.Patient(patient));
            //pstmt.setString(10, td.Employee(employee));
            // pstmt.setInt(11, td.getId());
            System.out.println("Update success");
        } catch (Exception ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TreatmentDetails getTreatmentDetailsById(int id) {
        Patient patient = new Patient();
        Employee employee = new Employee();

        TreatmentDetails treatmentDetails = new TreatmentDetails();
        String sql = "select * from treatmentDetails where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
        TreatmentDetails(int id, int patientId, date date, int doctorId, double fee, int medicalId,
        String DiseaseName, String Medicine//text, String pathologyTest//text, Patient patient, Employee employee) 
                 */
                pstmt.setInt(1, treatmentDetails.getPatientId());
                pstmt.setDate(2, treatmentDetails.getDate());
                pstmt.setInt(3, treatmentDetails.getDoctorId());
                pstmt.setDouble(4, treatmentDetails.getFee());
                pstmt.setInt(5, treatmentDetails.getMedicalId());
                pstmt.setString(6, treatmentDetails.getDiseaseName());
                pstmt.setString(7, treatmentDetails.getMedicine());
                pstmt.setString(8, treatmentDetails.getPathologyTest());
                // pstmt.setString(9, treatmentDetails.Patient(patient));
                // pstmt.setString(10, treatmentDetails.Employee(employee));
                // pstmt.setInt(11, treatmentDetails.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return treatmentDetails;
    }

    @Override
    public TreatmentDetails getTreatmentDetailsByTreatmentDetailsName(String Name) {
        Patient patient = new Patient();
        Employee employee = new Employee();

        TreatmentDetails treatmentDetails = new TreatmentDetails();
        String sql = "select * from treatmentDetails where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
        TreatmentDetails(int id, int patientId, date date, int doctorId, double fee, int medicalId,
        String DiseaseName, String Medicine//text, String pathologyTest//text, Patient patient, Employee employee) 
                 */
                pstmt.setInt(1, treatmentDetails.getPatientId());
                pstmt.setDate(2, treatmentDetails.getDate());
                pstmt.setInt(3, treatmentDetails.getDoctorId());
                pstmt.setDouble(4, treatmentDetails.getFee());
                pstmt.setInt(5, treatmentDetails.getMedicalId());
                pstmt.setString(6, treatmentDetails.getDiseaseName());
                pstmt.setString(7, treatmentDetails.getMedicine());
                pstmt.setString(8, treatmentDetails.getPathologyTest());
                // pstmt.setString(9, treatmentDetails.Patient(patient));
                //pstmt.setString(10, treatmentDetails.Employee(employee));
                // pstmt.setInt(11, treatmentDetails.getId());

            }

        } catch (SQLException ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return treatmentDetails;
    }

    @Override
    public void delete(int id) {
        String sql = "delete treatmentDetails where id = ?";
        try {
            if (id != 0) {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                System.out.println("Delete success");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<TreatmentDetails> getList() {
        Patient patient = new Patient();
        Employee employee = new Employee();

        List<TreatmentDetails> list = new ArrayList<>();
        String sql = "select * from treatmentDetails";
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
        TreatmentDetails(int id, int patientId, date date, int doctorId, double fee, int medicalId,
        String DiseaseName, String Medicine//text, String pathologyTest//text, Patient patient, Employee employee) 
              */   
     TreatmentDetails treatmentDetails = new TreatmentDetails(rs.getInt(1), 
             rs.getInt(2), rs.getDate(3), rs.getInt(4), rs.getDouble(5), rs.getInt(6), 
             rs.getString(7), rs.getString(8), rs.getString(9));
                /*
                TreatmentDetails treatmentDetails = new TreatmentDetails(rs.getInt(1), rs.getInt(2), rs.getDate(3),
                        rs.getInt(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9));
                       // (Patient) rs.getObject(10, Patient(patient)), (Employee) rs.getObject(11, Employee(employee)));
                 */
                list.add(treatmentDetails);
            }
        } catch (Exception ex) {
            Logger.getLogger(TreatmentDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

        return list;
    }
    
}
