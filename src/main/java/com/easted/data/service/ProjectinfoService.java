package com.easted.data.service;

import com.easted.data.entity.mongoDSEntity.Region_Apply_Project_InfoEntity;
import com.easted.data.repository.ProjectinfoRepository;
import com.easted.data.repository.Region_Apply_Project_InfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
@Transactional
@Service
public class ProjectinfoService {

    private static final Logger logger = LoggerFactory.getLogger(ProjectinfoService.class);

    @Autowired
    private ProjectinfoRepository projectinfoRepository;

    @Autowired
    private Region_Apply_Project_InfoRepository region_apply_project_infoRepository;

    public void syncProjectInfo() {
        logger.info("----Start ProjectssInfo Sync-----");
        projectinfoRepository.deleteAll();
        List<Region_Apply_Project_InfoEntity> projectInfos = region_apply_project_infoRepository.findAll();
        for(Region_Apply_Project_InfoEntity entity : projectInfos){
            
        }
        logger.info("----End ProjectInfo Sync-----");
    }
}
