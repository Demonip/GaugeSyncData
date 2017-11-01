package com.easted.data.entity.oracleDSEntity;

import javax.persistence.*;
import java.sql.Date;


/**
 * Created by admin on 2017/10/10.
 */
@Entity
@Table(name = "PROCESSINFO", schema = "DGHY", catalog = "")
public class ProcessinfoEntity {
    @Id
    private String id;
    private String code;
    private String dealtime;
    private Date inserttime;
    private String message;
    private int status;
    private String suggest;
    private String title;

    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "DEALTIME")
    public String getDealtime() {
        return dealtime;
    }

    public void setDealtime(String dealtime) {
        this.dealtime = dealtime;
    }

    @Basic
    @Column(name = "INSERTTIME")
    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    @Basic
    @Column(name = "MESSAGE")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "STATUS")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "SUGGEST")
    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProcessinfoEntity() {}
}
