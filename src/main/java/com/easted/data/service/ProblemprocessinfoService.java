package com.easted.data.service;

import com.easted.data.entity.mongoDSEntity.SYZW_Project_Problem_HistoryEntity;
import com.easted.data.entity.oracleDSEntity.ProblemprocessinfoEntity;
import com.easted.data.repository.ProblemProcessInfoRepository;
import com.easted.data.repository.SYZW_Project_Problem_HistoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by admin on 2017/10/10.
 */
@Transactional
@Service
public class ProblemprocessinfoService {

      private static final Logger logger = LoggerFactory.getLogger(ProblemprocessinfoService.class);
      @Autowired
      private SYZW_Project_Problem_HistoryRepository syzw_project_problem_historyRepository;
      @Autowired
      private ProblemProcessInfoRepository problemProcessInfoRepository;

      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

      public void syncProblemProcessInfo() throws ParseException {
          logger.info("----Start ProblemProcessInfo Sync-----");
          String syncDate = problemProcessInfoRepository.findMaxInsertTime();
          List<SYZW_Project_Problem_HistoryEntity> problemProcessInfoList =
                  syzw_project_problem_historyRepository.findByInserttimeGreaterThan(syncDate);
          for (SYZW_Project_Problem_HistoryEntity entity : problemProcessInfoList) {
              if(entity.getTitle().contains("测试")||entity.getMessage().contains("测试")
                      ||entity.getTitle().contains("test")||entity.getMessage().contains("test")){
                  continue;
              }
              else{
                      ProblemprocessinfoEntity problemprocessinfoEntity = new ProblemprocessinfoEntity();
                      problemprocessinfoEntity.setId(entity.getId());
                      problemprocessinfoEntity.setCode(entity.getCode());
                      problemprocessinfoEntity.setDealtime(entity.getInserttime());
                      problemprocessinfoEntity.setInserttime(new java.sql.Date(df.parse(entity.getInserttime()).getTime()));
                      problemprocessinfoEntity.setStatus(entity.getStatus());
                      problemprocessinfoEntity.setSuggest("无");
                      problemprocessinfoEntity.setTitle(entity.getTitle());
                      problemprocessinfoEntity.setMessage(entity.getMessage());
                      problemProcessInfoRepository.saveAndFlush(problemprocessinfoEntity);
              }
          }
          logger.info("----End ProblemProcessInfo Sync-----");
      }
}
