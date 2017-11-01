package com.easted.data.entity.oracleDSEntity;

import javax.persistence.*;

/**
 * Created by admin on 2017/10/10.
 */
@Entity
@Table(name = "PROJECTCLASSINFO", schema = "DGHY", catalog = "")
public class ProjectclassinfoEntity {
    @Id
    private String projectCode;
    private String projectName;
    private String xmflsxxm;
    private String xmflphqgzxm;
    private String xmflzyysntzxm;
    private String xmflzxjsjjsjzjxm;
    private String xmfldfzfxzzqzjxm;
    private String xmflzftzlxm;
    private String xmflqytzlxm;
    private String xmflszfjdlrxm;

    @Basic
    @Column(name = "PROJECT_CODE")
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
    @Column(name = "XMFLSXXM")
    public String getXmflsxxm() {
        return xmflsxxm;
    }

    public void setXmflsxxm(String xmflsxxm) {
        this.xmflsxxm = xmflsxxm;
    }

    @Basic
    @Column(name = "XMFLPHQGZXM")
    public String getXmflphqgzxm() {
        return xmflphqgzxm;
    }

    public void setXmflphqgzxm(String xmflphqgzxm) {
        this.xmflphqgzxm = xmflphqgzxm;
    }

    @Basic
    @Column(name = "XMFLZYYSNTZXM")
    public String getXmflzyysntzxm() {
        return xmflzyysntzxm;
    }

    public void setXmflzyysntzxm(String xmflzyysntzxm) {
        this.xmflzyysntzxm = xmflzyysntzxm;
    }

    @Basic
    @Column(name = "XMFLZXJSJJSJZJXM")
    public String getXmflzxjsjjsjzjxm() {
        return xmflzxjsjjsjzjxm;
    }

    public void setXmflzxjsjjsjzjxm(String xmflzxjsjjsjzjxm) {
        this.xmflzxjsjjsjzjxm = xmflzxjsjjsjzjxm;
    }

    @Basic
    @Column(name = "XMFLDFZFXZZQZJXM")
    public String getXmfldfzfxzzqzjxm() {
        return xmfldfzfxzzqzjxm;
    }

    public void setXmfldfzfxzzqzjxm(String xmfldfzfxzzqzjxm) {
        this.xmfldfzfxzzqzjxm = xmfldfzfxzzqzjxm;
    }

    @Basic
    @Column(name = "XMFLZFTZLXM")
    public String getXmflzftzlxm() {
        return xmflzftzlxm;
    }

    public void setXmflzftzlxm(String xmflzftzlxm) {
        this.xmflzftzlxm = xmflzftzlxm;
    }

    @Basic
    @Column(name = "XMFLQYTZLXM")
    public String getXmflqytzlxm() {
        return xmflqytzlxm;
    }

    public void setXmflqytzlxm(String xmflqytzlxm) {
        this.xmflqytzlxm = xmflqytzlxm;
    }

    @Basic
    @Column(name = "XMFLSZFJDLRXM")
    public String getXmflszfjdlrxm() {
        return xmflszfjdlrxm;
    }

    public void setXmflszfjdlrxm(String xmflszfjdlrxm) {
        this.xmflszfjdlrxm = xmflszfjdlrxm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectclassinfoEntity that = (ProjectclassinfoEntity) o;

        if (projectCode != null ? !projectCode.equals(that.projectCode) : that.projectCode != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (xmflsxxm != null ? !xmflsxxm.equals(that.xmflsxxm) : that.xmflsxxm != null) return false;
        if (xmflphqgzxm != null ? !xmflphqgzxm.equals(that.xmflphqgzxm) : that.xmflphqgzxm != null) return false;
        if (xmflzyysntzxm != null ? !xmflzyysntzxm.equals(that.xmflzyysntzxm) : that.xmflzyysntzxm != null)
            return false;
        if (xmflzxjsjjsjzjxm != null ? !xmflzxjsjjsjzjxm.equals(that.xmflzxjsjjsjzjxm) : that.xmflzxjsjjsjzjxm != null)
            return false;
        if (xmfldfzfxzzqzjxm != null ? !xmfldfzfxzzqzjxm.equals(that.xmfldfzfxzzqzjxm) : that.xmfldfzfxzzqzjxm != null)
            return false;
        if (xmflzftzlxm != null ? !xmflzftzlxm.equals(that.xmflzftzlxm) : that.xmflzftzlxm != null) return false;
        if (xmflqytzlxm != null ? !xmflqytzlxm.equals(that.xmflqytzlxm) : that.xmflqytzlxm != null) return false;
        if (xmflszfjdlrxm != null ? !xmflszfjdlrxm.equals(that.xmflszfjdlrxm) : that.xmflszfjdlrxm != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectCode != null ? projectCode.hashCode() : 0;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (xmflsxxm != null ? xmflsxxm.hashCode() : 0);
        result = 31 * result + (xmflphqgzxm != null ? xmflphqgzxm.hashCode() : 0);
        result = 31 * result + (xmflzyysntzxm != null ? xmflzyysntzxm.hashCode() : 0);
        result = 31 * result + (xmflzxjsjjsjzjxm != null ? xmflzxjsjjsjzjxm.hashCode() : 0);
        result = 31 * result + (xmfldfzfxzzqzjxm != null ? xmfldfzfxzzqzjxm.hashCode() : 0);
        result = 31 * result + (xmflzftzlxm != null ? xmflzftzlxm.hashCode() : 0);
        result = 31 * result + (xmflqytzlxm != null ? xmflqytzlxm.hashCode() : 0);
        result = 31 * result + (xmflszfjdlrxm != null ? xmflszfjdlrxm.hashCode() : 0);
        return result;
    }
}
