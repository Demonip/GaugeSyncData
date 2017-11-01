package com.easted.data.entity.mongoDSEntity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.ArrayList;

/**
 * 全量同步
 * Created by admin on 2017/10/10.
 */
@Document(collection = "SYZW_PROJECT_ONE_TABLE_INFO")
public class SYZW_Project_One_Table_InfoEntity {

    @Id
    @Field("_id")
    private String id;
    @Field("code")
    private String code;
    @Field("xmmc")
    private String xmmc;
    @Field("XMFLSXXM")
    private String xmflsxxm;
    @Field("XMFLPHQGZXM")
    private String xmflphqgzxm;
    @Field("XMFLZYYSNTZXM")
    private String xmflzyysntzxm;
    @Field("XMFLZXJSJJSJZJXM")
    private String  xmflzxjsjjsjzjxm;
    @Field("XMFLDFZFXZZQZJXM")
    private String xmfldfzfxzzqzjxm;
    @Field("XMFLZFTZLXM")
    private String xmflzftzlxm;
    @Field("XMFLQYTZLXM")
    private String xmflqytzlxm;
    @Field("XMFLSZFJDLRXM")
    private String xmflszfjdlrxm;
    @Field("infolist")
    private ArrayList infolist;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList getInfolist() {
        return infolist;
    }

    public void setInfolist(ArrayList infolist) {
        this.infolist = infolist;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getXmflsxxm() {
        return xmflsxxm;
    }

    public void setXmflsxxm(String xmflsxxm) {
        this.xmflsxxm = xmflsxxm;
    }

    public String getXmflphqgzxm() {
        return xmflphqgzxm;
    }

    public void setXmflphqgzxm(String xmflphqgzxm) {
        this.xmflphqgzxm = xmflphqgzxm;
    }

    public String getXmflzyysntzxm() {
        return xmflzyysntzxm;
    }

    public void setXmflzyysntzxm(String xmflzyysntzxm) {
        this.xmflzyysntzxm = xmflzyysntzxm;
    }

    public String getXmflzxjsjjsjzjxm() {
        return xmflzxjsjjsjzjxm;
    }

    public void setXmflzxjsjjsjzjxm(String xmflzxjsjjsjzjxm) {
        this.xmflzxjsjjsjzjxm = xmflzxjsjjsjzjxm;
    }

    public String getXmfldfzfxzzqzjxm() {
        return xmfldfzfxzzqzjxm;
    }

    public void setXmfldfzfxzzqzjxm(String xmfldfzfxzzqzjxm) {
        this.xmfldfzfxzzqzjxm = xmfldfzfxzzqzjxm;
    }

    public String getXmflzftzlxm() {
        return xmflzftzlxm;
    }

    public void setXmflzftzlxm(String xmflzftzlxm) {
        this.xmflzftzlxm = xmflzftzlxm;
    }

    public String getXmflqytzlxm() {
        return xmflqytzlxm;
    }

    public void setXmflqytzlxm(String xmflqytzlxm) {
        this.xmflqytzlxm = xmflqytzlxm;
    }

    public String getXmflszfjdlrxm() {
        return xmflszfjdlrxm;
    }

    public void setXmflszfjdlrxm(String xmflszfjdlrxm) {
        this.xmflszfjdlrxm = xmflszfjdlrxm;
    }

    public SYZW_Project_One_Table_InfoEntity () {

    }
}
