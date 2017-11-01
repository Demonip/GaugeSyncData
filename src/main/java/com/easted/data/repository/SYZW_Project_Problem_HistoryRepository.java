package com.easted.data.repository;

import com.easted.data.entity.mongoDSEntity.SYZW_Project_Problem_HistoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by admin on 2017/10/10.
 */
@Repository
public interface SYZW_Project_Problem_HistoryRepository extends MongoRepository<SYZW_Project_Problem_HistoryEntity,String>{
    List<SYZW_Project_Problem_HistoryEntity> findByInserttimeGreaterThan(String time);
}
