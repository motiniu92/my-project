package com.coderbd.daoImpl;

import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.EmployeeTypeDao;
import com.coderbd.pojo.EmployeeType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeTypeDaoImpl implements EmployeeTypeDao {

    Connection conn = CustomDBConnection.getDBConnection();

    public static void main(String[] args) {
        EmployeeTypeDao etd = new EmployeeTypeDaoImpl();
        etd.createTable();
    }

    
    @Override
    public void createTable() {
        //make query
        String sql = "create table IF NOT EXISTS EmployeeType(id int(6) auto_increment primary key,"
                + " emp_name varchar(50) unique)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Create is Successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void save(EmployeeType et) {
        //make query
        String sql = "insert into EmployeeType(emp_name) values(?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, et.getType());
            pstm.executeUpdate();
            System.out.println("Insert success!");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void update(EmployeeType et) {
        //make query
        String sql = "update EmployeeType set emp_name = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, et.getType());
            pstm.executeUpdate();
            System.out.println("update success!");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public EmployeeType getEmployeeTypeById(int id) {
        EmployeeType et = new EmployeeType();
        String sql = "select * from EmployeeType where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                et.setId(rs.getInt(1));
                et.setType(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return et;
    }

    
    @Override
    public EmployeeType getEmployeeTypeByTypeName(String typeName) {
        EmployeeType et = new EmployeeType();
        String sql = "select * from EmployeeType where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, typeName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                et.setId(rs.getInt(1));
                et.setType(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return et;
    }

    
    @Override
    public void delete(EmployeeType et) {
        //make query
        String sql = "delete from EmployeeType where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, et.getType());
            pstm.executeUpdate();
            System.out.println("delete success!");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public List<EmployeeType> getList() {
     List<EmployeeType> list = new ArrayList<>();
        String sql = "select * from EmployeeType";
        try {

            PreparedStatement ps = CustomDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmployeeType pc = new EmployeeType(rs.getInt(1), rs.getString(2));
                list.add(pc);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTypeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
