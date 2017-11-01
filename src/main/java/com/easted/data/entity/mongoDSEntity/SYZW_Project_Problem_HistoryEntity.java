package com.easted.data.entity.mongoDSEntity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;

/**
 * Created by admin on 2017/10/10.
 */
@Document(collection = "SYZW_PROJECT_PROBLEM_HISTORY")
public class SYZW_Project_Problem_HistoryEntity {
    @Id
    @Field("_id")
    private String id;
    @Field("code")
    private String code;
    private String dealtime;
    @Field("insertTime")
    private String inserttime;
    @Field("status")
    private int status;
    private String suggest;
    @Field("title")
    private String title;
    @Field("message")
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDealtime() {
        return dealtime;
    }

    public void setDealtime(String dealtime) {
        this.dealtime = dealtime;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SYZW_Project_Problem_HistoryEntity () {}
}
