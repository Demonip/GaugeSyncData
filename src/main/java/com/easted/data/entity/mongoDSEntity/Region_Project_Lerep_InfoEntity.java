package com.easted.data.entity.mongoDSEntity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by admin on 2017/10/10.
 */
@Document(collection = "REGION_PROJECT_LEREP_INFO")
public class Region_Project_Lerep_InfoEntity {

    @Id
    @Field("_id")
    private String id;
    @Field("ENTERPRISE_ID")
    private String enterprise_id;
    @Field("PROJECT_CODE")
    private String project_code;
    @Field("ENTERPRISE_NAME")
    private String enterprise_name;
    @Field("LEREP_CERTTYPE")
    private String lerep_certtype;
    @Field("LEREP_CERTNO")
    private String lerep_certno;
    @Field("CONTACT_NAME")
    private String contact_name;
    @Field("CONTACT_TEL")
    private String contact_tel;
    @Field("CONTACT_EMAIL")
    private String contact_email;
    @Field("ENTERPRISE_PLACE")
    private String enterprise_place;
    @Field("ENTERPRISE_NATURE")
    private String enterprise_nature;
    @Field("CHINA_FOREIGN_SHARE_RATIO")
    private String china_foreign_share_ratio;
    @Field("BUSINESS_SCOPE")
    private String business_scope;
    @Field("CONTACT_PHONE")
    private String contact_phone;
    @Field("CONTACT_FAX")
    private String contact_fax;
    @Field("CORRESPONDENCE_ADDRESS")
    private String correspondence_address;
    @Field("NODE_CODE")
    private String node_code;
    @Field("VALIDITY_FLAG")
    private String validity_flag;
    @Field("SOURCE_TIMESTAMP")
    private String source_timestamp;
    @Field("SYNC_TIME")
    private String sync_time;
    @Field("SYNC_STATE")
    private String sync_state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterprise_id() {
        return enterprise_id;
    }

    public void setEnterprise_id(String enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }

    public String getEnterprise_name() {
        return enterprise_name;
    }

    public void setEnterprise_name(String enterprise_name) {
        this.enterprise_name = enterprise_name;
    }

    public String getLerep_certtype() {
        return lerep_certtype;
    }

    public void setLerep_certtype(String lerep_certtype) {
        this.lerep_certtype = lerep_certtype;
    }

    public String getLerep_certno() {
        return lerep_certno;
    }

    public void setLerep_certno(String lerep_certno) {
        this.lerep_certno = lerep_certno;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_tel() {
        return contact_tel;
    }

    public void setContact_tel(String contact_tel) {
        this.contact_tel = contact_tel;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getEnterprise_place() {
        return enterprise_place;
    }

    public void setEnterprise_place(String enterprise_place) {
        this.enterprise_place = enterprise_place;
    }

    public String getEnterprise_nature() {
        return enterprise_nature;
    }

    public void setEnterprise_nature(String enterprise_nature) {
        this.enterprise_nature = enterprise_nature;
    }

    public String getChina_foreign_share_ratio() {
        return china_foreign_share_ratio;
    }

    public void setChina_foreign_share_ratio(String china_foreign_share_ratio) {
        this.china_foreign_share_ratio = china_foreign_share_ratio;
    }

    public String getBusiness_scope() {
        return business_scope;
    }

    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_fax() {
        return contact_fax;
    }

    public void setContact_fax(String contact_fax) {
        this.contact_fax = contact_fax;
    }

    public String getCorrespondence_address() {
        return correspondence_address;
    }

    public void setCorrespondence_address(String correspondence_address) {
        this.correspondence_address = correspondence_address;
    }

    public String getNode_code() {
        return node_code;
    }

    public void setNode_code(String node_code) {
        this.node_code = node_code;
    }

    public String getValidity_flag() {
        return validity_flag;
    }

    public void setValidity_flag(String validity_flag) {
        this.validity_flag = validity_flag;
    }

    public String getSource_timestamp() {
        return source_timestamp;
    }

    public void setSource_timestamp(String source_timestamp) {
        this.source_timestamp = source_timestamp;
    }

    public String getSync_time() {
        return sync_time;
    }

    public void setSync_time(String sync_time) {
        this.sync_time = sync_time;
    }

    public String getSync_state() {
        return sync_state;
    }

    public void setSync_state(String sync_state) {
        this.sync_state = sync_state;
    }
    
}

