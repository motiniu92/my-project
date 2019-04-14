package com.coderbd.dao;

import com.coderbd.pojo.ReportSummary;
import java.util.List;

public interface ReportSummaryDao {

    void createTable();

    void save(ReportSummary rs);

    void update(ReportSummary rs);

    ReportSummary getReportSummaryById(int id);

    ReportSummary getReportSummaryByReportSummaryName(String Name);

    void delete(int id);

    List<ReportSummary> getList();
}
