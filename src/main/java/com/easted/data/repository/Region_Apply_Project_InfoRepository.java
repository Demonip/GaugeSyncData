package com.easted.data.repository;

import com.easted.data.entity.mongoDSEntity.Region_Apply_Project_InfoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
public interface Region_Apply_Project_InfoRepository extends MongoRepository<Region_Apply_Project_InfoEntity,String>{
    List<Region_Apply_Project_InfoEntity> findAll();
}
