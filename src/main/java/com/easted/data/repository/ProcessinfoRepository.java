package com.easted.data.repository;

import com.easted.data.entity.oracleDSEntity.ProcessinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by admin on 2017/10/11.
 */
public interface ProcessinfoRepository extends JpaRepository<ProcessinfoEntity,String>{
    @Query(value = "select max(inserttime) from ProcessinfoEntity")
    String findMaxInsertTime();
}
