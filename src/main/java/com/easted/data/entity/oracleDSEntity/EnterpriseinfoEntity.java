package com.easted.data.entity.oracleDSEntity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by admin on 2017/10/10.
 */
@Entity
@Table(name = "ENTERPRISEINFO", schema = "DGHY", catalog = "")
public class EnterpriseinfoEntity {
    @Id
    @Basic
    @Column(name = "ENTERPRISE_ID")
    private String enterpriseId;
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Basic
    @Column(name = "PROJECT_CODE")
    private String projectCode;
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Basic
    @Column(name = "ENTERPRISE_NAME")
    private String enterpriseName;
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    @Basic
    @Column(name = "LEREP_CERTTYPE")
    private String lerepCerttype;
    public String getLerepCerttype() {
        return lerepCerttype;
    }

    public void setLerepCerttype(String lerepCerttype) {
        this.lerepCerttype = lerepCerttype;
    }

    @Basic
    @Column(name = "LEREP_CERTNO")
    private String lerepCertno;
    public String getLerepCertno() {
        return lerepCertno;
    }

    public void setLerepCertno(String lerepCertno) {
        this.lerepCertno = lerepCertno;
    }

    @Basic
    @Column(name = "CONTACT_NAME")
    private String contactName;
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Basic
    @Column(name = "CONTACT_TEL")
    private String contactTel;
    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    @Basic
    @Column(name = "CONTACT_EMAIL")
    private String contactEmail;
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Basic
    @Column(name = "ENTERPRISE_PLACE")
    private String enterprisePlace;
    public String getEnterprisePlace() {
        return enterprisePlace;
    }

    public void setEnterprisePlace(String enterprisePlace) {
        this.enterprisePlace = enterprisePlace;
    }

    @Basic
    @Column(name = "ENTERPRISE_NATURE")
    private String enterpriseNature;
    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    @Basic
    @Column(name = "CHINA_FOREIGN_SHARE_RATIO")
    private String chinaForeignShareRatio;
    public String getChinaForeignShareRatio() {
        return chinaForeignShareRatio;
    }

    public void setChinaForeignShareRatio(String chinaForeignShareRatio) {
        this.chinaForeignShareRatio = chinaForeignShareRatio;
    }

    @Basic
    @Column(name = "BUSINESS_SCOPE")
    private String businessScope;
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    @Basic
    @Column(name = "CONTACT_PHONE")
    private String contactPhone;
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Basic
    @Column(name = "CONTACT_FAX")
    private String contactFax;
    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    @Basic
    @Column(name = "CORRESPONDENCE_ADDRESS")
    private String correspondenceAddress;
    public String getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    public void setCorrespondenceAddress(String correspondenceAddress) {
        this.correspondenceAddress = correspondenceAddress;
    }

    @Basic
    @Column(name = "NODE_CODE")
    private String nodeCode;
    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    @Basic
    @Column(name = "VALIDITY_FLAG")
    private String validityFlag;
    public String getValidityFlag() {
        return validityFlag;
    }

    public void setValidityFlag(String validityFlag) {
        this.validityFlag = validityFlag;
    }

    @Basic
    @Column(name = "SOURCE_TIMESTAMP")
    private Date sourceTimestamp;
    public Date getSourceTimestamp() {
        return sourceTimestamp;
    }

    public void setSourceTimestamp(Date sourceTimestamp) {
        this.sourceTimestamp = sourceTimestamp;
    }

    @Basic
    @Column(name = "SYNC_TIME")
    private Date syncTime;
    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Basic
    @Column(name = "SYNC_STATE")
    private String syncState;
    public String getSyncState() {
        return syncState;
    }

    public void setSyncState(String syncState) {
        this.syncState = syncState;
    }

    public EnterpriseinfoEntity () {}
}
