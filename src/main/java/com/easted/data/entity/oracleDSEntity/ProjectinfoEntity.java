package com.easted.data.entity.oracleDSEntity;

import javax.persistence.*;

/**
 * Created by admin on 2017/10/10.
 */
@Entity
@Table(name = "PROJECTINFO", schema = "DGHY", catalog = "")
public class ProjectinfoEntity {
    private String projectCode;
    private String divisionCode;
    private String projectName;
    private String projectType;
    private String projectNature;
    private Long startYear;
    private Long endYear;
    private Long totalMoney;
    private String placeCode;
    private String placeCodeDetail;
    private String industry;
    private String scaleContent;
    private String applyDate;
    private String permitItemCode;
    private String foreignAbroadFlag;
    private String totalMoneyExplain;
    private String theIndustry;
    private String isCountrySecurity;
    private String securityApprovalNumber;
    private String investmentMode;
    private Long totalMoneyDollar;
    private Long totalMoneyDollarRate;
    private Long projectCapitalMoney;
    private Long projectCapitalMoneyDollar;
    private Long projectCapitalMoneyDollarRate;
    private String industrialPolicyType;
    private String industrialPolicy;
    private String otherInvestmentApplyInfo;
    private String transactionBothInfo;
    private String mergerPlan;
    private String mergerManagementModeScope;
    private String getLandMode;
    private Long landArea;
    private Long builtArea;
    private String isAddDevice;
    private String importDeviceNumberMoney;
    private String projectSite;
    private Long chinaTotalMoney;
    private String nodeCode;
    private String validityFlag;
    private String sourceTimestamp;
    private String syncTime;
    private Boolean syncState;

    @Id
    @Column(name = "PROJECT_CODE")
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Basic
    @Column(name = "DIVISION_CODE")
    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    @Basic
    @Column(name = "PROJECT_NAME")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "PROJECT_TYPE")
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    @Basic
    @Column(name = "PROJECT_NATURE")
    public String getProjectNature() {
        return projectNature;
    }

    public void setProjectNature(String projectNature) {
        this.projectNature = projectNature;
    }

    @Basic
    @Column(name = "START_YEAR")
    public Long getStartYear() {
        return startYear;
    }

    public void setStartYear(Long startYear) {
        this.startYear = startYear;
    }

    @Basic
    @Column(name = "END_YEAR")
    public Long getEndYear() {
        return endYear;
    }

    public void setEndYear(Long endYear) {
        this.endYear = endYear;
    }

    @Basic
    @Column(name = "TOTAL_MONEY")
    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Basic
    @Column(name = "PLACE_CODE")
    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    @Basic
    @Column(name = "PLACE_CODE_DETAIL")
    public String getPlaceCodeDetail() {
        return placeCodeDetail;
    }

    public void setPlaceCodeDetail(String placeCodeDetail) {
        this.placeCodeDetail = placeCodeDetail;
    }

    @Basic
    @Column(name = "INDUSTRY")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "SCALE_CONTENT")
    public String getScaleContent() {
        return scaleContent;
    }

    public void setScaleContent(String scaleContent) {
        this.scaleContent = scaleContent;
    }

    @Basic
    @Column(name = "APPLY_DATE")
    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "PERMIT_ITEM_CODE")
    public String getPermitItemCode() {
        return permitItemCode;
    }

    public void setPermitItemCode(String permitItemCode) {
        this.permitItemCode = permitItemCode;
    }

    @Basic
    @Column(name = "FOREIGN_ABROAD_FLAG")
    public String getForeignAbroadFlag() {
        return foreignAbroadFlag;
    }

    public void setForeignAbroadFlag(String foreignAbroadFlag) {
        this.foreignAbroadFlag = foreignAbroadFlag;
    }

    @Basic
    @Column(name = "TOTAL_MONEY_EXPLAIN")
    public String getTotalMoneyExplain() {
        return totalMoneyExplain;
    }

    public void setTotalMoneyExplain(String totalMoneyExplain) {
        this.totalMoneyExplain = totalMoneyExplain;
    }

    @Basic
    @Column(name = "THE_INDUSTRY")
    public String getTheIndustry() {
        return theIndustry;
    }

    public void setTheIndustry(String theIndustry) {
        this.theIndustry = theIndustry;
    }

    @Basic
    @Column(name = "IS_COUNTRY_SECURITY")
    public String getIsCountrySecurity() {
        return isCountrySecurity;
    }

    public void setIsCountrySecurity(String isCountrySecurity) {
        this.isCountrySecurity = isCountrySecurity;
    }

    @Basic
    @Column(name = "SECURITY_APPROVAL_NUMBER")
    public String getSecurityApprovalNumber() {
        return securityApprovalNumber;
    }

    public void setSecurityApprovalNumber(String securityApprovalNumber) {
        this.securityApprovalNumber = securityApprovalNumber;
    }

    @Basic
    @Column(name = "INVESTMENT_MODE")
    public String getInvestmentMode() {
        return investmentMode;
    }

    public void setInvestmentMode(String investmentMode) {
        this.investmentMode = investmentMode;
    }

    @Basic
    @Column(name = "TOTAL_MONEY_DOLLAR")
    public Long getTotalMoneyDollar() {
        return totalMoneyDollar;
    }

    public void setTotalMoneyDollar(Long totalMoneyDollar) {
        this.totalMoneyDollar = totalMoneyDollar;
    }

    @Basic
    @Column(name = "TOTAL_MONEY_DOLLAR_RATE")
    public Long getTotalMoneyDollarRate() {
        return totalMoneyDollarRate;
    }

    public void setTotalMoneyDollarRate(Long totalMoneyDollarRate) {
        this.totalMoneyDollarRate = totalMoneyDollarRate;
    }

    @Basic
    @Column(name = "PROJECT_CAPITAL_MONEY")
    public Long getProjectCapitalMoney() {
        return projectCapitalMoney;
    }

    public void setProjectCapitalMoney(Long projectCapitalMoney) {
        this.projectCapitalMoney = projectCapitalMoney;
    }

    @Basic
    @Column(name = "PROJECT_CAPITAL_MONEY_DOLLAR")
    public Long getProjectCapitalMoneyDollar() {
        return projectCapitalMoneyDollar;
    }

    public void setProjectCapitalMoneyDollar(Long projectCapitalMoneyDollar) {
        this.projectCapitalMoneyDollar = projectCapitalMoneyDollar;
    }

    @Basic
    @Column(name = "PROJECT_CAPITAL_MONEY_DOLLAR_RATE")
    public Long getProjectCapitalMoneyDollarRate() {
        return projectCapitalMoneyDollarRate;
    }

    public void setProjectCapitalMoneyDollarRate(Long projectCapitalMoneyDollarRate) {
        this.projectCapitalMoneyDollarRate = projectCapitalMoneyDollarRate;
    }

    @Basic
    @Column(name = "INDUSTRIAL_POLICY_TYPE")
    public String getIndustrialPolicyType() {
        return industrialPolicyType;
    }

    public void setIndustrialPolicyType(String industrialPolicyType) {
        this.industrialPolicyType = industrialPolicyType;
    }

    @Basic
    @Column(name = "INDUSTRIAL_POLICY")
    public String getIndustrialPolicy() {
        return industrialPolicy;
    }

    public void setIndustrialPolicy(String industrialPolicy) {
        this.industrialPolicy = industrialPolicy;
    }

    @Basic
    @Column(name = "OTHER_INVESTMENT_APPLY_INFO")
    public String getOtherInvestmentApplyInfo() {
        return otherInvestmentApplyInfo;
    }

    public void setOtherInvestmentApplyInfo(String otherInvestmentApplyInfo) {
        this.otherInvestmentApplyInfo = otherInvestmentApplyInfo;
    }

    @Basic
    @Column(name = "TRANSACTION_BOTH_INFO")
    public String getTransactionBothInfo() {
        return transactionBothInfo;
    }

    public void setTransactionBothInfo(String transactionBothInfo) {
        this.transactionBothInfo = transactionBothInfo;
    }

    @Basic
    @Column(name = "MERGER_PLAN")
    public String getMergerPlan() {
        return mergerPlan;
    }

    public void setMergerPlan(String mergerPlan) {
        this.mergerPlan = mergerPlan;
    }

    @Basic
    @Column(name = "MERGER_MANAGEMENT_MODE_SCOPE")
    public String getMergerManagementModeScope() {
        return mergerManagementModeScope;
    }

    public void setMergerManagementModeScope(String mergerManagementModeScope) {
        this.mergerManagementModeScope = mergerManagementModeScope;
    }

    @Basic
    @Column(name = "GET_LAND_MODE")
    public String getGetLandMode() {
        return getLandMode;
    }

    public void setGetLandMode(String getLandMode) {
        this.getLandMode = getLandMode;
    }

    @Basic
    @Column(name = "LAND_AREA")
    public Long getLandArea() {
        return landArea;
    }

    public void setLandArea(Long landArea) {
        this.landArea = landArea;
    }

    @Basic
    @Column(name = "BUILT_AREA")
    public Long getBuiltArea() {
        return builtArea;
    }

    public void setBuiltArea(Long builtArea) {
        this.builtArea = builtArea;
    }

    @Basic
    @Column(name = "IS_ADD_DEVICE")
    public String getIsAddDevice() {
        return isAddDevice;
    }

    public void setIsAddDevice(String isAddDevice) {
        this.isAddDevice = isAddDevice;
    }

    @Basic
    @Column(name = "IMPORT_DEVICE_NUMBER_MONEY")
    public String getImportDeviceNumberMoney() {
        return importDeviceNumberMoney;
    }

    public void setImportDeviceNumberMoney(String importDeviceNumberMoney) {
        this.importDeviceNumberMoney = importDeviceNumberMoney;
    }

    @Basic
    @Column(name = "PROJECT_SITE")
    public String getProjectSite() {
        return projectSite;
    }

    public void setProjectSite(String projectSite) {
        this.projectSite = projectSite;
    }

    @Basic
    @Column(name = "CHINA_TOTAL_MONEY")
    public Long getChinaTotalMoney() {
        return chinaTotalMoney;
    }

    public void setChinaTotalMoney(Long chinaTotalMoney) {
        this.chinaTotalMoney = chinaTotalMoney;
    }

    @Basic
    @Column(name = "NODE_CODE")
    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    @Basic
    @Column(name = "VALIDITY_FLAG")
    public String getValidityFlag() {
        return validityFlag;
    }

    public void setValidityFlag(String validityFlag) {
        this.validityFlag = validityFlag;
    }

    @Basic
    @Column(name = "SOURCE_TIMESTAMP")
    public String getSourceTimestamp() {
        return sourceTimestamp;
    }

    public void setSourceTimestamp(String sourceTimestamp) {
        this.sourceTimestamp = sourceTimestamp;
    }

    @Basic
    @Column(name = "SYNC_TIME")
    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime;
    }

    @Basic
    @Column(name = "SYNC_STATE")
    public Boolean getSyncState() {
        return syncState;
    }

    public void setSyncState(Boolean syncState) {
        this.syncState = syncState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectinfoEntity that = (ProjectinfoEntity) o;

        if (projectCode != null ? !projectCode.equals(that.projectCode) : that.projectCode != null) return false;
        if (divisionCode != null ? !divisionCode.equals(that.divisionCode) : that.divisionCode != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (projectType != null ? !projectType.equals(that.projectType) : that.projectType != null) return false;
        if (projectNature != null ? !projectNature.equals(that.projectNature) : that.projectNature != null)
            return false;
        if (startYear != null ? !startYear.equals(that.startYear) : that.startYear != null) return false;
        if (endYear != null ? !endYear.equals(that.endYear) : that.endYear != null) return false;
        if (totalMoney != null ? !totalMoney.equals(that.totalMoney) : that.totalMoney != null) return false;
        if (placeCode != null ? !placeCode.equals(that.placeCode) : that.placeCode != null) return false;
        if (placeCodeDetail != null ? !placeCodeDetail.equals(that.placeCodeDetail) : that.placeCodeDetail != null)
            return false;
        if (industry != null ? !industry.equals(that.industry) : that.industry != null) return false;
        if (scaleContent != null ? !scaleContent.equals(that.scaleContent) : that.scaleContent != null) return false;
        if (applyDate != null ? !applyDate.equals(that.applyDate) : that.applyDate != null) return false;
        if (permitItemCode != null ? !permitItemCode.equals(that.permitItemCode) : that.permitItemCode != null)
            return false;
        if (foreignAbroadFlag != null ? !foreignAbroadFlag.equals(that.foreignAbroadFlag) : that.foreignAbroadFlag != null)
            return false;
        if (totalMoneyExplain != null ? !totalMoneyExplain.equals(that.totalMoneyExplain) : that.totalMoneyExplain != null)
            return false;
        if (theIndustry != null ? !theIndustry.equals(that.theIndustry) : that.theIndustry != null) return false;
        if (isCountrySecurity != null ? !isCountrySecurity.equals(that.isCountrySecurity) : that.isCountrySecurity != null)
            return false;
        if (securityApprovalNumber != null ? !securityApprovalNumber.equals(that.securityApprovalNumber) : that.securityApprovalNumber != null)
            return false;
        if (investmentMode != null ? !investmentMode.equals(that.investmentMode) : that.investmentMode != null)
            return false;
        if (totalMoneyDollar != null ? !totalMoneyDollar.equals(that.totalMoneyDollar) : that.totalMoneyDollar != null)
            return false;
        if (totalMoneyDollarRate != null ? !totalMoneyDollarRate.equals(that.totalMoneyDollarRate) : that.totalMoneyDollarRate != null)
            return false;
        if (projectCapitalMoney != null ? !projectCapitalMoney.equals(that.projectCapitalMoney) : that.projectCapitalMoney != null)
            return false;
        if (projectCapitalMoneyDollar != null ? !projectCapitalMoneyDollar.equals(that.projectCapitalMoneyDollar) : that.projectCapitalMoneyDollar != null)
            return false;
        if (projectCapitalMoneyDollarRate != null ? !projectCapitalMoneyDollarRate.equals(that.projectCapitalMoneyDollarRate) : that.projectCapitalMoneyDollarRate != null)
            return false;
        if (industrialPolicyType != null ? !industrialPolicyType.equals(that.industrialPolicyType) : that.industrialPolicyType != null)
            return false;
        if (industrialPolicy != null ? !industrialPolicy.equals(that.industrialPolicy) : that.industrialPolicy != null)
            return false;
        if (otherInvestmentApplyInfo != null ? !otherInvestmentApplyInfo.equals(that.otherInvestmentApplyInfo) : that.otherInvestmentApplyInfo != null)
            return false;
        if (transactionBothInfo != null ? !transactionBothInfo.equals(that.transactionBothInfo) : that.transactionBothInfo != null)
            return false;
        if (mergerPlan != null ? !mergerPlan.equals(that.mergerPlan) : that.mergerPlan != null) return false;
        if (mergerManagementModeScope != null ? !mergerManagementModeScope.equals(that.mergerManagementModeScope) : that.mergerManagementModeScope != null)
            return false;
        if (getLandMode != null ? !getLandMode.equals(that.getLandMode) : that.getLandMode != null) return false;
        if (landArea != null ? !landArea.equals(that.landArea) : that.landArea != null) return false;
        if (builtArea != null ? !builtArea.equals(that.builtArea) : that.builtArea != null) return false;
        if (isAddDevice != null ? !isAddDevice.equals(that.isAddDevice) : that.isAddDevice != null) return false;
        if (importDeviceNumberMoney != null ? !importDeviceNumberMoney.equals(that.importDeviceNumberMoney) : that.importDeviceNumberMoney != null)
            return false;
        if (projectSite != null ? !projectSite.equals(that.projectSite) : that.projectSite != null) return false;
        if (chinaTotalMoney != null ? !chinaTotalMoney.equals(that.chinaTotalMoney) : that.chinaTotalMoney != null)
            return false;
        if (nodeCode != null ? !nodeCode.equals(that.nodeCode) : that.nodeCode != null) return false;
        if (validityFlag != null ? !validityFlag.equals(that.validityFlag) : that.validityFlag != null) return false;
        if (sourceTimestamp != null ? !sourceTimestamp.equals(that.sourceTimestamp) : that.sourceTimestamp != null)
            return false;
        if (syncTime != null ? !syncTime.equals(that.syncTime) : that.syncTime != null) return false;
        if (syncState != null ? !syncState.equals(that.syncState) : that.syncState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectCode != null ? projectCode.hashCode() : 0;
        result = 31 * result + (divisionCode != null ? divisionCode.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (projectType != null ? projectType.hashCode() : 0);
        result = 31 * result + (projectNature != null ? projectNature.hashCode() : 0);
        result = 31 * result + (startYear != null ? startYear.hashCode() : 0);
        result = 31 * result + (endYear != null ? endYear.hashCode() : 0);
        result = 31 * result + (totalMoney != null ? totalMoney.hashCode() : 0);
        result = 31 * result + (placeCode != null ? placeCode.hashCode() : 0);
        result = 31 * result + (placeCodeDetail != null ? placeCodeDetail.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + (scaleContent != null ? scaleContent.hashCode() : 0);
        result = 31 * result + (applyDate != null ? applyDate.hashCode() : 0);
        result = 31 * result + (permitItemCode != null ? permitItemCode.hashCode() : 0);
        result = 31 * result + (foreignAbroadFlag != null ? foreignAbroadFlag.hashCode() : 0);
        result = 31 * result + (totalMoneyExplain != null ? totalMoneyExplain.hashCode() : 0);
        result = 31 * result + (theIndustry != null ? theIndustry.hashCode() : 0);
        result = 31 * result + (isCountrySecurity != null ? isCountrySecurity.hashCode() : 0);
        result = 31 * result + (securityApprovalNumber != null ? securityApprovalNumber.hashCode() : 0);
        result = 31 * result + (investmentMode != null ? investmentMode.hashCode() : 0);
        result = 31 * result + (totalMoneyDollar != null ? totalMoneyDollar.hashCode() : 0);
        result = 31 * result + (totalMoneyDollarRate != null ? totalMoneyDollarRate.hashCode() : 0);
        result = 31 * result + (projectCapitalMoney != null ? projectCapitalMoney.hashCode() : 0);
        result = 31 * result + (projectCapitalMoneyDollar != null ? projectCapitalMoneyDollar.hashCode() : 0);
        result = 31 * result + (projectCapitalMoneyDollarRate != null ? projectCapitalMoneyDollarRate.hashCode() : 0);
        result = 31 * result + (industrialPolicyType != null ? industrialPolicyType.hashCode() : 0);
        result = 31 * result + (industrialPolicy != null ? industrialPolicy.hashCode() : 0);
        result = 31 * result + (otherInvestmentApplyInfo != null ? otherInvestmentApplyInfo.hashCode() : 0);
        result = 31 * result + (transactionBothInfo != null ? transactionBothInfo.hashCode() : 0);
        result = 31 * result + (mergerPlan != null ? mergerPlan.hashCode() : 0);
        result = 31 * result + (mergerManagementModeScope != null ? mergerManagementModeScope.hashCode() : 0);
        result = 31 * result + (getLandMode != null ? getLandMode.hashCode() : 0);
        result = 31 * result + (landArea != null ? landArea.hashCode() : 0);
        result = 31 * result + (builtArea != null ? builtArea.hashCode() : 0);
        result = 31 * result + (isAddDevice != null ? isAddDevice.hashCode() : 0);
        result = 31 * result + (importDeviceNumberMoney != null ? importDeviceNumberMoney.hashCode() : 0);
        result = 31 * result + (projectSite != null ? projectSite.hashCode() : 0);
        result = 31 * result + (chinaTotalMoney != null ? chinaTotalMoney.hashCode() : 0);
        result = 31 * result + (nodeCode != null ? nodeCode.hashCode() : 0);
        result = 31 * result + (validityFlag != null ? validityFlag.hashCode() : 0);
        result = 31 * result + (sourceTimestamp != null ? sourceTimestamp.hashCode() : 0);
        result = 31 * result + (syncTime != null ? syncTime.hashCode() : 0);
        result = 31 * result + (syncState != null ? syncState.hashCode() : 0);
        return result;
    }
}
