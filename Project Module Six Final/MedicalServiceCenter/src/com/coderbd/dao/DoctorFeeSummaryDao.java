package com.coderbd.dao;

import com.coderbd.pojo.DoctorFeeSummary;

import java.util.List;

public interface DoctorFeeSummaryDao {

    void createTable();

    void save(DoctorFeeSummary dfs);

    void update(DoctorFeeSummary dfs);

    DoctorFeeSummary getDoctorFeeSummaryById(int id);

    DoctorFeeSummary getDoctorFeeSummaryByDoctorFeeSummaryName(String Name);

    void delete(int id);

    List<DoctorFeeSummary> getList();
}
