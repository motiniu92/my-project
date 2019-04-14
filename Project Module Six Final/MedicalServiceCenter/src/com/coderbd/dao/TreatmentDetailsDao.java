package com.coderbd.dao;

import com.coderbd.pojo.TreatmentDetails;
import java.util.List;

public interface TreatmentDetailsDao {

    void createTable();

    void save(TreatmentDetails td);

    void update(TreatmentDetails td);

    TreatmentDetails getTreatmentDetailsById(int id);

    TreatmentDetails getTreatmentDetailsByTreatmentDetailsName(String Name);

    void delete(int id);

    List<TreatmentDetails> getList();
}
