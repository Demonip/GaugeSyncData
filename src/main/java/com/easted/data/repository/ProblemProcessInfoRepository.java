package com.easted.data.repository;

import com.easted.data.entity.oracleDSEntity.ProblemprocessinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



/**
 * Created by admin on 2017/10/10.
 */
@Repository
public interface ProblemProcessInfoRepository extends JpaRepository<ProblemprocessinfoEntity,String>{

    @Query(value = "select max(inserttime) from ProblemprocessinfoEntity")
    String findMaxInsertTime();



}
