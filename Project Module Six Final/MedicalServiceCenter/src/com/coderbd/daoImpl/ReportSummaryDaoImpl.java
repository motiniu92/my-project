package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.DoctorFeeSummaryDao;
import com.coderbd.dao.ReportSummaryDao;
import com.coderbd.pojo.Patient;
import com.coderbd.pojo.ReportSummary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportSummaryDaoImpl implements ReportSummaryDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        ReportSummaryDao edi = new ReportSummaryDaoImpl();
        edi.createTable();
    }

    @Override
    public void createTable() {
        /*
        ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, 
        double totalSpend, int employeeQnty, Patient patient)        
         */
        String sql = "create table IF NOT EXISTS reportSummary(id int(11) auto_increment primary key, total_patient int(11),"
                + "doctor_fee double, employee_salary double,  total_income double, total_spend double, employee_qty int(11),"
                + "patient_id int(11),FOREIGN KEY (patient_id) REFERENCES patient(id))"; 
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("Created table doctorFeeSummary");
        } catch (Exception ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(ReportSummary rs) {
        Patient patient = new Patient();
        String sql = "insert into reportSummary(total_patient,doctor_fee,employee_salary, total_income, total_spend,"
                + " employee_qty) values(?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
        ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, 
        double totalSpend, int employeeQnty, Patient patient)        
             */

            pstmt.setInt(1, rs.getTotalPatient());
            pstmt.setDouble(2, rs.getDoctorFee());
            pstmt.setDouble(3, rs.getEmployeeSalary());
            pstmt.setDouble(4, rs.getTotalIncome());
            pstmt.setDouble(5, rs.getTotalSpend());
            pstmt.setInt(6, rs.getEmployeeQty());
            
            pstmt.executeUpdate();
           // pstmt.setString(7, rs.Patient(patient));
           // pstmt.setInt(8, rs.getId());
            System.out.println("insert success");
        } catch (Exception ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ReportSummary rs) {
        Patient patient = new Patient();
        String sql = "updet reportSummary SET(total_patient=?,doctor_fee=?,employee_salary=?, total_income=?, total_spend=?,"
                + " employee_qty=?,where id=?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
        ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, 
        double totalSpend, int employeeQnty, Patient patient)        
             */
            pstmt.setInt(1, rs.getTotalPatient());
            pstmt.setDouble(2, rs.getDoctorFee());
            pstmt.setDouble(3, rs.getEmployeeSalary());
            pstmt.setDouble(4, rs.getTotalIncome());
            pstmt.setDouble(5, rs.getTotalSpend());
            pstmt.setInt(6, rs.getEmployeeQty());
            pstmt.executeUpdate();
           // pstmt.setString(7, rs.Patient(patient));
           // pstmt.setInt(8, rs.getId());
            System.out.println("update success");
        } catch (SQLException ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ReportSummary getReportSummaryById(int id) {
        ReportSummary reportSummary = new ReportSummary();
        Patient patient = new Patient();
        String sql = "select * from reportSummary where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
        ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, 
        double totalSpend, int employeeQnty, Patient patient)        
                 */
                pstmt.setInt(1, reportSummary.getTotalPatient());
                pstmt.setDouble(2, reportSummary.getDoctorFee());
                pstmt.setDouble(3, reportSummary.getEmployeeSalary());
                pstmt.setDouble(4, reportSummary.getTotalIncome());
                pstmt.setDouble(5, reportSummary.getTotalSpend());
                pstmt.setInt(6, reportSummary.getEmployeeQty());
              //  pstmt.setString(7, reportSummary.Patient(patient));
               // pstmt.setInt(8, reportSummary.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportSummary;
    }

    @Override
    public ReportSummary getReportSummaryByReportSummaryName(String Name) {
        ReportSummary reportSummary = new ReportSummary();
        Patient patient = new Patient();
        String sql = "select * from reportSummary where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
        ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, 
        double totalSpend, int employeeQnty, Patient patient)        
                 */
                pstmt.setInt(1, reportSummary.getTotalPatient());
                pstmt.setDouble(2, reportSummary.getDoctorFee());
                pstmt.setDouble(3, reportSummary.getEmployeeSalary());
                pstmt.setDouble(4, reportSummary.getTotalIncome());
                pstmt.setDouble(5, reportSummary.getTotalSpend());
                pstmt.setInt(6, reportSummary.getEmployeeQty());
                
               // pstmt.setString(7, reportSummary.Patient(patient));
               // pstmt.setInt(8, reportSummary.getId());

            }

        } catch (SQLException ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reportSummary;
    }

    @Override
    public void delete(int id) {
        String sql = "delete reportSummary where id = ?";
        try {
            if (id != 0) {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                System.out.println("Delete success");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ReportSummary> getList() {
        Patient patient = new Patient();
        List<ReportSummary> list = new ArrayList<>();
        String sql = "select * from reportSummary";
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
        ReportSummary(int id, int totalPatient, double doctorFee, double employeeSalary, double totalIncome, 
        double totalSpend, int employeeQnty, Patient patient)        
                 */
                ReportSummary reportSummary = new ReportSummary(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4),
                        rs.getDouble(5), rs.getDouble(6), rs.getInt(7));
            }
        } catch (Exception ex) {
            Logger.getLogger(ReportSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

        return list;
    }

   
}
