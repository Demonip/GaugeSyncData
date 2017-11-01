package com.easted.data.entity.mongoDSEntity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

/**
 * Created by admin on 2017/10/10.
 */
@Document(collection = "SYZW_PROJECT_SERVICE_HISTORY")
public class SYZW_Project_Service_HistoryEntity {

    @Id
    @Field("_id")
    private String id;
    @Field("insertTime")
    private String inserttime;
    @Field("message")
    private String message;
    @Field("org")
    private String org;
    @Field("code")
    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SYZW_Project_Service_HistoryEntity () {}
}
