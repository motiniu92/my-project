package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.DoctorFeeSummaryDao;
import com.coderbd.pojo.DoctorFeeSummary;
import com.coderbd.pojo.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorFeeSummaryDaoImpl implements DoctorFeeSummaryDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        DoctorFeeSummaryDao dfi = new DoctorFeeSummaryDaoImpl();
        dfi.createTable();
    }

    @Override
    public void createTable() {
        /*
        DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, 
        double paidFee, double dueFee, Employee employee) 
         */
        String sql = "create table IF NOT EXISTS doctorFeeSummary(id int(11) auto_increment primary key, doctor_name varchar(50),"
                + "doctor_id int(11), total_fee double,  paid_fee double, due_fee double)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            System.out.println("Created table doctorFeeSummary");
        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(DoctorFeeSummary dfs) {

        String sql = "insert into doctorFeeSummary(doctor_name,doctor_id,total_fee, paid_fee, due_fee) values(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
        DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, 
        double paidFee, double dueFee, Employee employee) 
             */

            pstmt.setString(1, dfs.getDoctorName());
            pstmt.setInt(2, dfs.getDoctorId());
            pstmt.setDouble(3, dfs.getTotalFee());
            pstmt.setDouble(4, dfs.getPaidFee());
            pstmt.setDouble(5, dfs.getDueFee());
          //   pstmt.setInt(11, dfs.getMedical().getId());
            pstmt.executeUpdate();

            System.out.println("insert success");
        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(DoctorFeeSummary dfs) {
        String sql = "updet doctorFeeSummary SET(doctor_name=?,doctor_id=?,total_fee=?, paid_fee=?, due_fee=?,where id=?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*
        DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, 
        double paidFee, double dueFee, Employee employee) 
             */
            pstmt.setString(1, dfs.getDoctorName());
            pstmt.setInt(2, dfs.getDoctorId());
            pstmt.setDouble(3, dfs.getTotalFee());
            pstmt.setDouble(4, dfs.getPaidFee());
            pstmt.setDouble(5, dfs.getDueFee());
            pstmt.executeUpdate();

            System.out.println("update success");
        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public DoctorFeeSummary getDoctorFeeSummaryById(int id) {
        DoctorFeeSummary dfs = new DoctorFeeSummary();
        String sql = "select * from doctorFeeSummary where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
        DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, 
        double paidFee, double dueFee, Employee employee) 
                 */
                pstmt.setString(1, dfs.getDoctorName());
                pstmt.setInt(2, dfs.getDoctorId());
                pstmt.setDouble(3, dfs.getTotalFee());
                pstmt.setDouble(4, dfs.getPaidFee());
                pstmt.setDouble(5, dfs.getDueFee());
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dfs;
    }

  
    @Override
    public DoctorFeeSummary getDoctorFeeSummaryByDoctorFeeSummaryName(String Name) {
        
        DoctorFeeSummary dfs = new DoctorFeeSummary();

        String sql = "select * from doctorFeeSummary where id=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                /*
        DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, 
        double paidFee, double dueFee, Employee employee) 
                 */
                pstmt.setString(1, dfs.getDoctorName());
                pstmt.setInt(2, dfs.getDoctorId());
                pstmt.setDouble(3, dfs.getTotalFee());
                pstmt.setDouble(4, dfs.getPaidFee());
                pstmt.setDouble(5, dfs.getDueFee());

            }

        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dfs;
    }

    @Override
    public void delete(int id) {
        String sql = "delete doctorFeeSummary where id = ?";
        try {
            if (id != 0) {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                System.out.println("Delete success");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DoctorFeeSummary> getList() {
       Employee employee =new Employee();
        List<DoctorFeeSummary> list = new ArrayList<>();
        String sql = "select * from doctorFeeSummary";
        try {
            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
        DoctorFeeSummary(int id, String doctorName, int doctorId, double totalFee, 
        double paidFee, double dueFee, Employee employee) 
                 */
                DoctorFeeSummary doctorFeeSummary = new DoctorFeeSummary(rs.getInt(1),
                        rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5),
                        rs.getDouble(6) );
               //new Medical(rs.getInt(12)
                list.add(doctorFeeSummary);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorFeeSummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

        return list;
    }
   
}


