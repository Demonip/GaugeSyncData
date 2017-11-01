package com.easted.data.entity.oracleDSEntity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by admin on 2017/10/10.
 */
@Entity
@Table(name = "GREENCHANNEL_BJ_INFO", schema = "DGHY", catalog = "")
public class GreenchannelBjInfoEntity {
    @Id
    private String id;
    private String sblsh;
    private String projectCode;
    private String itemCode;
    private String bjYqts;
    private String currentState;
    private Time dealTime;
    private String tbcxIsnow;
    private Time slTime;
    private Time planFinishDate;
    private String bjCnts;
    private String bjSyts;
    private String projectName;
    private String commanyName;
    private String gsjName;
    private String sxName;

    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SBLSH")
    public String getSblsh() {
        return sblsh;
    }

    public void setSblsh(String sblsh) {
        this.sblsh = sblsh;
    }

    @Basic
    @Column(name = "PROJECT_CODE")
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Basic
    @Column(name = "ITEM_CODE")
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Basic
    @Column(name = "BJ_YQTS")
    public String getBjYqts() {
        return bjYqts;
    }

    public void setBjYqts(String bjYqts) {
        this.bjYqts = bjYqts;
    }

    @Basic
    @Column(name = "CURRENT_STATE")
    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    @Basic
    @Column(name = "DEAL_TIME")
    public Time getDealTime() {
        return dealTime;
    }

    public void setDealTime(Time dealTime) {
        this.dealTime = dealTime;
    }

    @Basic
    @Column(name = "TBCX_ISNOW")
    public String getTbcxIsnow() {
        return tbcxIsnow;
    }

    public void setTbcxIsnow(String tbcxIsnow) {
        this.tbcxIsnow = tbcxIsnow;
    }

    @Basic
    @Column(name = "SL_TIME")
    public Time getSlTime() {
        return slTime;
    }

    public void setSlTime(Time slTime) {
        this.slTime = slTime;
    }

    @Basic
    @Column(name = "PLAN_FINISH_DATE")
    public Time getPlanFinishDate() {
        return planFinishDate;
    }

    public void setPlanFinishDate(Time planFinishDate) {
        this.planFinishDate = planFinishDate;
    }

    @Basic
    @Column(name = "BJ_CNTS")
    public String getBjCnts() {
        return bjCnts;
    }

    public void setBjCnts(String bjCnts) {
        this.bjCnts = bjCnts;
    }

    @Basic
    @Column(name = "BJ_SYTS")
    public String getBjSyts() {
        return bjSyts;
    }

    public void setBjSyts(String bjSyts) {
        this.bjSyts = bjSyts;
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
    @Column(name = "COMMANY_NAME")
    public String getCommanyName() {
        return commanyName;
    }

    public void setCommanyName(String commanyName) {
        this.commanyName = commanyName;
    }

    @Basic
    @Column(name = "GSJ_NAME")
    public String getGsjName() {
        return gsjName;
    }

    public void setGsjName(String gsjName) {
        this.gsjName = gsjName;
    }

    @Basic
    @Column(name = "SX_NAME")
    public String getSxName() {
        return sxName;
    }

    public void setSxName(String sxName) {
        this.sxName = sxName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreenchannelBjInfoEntity that = (GreenchannelBjInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sblsh != null ? !sblsh.equals(that.sblsh) : that.sblsh != null) return false;
        if (projectCode != null ? !projectCode.equals(that.projectCode) : that.projectCode != null) return false;
        if (itemCode != null ? !itemCode.equals(that.itemCode) : that.itemCode != null) return false;
        if (bjYqts != null ? !bjYqts.equals(that.bjYqts) : that.bjYqts != null) return false;
        if (currentState != null ? !currentState.equals(that.currentState) : that.currentState != null) return false;
        if (dealTime != null ? !dealTime.equals(that.dealTime) : that.dealTime != null) return false;
        if (tbcxIsnow != null ? !tbcxIsnow.equals(that.tbcxIsnow) : that.tbcxIsnow != null) return false;
        if (slTime != null ? !slTime.equals(that.slTime) : that.slTime != null) return false;
        if (planFinishDate != null ? !planFinishDate.equals(that.planFinishDate) : that.planFinishDate != null)
            return false;
        if (bjCnts != null ? !bjCnts.equals(that.bjCnts) : that.bjCnts != null) return false;
        if (bjSyts != null ? !bjSyts.equals(that.bjSyts) : that.bjSyts != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (commanyName != null ? !commanyName.equals(that.commanyName) : that.commanyName != null) return false;
        if (gsjName != null ? !gsjName.equals(that.gsjName) : that.gsjName != null) return false;
        if (sxName != null ? !sxName.equals(that.sxName) : that.sxName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sblsh != null ? sblsh.hashCode() : 0);
        result = 31 * result + (projectCode != null ? projectCode.hashCode() : 0);
        result = 31 * result + (itemCode != null ? itemCode.hashCode() : 0);
        result = 31 * result + (bjYqts != null ? bjYqts.hashCode() : 0);
        result = 31 * result + (currentState != null ? currentState.hashCode() : 0);
        result = 31 * result + (dealTime != null ? dealTime.hashCode() : 0);
        result = 31 * result + (tbcxIsnow != null ? tbcxIsnow.hashCode() : 0);
        result = 31 * result + (slTime != null ? slTime.hashCode() : 0);
        result = 31 * result + (planFinishDate != null ? planFinishDate.hashCode() : 0);
        result = 31 * result + (bjCnts != null ? bjCnts.hashCode() : 0);
        result = 31 * result + (bjSyts != null ? bjSyts.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (commanyName != null ? commanyName.hashCode() : 0);
        result = 31 * result + (gsjName != null ? gsjName.hashCode() : 0);
        result = 31 * result + (sxName != null ? sxName.hashCode() : 0);
        return result;
    }
}
