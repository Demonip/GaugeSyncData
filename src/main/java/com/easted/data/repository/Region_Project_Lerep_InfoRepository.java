package com.easted.data.repository;

import com.easted.data.entity.mongoDSEntity.Region_Project_Lerep_InfoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
public interface Region_Project_Lerep_InfoRepository extends MongoRepository<Region_Project_Lerep_InfoEntity,String>{
    List<Region_Project_Lerep_InfoEntity> findAll();
}
