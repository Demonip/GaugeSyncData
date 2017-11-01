package com.easted.data.service;

import com.easted.data.entity.mongoDSEntity.Region_Project_Lerep_InfoEntity;
import com.easted.data.entity.oracleDSEntity.EnterpriseinfoEntity;
import com.easted.data.publicutils.ConvertUtils;
import com.easted.data.repository.EnterpriseinfoRepository;
import com.easted.data.repository.Region_Project_Lerep_InfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
@Transactional
@Service
public class EnterpriseinfoService {
        private static final Logger logger = LoggerFactory.getLogger(EnterpriseinfoService.class);

        @Autowired
        private EnterpriseinfoRepository enterpriseinfoRepository;

        @Autowired
        private Region_Project_Lerep_InfoRepository region_project_lerep_infoRepository;

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        public void syncEnterpriseInfo() throws ParseException {
            logger.info("----Start EnterpriseInfo Sync-----");
            List<Region_Project_Lerep_InfoEntity> enterpriseInfos = region_project_lerep_infoRepository.findAll();
            enterpriseinfoRepository.deleteAll();
            List<EnterpriseinfoEntity> enterpriseinfoEntities = new ArrayList<>();
            for(Region_Project_Lerep_InfoEntity entity:enterpriseInfos){
                if(entity.getEnterprise_name().contains("测试")||entity.getEnterprise_name().contains("太极")
                        ||entity.getEnterprise_name().contains("王博")||entity.getEnterprise_name().trim().length()<5){
                    continue;
                }
                else{
                    EnterpriseinfoEntity enterpriseinfoEntity = new EnterpriseinfoEntity();
                    enterpriseinfoEntity.setEnterpriseId(entity.getEnterprise_id());
                    enterpriseinfoEntity.setProjectCode(entity.getProject_code());
                    enterpriseinfoEntity.setEnterpriseName(entity.getEnterprise_name());
                    enterpriseinfoEntity.setLerepCerttype(entity.getLerep_certtype());
                    enterpriseinfoEntity.setLerepCertno(entity.getLerep_certno());
                    enterpriseinfoEntity.setContactName(entity.getContact_name());
                    enterpriseinfoEntity.setContactTel(entity.getContact_tel());
                    enterpriseinfoEntity.setContactEmail(entity.getContact_email());
                    enterpriseinfoEntity.setEnterprisePlace(entity.getEnterprise_place());
                    enterpriseinfoEntity.setEnterpriseNature(entity.getEnterprise_nature());
                    enterpriseinfoEntity.setChinaForeignShareRatio(entity.getChina_foreign_share_ratio());
                    enterpriseinfoEntity.setBusinessScope(entity.getBusiness_scope());
                    enterpriseinfoEntity.setContactPhone(entity.getContact_phone());
                    enterpriseinfoEntity.setContactFax(entity.getContact_fax());
                    enterpriseinfoEntity.setCorrespondenceAddress(entity.getCorrespondence_address());
                    enterpriseinfoEntity.setNodeCode(entity.getNode_code());
                    enterpriseinfoEntity.setValidityFlag(entity.getValidity_flag());
                    if(entity.getSource_timestamp()!=null&&entity.getSource_timestamp().trim().length()>1){
                        enterpriseinfoEntity.setSourceTimestamp(ConvertUtils.convertTimeFromString(entity.getSource_timestamp()));
                    }
                    if(entity.getSync_time()!=null&&entity.getSync_time().trim().length()>1){
                        enterpriseinfoEntity.setSyncTime(ConvertUtils.convertTimeFromString(entity.getSync_time()));
                    }
                    enterpriseinfoEntity.setSyncState(entity.getSync_state());
                    enterpriseinfoEntities.add(enterpriseinfoEntity);
                }
            }
            enterpriseinfoRepository.save(enterpriseinfoEntities);
            enterpriseinfoRepository.flush();
            logger.info("----End EnterpriseInfo Sync-----");
        }
}
