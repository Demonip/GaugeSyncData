package com.easted.data.service;

import com.easted.data.entity.mongoDSEntity.SYZW_Project_Problem_HistoryEntity;
import com.easted.data.entity.mongoDSEntity.SYZW_Project_Service_HistoryEntity;
import com.easted.data.entity.oracleDSEntity.ProblemprocessinfoEntity;
import com.easted.data.entity.oracleDSEntity.ProcessinfoEntity;
import com.easted.data.repository.ProcessinfoRepository;
import com.easted.data.repository.SYZW_Project_Service_HistoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
@Transactional
@Service
public class ProcessinfoService {
    private static final Logger logger = LoggerFactory.getLogger(ProcessinfoService.class);

    @Autowired
    private ProcessinfoRepository processinfoRepository;

    @Autowired
    private SYZW_Project_Service_HistoryRepository syzw_project_service_historyRepository;

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public void syncProcessInfo() throws ParseException {
        logger.info("----Start ProcessInfo Sync-----");
        String syncDate = processinfoRepository.findMaxInsertTime();
        if(syncDate==null||syncDate.equals("")){
            syncDate = "2017-01-01";
        }
        List<SYZW_Project_Service_HistoryEntity> processInfoList =
                syzw_project_service_historyRepository.findByInserttimeGreaterThan(syncDate);
        for (SYZW_Project_Service_HistoryEntity entity : processInfoList) {
            if(entity.getOrg().contains("测试")||entity.getMessage().contains("测试")
                    ||entity.getOrg().contains("test")||entity.getMessage().contains("test")){
                continue;
            }
            else{
                ProcessinfoEntity processinfoEntity = new ProcessinfoEntity();
                processinfoEntity.setId(entity.getId());
                processinfoEntity.setCode(entity.getCode());
                processinfoEntity.setDealtime(entity.getInserttime());
                processinfoEntity.setInserttime(new java.sql.Date(df.parse(entity.getInserttime()).getTime()));
                processinfoEntity.setSuggest("无");
                processinfoEntity.setTitle(entity.getMessage());
                processinfoEntity.setStatus(1);
                if(entity.getOrg()==null||entity.getOrg().isEmpty()||entity.getOrg().trim().length()<1){
                    processinfoEntity.setMessage(entity.getMessage());
                }
                else{
                    processinfoEntity.setMessage(entity.getOrg()+"—"+entity.getMessage());
                }
                processinfoRepository.saveAndFlush(processinfoEntity);
            }
        }
        logger.info("----End ProcessInfo Sync-----");
    }
}
