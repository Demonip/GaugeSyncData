package com.easted.data.repository;

import com.easted.data.entity.mongoDSEntity.SYZW_Project_One_Table_InfoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
public interface SYZW_Project_One_Table_InfoRepository extends MongoRepository<SYZW_Project_One_Table_InfoEntity,String>{

    List<SYZW_Project_One_Table_InfoEntity> findAll();
}
