package com.easted.data.repository;

import com.easted.data.entity.mongoDSEntity.SYZW_Project_Problem_HistoryEntity;
import com.easted.data.entity.mongoDSEntity.SYZW_Project_Service_HistoryEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
public interface SYZW_Project_Service_HistoryRepository extends MongoRepository<SYZW_Project_Service_HistoryEntity,String> {
    List<SYZW_Project_Service_HistoryEntity> findByInserttimeGreaterThan(String time);
}
